public class PilaException extends Exception{

    public PilaException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public String toString() {
        return this.getMessage();
    }
}
