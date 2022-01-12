package state.exception;

public class DomainException extends RuntimeException{

    //Padrão state
    public DomainException (String msg){
        super(msg);
    }
}
