package controller;

import model.user;

import java.util.ArrayList;

/**
 * Clase creada para separar la funcionalidad de la ventana y de la identificación de usuarios
 *
 * @author Alvaro Prado
 */
public class userController {

    //Attributes

    public ArrayList<user> registeredUsers;
    public userIO userReader;

    //Constructor

    public userController(){
        registeredUsers= new ArrayList<>();
        userReader=new userIO();
        this.getRegisteredUsers();
    }

    public boolean identifyUser(int userID, String password){

        //We create an instance of user with the info

        user userToValidate= new user(userID, password);

        if(registeredUsers.contains(userToValidate)){

            return true;
        }else{
            return false;
        }


    }

    public void getRegisteredUsers(){
        registeredUsers=userReader.getRegisteredUsers();
    }
}
