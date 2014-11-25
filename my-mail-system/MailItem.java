
/**
 * Write a description of class MailItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailItem
{
    // instance variables - replace the example below with your own
    private String from;
    private String to;
    private String message;


    /**
     * Constructor for objects of class MailItem
     */
    public MailItem(String newFrom, String newTo, String newMessage)
    {
        // initialise instance variables
        from = newFrom;
        to = newTo;
        message = newMessage;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getFrom()
    {
        return from;
    }
    
    
    public String getTo()
    {
     return to;
    }
    
    public String getMessage()
    {
     return message;
    }
    
    public void print()
    {
     System.out.println("From: " + from);
     System.out.println("To: " + to);
     System.out.println("Message: " + message);
    }
}
