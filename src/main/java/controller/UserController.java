package controller;

import client.Client;
import dao.CustomerDAO;
import exceptions.UserIDNotValidException;
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

        registeredUsers = null;
        //this.getUser(registeredUsers);
    }

    public boolean identifyUser(int userID, String password){

        //We create an instance of user with the info

        boolean identifiedUser=false;

        try{
            User userToValidate= new User(userID, password);
            if(registeredUsers.contains(userToValidate)){

                identifiedUser= true;
            }

        }catch(UserIDNotValidException uIDnve){
            System.out.println(uIDnve.getError());
        }

        return identifiedUser;
    }

   public void registerUser(int userID, String password){

       //We create an instance of user with the info

       try {
           User userToRegister = new User(userID, password);
           Client.newUser(userToRegister);
       }catch(UserIDNotValidException uIDnve){
           System.out.println(uIDnve.getError());
       }
   }

   //public void getRegisteredUsers(){ CustomerDAO.getClientes(registeredUsers);}

    public void getUser(ArrayList<User> lista) {
        CustomerDAO.getClientes(lista);
    }

    public void saveUser(User user){ CustomerDAO.saveCliente(user);}

}
