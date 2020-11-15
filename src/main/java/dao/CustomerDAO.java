package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import exceptions.UserIDNotValidException;
import model.User;

public class CustomerDAO {



    public static void getClientes(ArrayList<User> lista) {
        Connection con=ConnectionDAO.getInstance().getConnection();
        try (PreparedStatement pst = con.prepareStatement("SELECT id,password FROM users");
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                lista.add(new User(rs.getInt(1),rs.getString(2)));
            }

        } catch (SQLException | UserIDNotValidException ex) {

            System.out.println(ex.getMessage());
        }
    }

    public static void saveCliente(User user){
        Connection con=ConnectionDAO.getInstance().getConnection();
        try{
            String sql = "INSERT INTO users(id,password)"+"VALUES(?,?)";

            PreparedStatement ps= con.prepareStatement(sql);

            ps.setInt(1,user.getID());
            ps.setString(2,user.getPassword());

            int retorno = ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {

            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {


        ArrayList<User> lista=new ArrayList<User>();
        CustomerDAO.getClientes(lista);


        for (User customer : lista) {
            System.out.println("He leído el id: "+customer.getID()+" con contrasena: "+customer.getPassword());
        }


    }

}