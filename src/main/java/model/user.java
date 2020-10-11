package model;

/**
 * Clase creada para identificar a los usuarios de la aplicación
 *
 * @author Alvaro Prado
 */
public class User {

    //Attributes

    private int userID; //identificador unico de 8 digitos
    private String password;

    public User(int userID, String password){

        this.userID=userID;
        this.password=password;
    }

    //Methods

    void setID(int userID){
        this.userID=userID;
    }

    void setPassword(String password){
        this.password=password;
    }

   public long getID(){
        return this.userID;
    }

    public String getPassword(){
        return this.password;
    }

    /**
     *
     * @param o object a comparar
     * @return true si ambos usuarios comparten ID y constraseña
     */
    @Override
    public boolean equals(Object o) {

        if (o instanceof User) {
            //downcasting
            User u=(User)o;

            if(u.getID()==this.getID() && u.getPassword().equals(this.getPassword())) {
                return true;

            }else {
                return false;
            }

        } else

            return false;

        }
    }



