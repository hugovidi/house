
/**
 * Write a description of class MailClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailClient
{
    // instance variables - replace the example below with your own
    private MailServer server;
    private String user;

    /**
     * Constructor for objects of class MailClient
     */
    public MailClient(MailServer server, String user)
    {
        // initialise instance variables
        this.server = server;
        this.user = user;
        
    }

   
    public MailItem getNextMailItem()
    {
        return server.getNextMailItem(user);
    }
    
    public void printNextMailItem()
    {
       // revisar debido a dudas
        MailItem item = server.getNextMailItem(user);
            if(item == null) 
            {
                System.out.println("No new mail. ");
            }
            else
            {
                item.print();
            }
    }
    
    public void sendMailItem(String to, String message, String subject)
    {
        MailItem item = new MailItem(user, to, message, subject);
        server.post(item);
    }
}
