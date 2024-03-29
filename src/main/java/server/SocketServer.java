package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

import controller.*;
import model.*;
import message.Message;

public class SocketServer extends Thread {
    public static final int PORT_NUMBER = 8081;

    protected Socket socket;

    private SocketServer(Socket socket) {
        this.socket = socket;
        System.out.println("New client connected from " + socket.getInetAddress().getHostAddress());
        start();
    }

    public void run() {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = socket.getInputStream();
            out = socket.getOutputStream();

            //first read the object that has been sent
            ObjectInputStream objectInputStream = new ObjectInputStream(in);
            Message mensajeIn= (Message)objectInputStream.readObject();
            //Object to return informations
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
            Message mensajeOut=new Message();
            switch (mensajeIn.getContext()) {
                case "/getCustomer":
                    UserController uc=new UserController();
                    ArrayList<User> lista=new ArrayList<User>();
                    uc.getUser(lista);
                    mensajeOut.setContext("/getCustomerResponse");
                    HashMap<String,Object> session=new HashMap<String, Object>();
                    session.put("User",lista);
                    mensajeOut.setSession(session);
                    objectOutputStream.writeObject(mensajeOut);
                    break;

                case "/newCustomer":
                    UserController uc2 = new UserController();
                    uc2.saveUser((User)mensajeIn.getSession().get("/newCustomer"));
                    mensajeOut.setContext("/newCustomerResponse");
                    mensajeOut.setSession(null);
                    objectOutputStream.writeObject(mensajeOut);
                    break;

                case "/getPala":
                    PalaController pc=new PalaController();
                    ArrayList<Pala> list=new ArrayList<Pala>();
                    pc.getPala(list);
                    mensajeOut.setContext("/getPalaResponse");
                    HashMap<String,Object> sessionGetPala=new HashMap<String, Object>();
                    sessionGetPala.put("Pala",list);
                    mensajeOut.setSession(sessionGetPala);
                    objectOutputStream.writeObject(mensajeOut);

                    break;

                case "/savePala":
                    PalaController pc2 =new PalaController();
                    pc2.savePala((Pala)mensajeIn.getSession().get("/savePala"));
                    mensajeOut.setContext("/savePalaResponse");
                    mensajeOut.setSession(null);
                    objectOutputStream.writeObject(mensajeOut);
                    break;


                default:
                    System.out.println("\nParámetro no encontrado");
                    break;
            }

            //Lógica del controlador
            //System.out.println("\n1.- He leído: "+mensaje.getContext());
            //System.out.println("\n2.- He leído: "+(String)mensaje.getSession().get("Nombre"));



            //Prueba para esperar
		    /*try {
		    	System.out.println("Me duermo");
				Thread.sleep(15000);
				System.out.println("Me levanto");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
            // create an object output stream from the output stream so we can send an object through it
			/*ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);

			//Create the object to send
			String cadena=((String)mensaje.getSession().get("Nombre"));
			cadena+=" añado información";
			mensaje.getSession().put("Nombre", cadena);
			//System.out.println("\n3.- He leído: "+(String)mensaje.getSession().get("Nombre"));
			objectOutputStream.writeObject(mensaje);*
			*/

        } catch (IOException ex) {
            System.out.println("Unable to get streams from client");
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
                socket.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void serverStartsListening(){
        System.out.println("SocketServer Example");
        ServerSocket server = null;
        try {
            server = new ServerSocket(PORT_NUMBER);
            while (true) {
                /**
                 * create a new {@link SocketServer} object for each connection
                 * this will allow multiple client connections
                 */
                new SocketServer(server.accept());
            }
        } catch (IOException ex) {
            System.out.println("Unable to start server.");
        } finally {
            try {
                if (server != null)
                    server.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}