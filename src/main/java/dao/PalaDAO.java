package dao;

import java.awt.*;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;

import exceptions.UserIDNotValidException;
import model.Pala;

public class PalaDAO {


    public static void getPalas(ArrayList<Pala> lista) {
        Connection con = ConnectionDAO.getInstance().getConnection();
        try (PreparedStatement pst = con.prepareStatement("SELECT * FROM users");
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                /*InputStream is = rs.getBinaryStream(9);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                byte[] buffer = new byte[4096];
                int bytesRead = -1;

                while((bytesRead = is.read(buffer)) != -1){
                    baos.write(buffer, 0 , bytesRead);
                }

                byte[] imageBytes = baos.toByteArray();*/
                byte[] imageBytes = rs.getBytes(9);
                String base64Image = Base64.getEncoder().encodeToString(imageBytes);

                //is.close();
                //baos.close();

                lista.add(new Pala(rs.getString(1), rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getDouble(8),base64Image));
            }

        } catch (SQLException /*| IOException*/ ex) {

            System.out.println(ex.getMessage());
        }
    }

    public static void savePala(Pala pala){
        Connection con = ConnectionDAO.getInstance().getConnection();
        try{

            String base64Image = pala.getBase64Image();
            byte[] imageBytes = Base64.getDecoder().decode(base64Image);


            /*File file = new File(pala.getRuta());
            int longitud = (int)file.length();
            FileInputStream fis = new FileInputStream(file);*/

            String sql="INSERT INTO palas(nombre,forma,potencia,control,salida,manejabilidad,puntoDulce,precio,foto)"+"VALUES(?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps= con.prepareStatement(sql);

            ps.setString(1,pala.getNombre());
            ps.setString(2,pala.getForma());
            ps.setInt(3,pala.getPotencia());
            ps.setInt(4,pala.getControl());
            ps.setInt(5,pala.getSalida());
            ps.setInt(6,pala.getManejabilidad());
            ps.setInt(7,pala.getPuntoDulce());
            ps.setDouble(8,pala.getPrecio());
            ps.setBytes(9,imageBytes);

            int retorno = ps.executeUpdate();
            ps.close();

        }catch(SQLException | NumberFormatException | HeadlessException x){
            System.out.print("exception 2 "+x);
        }
    }
}