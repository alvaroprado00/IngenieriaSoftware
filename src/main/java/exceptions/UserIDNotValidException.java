package exceptions;

public class UserIDNotValidException extends Exception{

    String error;

    public UserIDNotValidException(String error){
        this.error=error;

    }

    public String getError(){
        return this.error;
    }
}
