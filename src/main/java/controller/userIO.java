package controller;

import model.user;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *  Clase utilizada para leer los usuarios de un fichero .csv y organizarlos en un ArrayList.
 *  Será sustituida por otra clase para leer de una base de datos
 *
 *  @author Alvaro Prado
 */

public class userIO {

    //Constants

    private static final String SEPARATOR = ",";

    //Atributes

    ArrayList<user> registeredUsers;

    public userIO() {
        registeredUsers = new ArrayList<>();
    }

    //Methods

    public ArrayList<user> getRegisteredUsers() {

        BufferedReader br = null;

        try {

            //System.out.println(new File(".").getAbsolutePath());
            //Nos sirve para ver la direccion desde la que se ejecuta el codigo y poder así definir el FileReader

            br = new BufferedReader(new FileReader("target/classes/files/users2.csv"));
            String nextLine=null;

            while ((nextLine = br.readLine()) != null) {

                String fields[]= nextLine.split(SEPARATOR);
                try{

                    int userID= Integer.parseInt(fields[0].trim());
                    String userPassword= fields[1].trim();

                    registeredUsers.add(new user(userID, userPassword));

                }catch (NumberFormatException nfe){

                    nfe.printStackTrace();
                }
            }

        } catch (IOException ioe) {

            ioe.printStackTrace();
        } finally {
            if (null != br) {
                try {
                    br.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }

        }
    return registeredUsers;

    }

}