
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
    private String subject; 


    /**
     * Constructor for objects of class MailItem
     */
    public MailItem(String from, String to, String message, String subject)
    {
        // initialise instance variables
        this.from = from;
        this.to = to;
        this.message = message;
        this.subject = subject;
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
    // instance variables - replace the example below with your own
     System.out.println("From: " + from);
     System.out.println("To: " + to);
     System.out.println("Message: " + message);
    }
    
    
    
}
