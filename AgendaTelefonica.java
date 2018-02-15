import java.util.HashMap;

/**
 * Write a description of class AgendaTelefonica here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    HashMap<String, String> agenda;

    /**
     * Constructor for objects of class AgendaTelefonica.
     */
    public AgendaTelefonica()
    {
        agenda = new HashMap<>();
    }

    /**
     * Set the name and the number of a contact.
     */
    public void enterNumber(String name, String number)
    {
        agenda.put(name, number);
    }

    /**
     * Get the number of a contact.
     */
    public String lookupNumber(String name)
    {
        String numeroDelContacto = agenda.get(name);
        return numeroDelContacto;
    }
    
    /**
     * Print all keys
     */
    public void printAllNames()
    {
        System.out.println(agenda.keySet());
    }
}
