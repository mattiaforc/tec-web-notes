package it.unibo.tw.db;

public class PersistenceException extends Exception {

    private static final long serialVersionUID = -3835068319580102263L;

    public PersistenceException(String msg){
        super(msg);
    }
    
    public PersistenceException(Throwable e) {
    	super(e);
	}
    
    public PersistenceException(String message, Throwable e) {
    	super(message, e);
	}
    
}
