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


    public ArrayList<User> registeredUsers;


    public UserController(){
        registeredUsers= new ArrayList<>();
    }


    public void getUser(ArrayList<User> lista) {
        CustomerDAO.getClientes(lista);
    }

    public void saveUser(User user){ CustomerDAO.saveCliente(user);}

}
