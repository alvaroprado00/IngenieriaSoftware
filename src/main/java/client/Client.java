package client;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.log4j.Logger;

import configuration.PropertiesISW;
import model.*;
import message.Message;

public class Client {
    private static String host =  PropertiesISW.getInstance().getProperty("host");
    private static int port = Integer.parseInt(PropertiesISW.getInstance().getProperty("port"));
    final static Logger logger = Logger.getLogger(Client.class);

   /* public static void main(String args[]) {
        //Configure connections
        String host = PropertiesISW.getInstance().getProperty("host");
        int port = Integer.parseInt(PropertiesISW.getInstance().getProperty("port"));
        Logger.getRootLogger().info("Host: "+host+" port"+port);
        //Create a cliente class
        Client cliente=new Client(host, port);

        HashMap<String,Object> session=new HashMap<String, Object>();
        //session.put("/getCustomer","");

        Message mensajeEnvio=new Message();
        Message mensajeVuelta=new Message();
        mensajeEnvio.setContext("/getCustomer");
        mensajeEnvio.setSession(session);
        cliente.sent(mensajeEnvio,mensajeVuelta);


        switch (mensajeVuelta.getContext()) {
            case "/getCustomerResponse":
                ArrayList<Customer> customerList=(ArrayList<Customer>)(mensajeVuelta.getSession().get("Customer"));
                for (Customer customer : customerList) {
                    System.out.println("He leído el id: "+customer.getId()+" con nombre: "+customer.getName());
                }
                break;

            default:
                Logger.getRootLogger().info("Option not found");
                System.out.println("\nError a la vuelta");
                break;

        }
        //System.out.println("3.- En Main.- El valor devuelto es: "+((String)mensajeVuelta.getSession().get("Nombre")));
    }*/


    public static ArrayList<User> userRequest(){
        Logger.getRootLogger().info("Host: "+host+" port"+port);

        HashMap<String,Object> session=new HashMap<String, Object>();
        //session.put("/getCustomer","");

        Message mensajeEnvio=new Message();
        Message mensajeVuelta=new Message();
        mensajeEnvio.setContext("/getCustomer");
        mensajeEnvio.setSession(session);
        Client.sent(mensajeEnvio,mensajeVuelta);


        switch (mensajeVuelta.getContext()) {
            case "/getCustomerResponse":
                return (ArrayList<User>)(mensajeVuelta.getSession().get("User"));

            default:
                Logger.getRootLogger().info("Option not found");
                System.out.println("\nError a la vuelta");
                return null;

        }

    }

    public static boolean newUser(User user){

        boolean userAdded=false;

        Logger.getRootLogger().info("Host: "+host+" port"+port);

        HashMap<String,Object> session=new HashMap<String, Object>();
        session.put("/newCustomer",user);

        Message mensajeEnvio=new Message();
        Message mensajeVuelta=new Message();
        mensajeEnvio.setContext("/newCustomer");
        mensajeEnvio.setSession(session);
        Client.sent(mensajeEnvio,mensajeVuelta);


        switch (mensajeVuelta.getContext()) {
            case "/newCustomerResponse":
                System.out.println("Usuario agregado");
                userAdded=true;
                break;

            default:
                Logger.getRootLogger().info("Option not found");
                System.out.println("\nError a la vuelta");
                break;

        }

        return userAdded;
    }
    public static ArrayList<Pala> palaRequest(){

        Logger.getRootLogger().info("Host: "+host+" port"+port);

        HashMap<String,Object> session=new HashMap<String, Object>();
        //session.put("/getCustomer","");

        Message mensajeEnvio=new Message();
        Message mensajeVuelta=new Message();
        mensajeEnvio.setContext("/getPala");
        mensajeEnvio.setSession(session);
        Client.sent(mensajeEnvio,mensajeVuelta);

        switch (mensajeVuelta.getContext()) {
            case "/getPalaResponse":
                return (ArrayList<Pala>)(mensajeVuelta.getSession().get("Pala"));

            default:
                Logger.getRootLogger().info("Option not found");
                System.out.println("\nError a la vuelta");
                return null;
        }
    }
    public static void savePala(Pala pala){

        Logger.getRootLogger().info("Host: "+host+" port"+port);

        HashMap<String,Object> session=new HashMap<String, Object>();
        session.put("/savePala",pala);

        Message mensajeEnvio=new Message();
        Message mensajeVuelta=new Message();
        mensajeEnvio.setContext("/savePala");
        mensajeEnvio.setSession(session);
        Client.sent(mensajeEnvio,mensajeVuelta);

        switch (mensajeVuelta.getContext()) {
            case "/savePalaResponse":
                System.out.println("Pala guardada");
                break;

            default:
                Logger.getRootLogger().info("Option not found");
                System.out.println("\nError a la vuelta");
                break;
        }
    }

    public static void sent(Message messageOut, Message messageIn) {
        try {

            System.out.println("Connecting to host " + host + " on port " + port + ".");

            Socket echoSocket = null;
            OutputStream out = null;
            InputStream in = null;

            try {
                echoSocket = new Socket(host, port);
                in = echoSocket.getInputStream();
                out = echoSocket.getOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);

                //Create the objetct to send
                objectOutputStream.writeObject(messageOut);

                // create a DataInputStream so we can read data from it.
                ObjectInputStream objectInputStream = new ObjectInputStream(in);
                Message msg=(Message)objectInputStream.readObject();
                messageIn.setContext(msg.getContext());
                messageIn.setSession(msg.getSession());
		        /*System.out.println("\n1.- El valor devuelto es: "+messageIn.getContext());
		        String cadena=(String) messageIn.getSession().get("Nombre");
		        System.out.println("\n2.- La cadena devuelta es: "+cadena);*/

            } catch (UnknownHostException e) {
                System.err.println("Unknown host: " + host);
                System.exit(1);
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Unable to get streams from server");
                System.exit(1);
            }

            /** Closing all the resources */
            out.close();
            in.close();
            echoSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static boolean isUserRegistered(User userToValidate){

        boolean identified=false;

        ArrayList<User> registeredUsers= userRequest();

        Iterator<User> it= registeredUsers.iterator();

        while(it.hasNext()) {
            User userActual = it.next();
            if (userActual.equals(userToValidate)) {
                identified = true;
            }

        }

        return identified;


    }
}