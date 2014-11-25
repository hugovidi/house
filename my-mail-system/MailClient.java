
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
    public MailClient(MailServer newServer, String newUser)
    {
        // initialise instance variables
        server = newServer;
        user = newUser;
    }

   
    public MailItem getNextMailItem()
    {
        return server.getNextMailItem(user);
    }
    
    public void printNextmailItem()
    {
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
    
    public void sendMailItem(String to, String message)
    {
        MailItem item = new MailItem(user, to, message);
        server.post(item);
    }
}
