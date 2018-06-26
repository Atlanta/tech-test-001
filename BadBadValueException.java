public class BadBadValueException extends Exception {
    public BadBadValueException(){
        super();
        System.out.println("Negative number was given");
    }
}