package controller;

import model.User;

import java.util.ArrayList;

/**
 * Clase creada para separar la funcionalidad de la ventana y de la identificación de usuarios
 *
 * @author Alvaro Prado
 */
public class UserController {

    //Attributes

    public ArrayList<User> registeredUsers;
    public UserIO userReader;

    //Constructor

    public UserController(){
        registeredUsers= new ArrayList<>();
        userReader=new UserIO();
        this.getRegisteredUsers();
    }

    public boolean identifyUser(int userID, String password){

        //We create an instance of user with the info

        User userToValidate= new User(userID, password);

        if(registeredUsers.contains(userToValidate)){

            return true;
        }else{
            return false;
        }


    }

   /* public boolean registerUser(int userID, String password){

    }
*/
    public void getRegisteredUsers(){
        registeredUsers=userReader.getRegisteredUsers();
    }
}
