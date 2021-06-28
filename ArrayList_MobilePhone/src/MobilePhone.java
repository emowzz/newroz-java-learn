import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public int findContact(Contact contact)
    {
        if (myContacts.indexOf(contact) > -1)
        {
            return myContacts.indexOf(contact);
        }
        return -1;
    }

    public int findContact(String name)
    {
        for(int i=0 ; i<myContacts.size() ; i++)
        {
            if (myContacts.get(i).getName().equals(name))
            {
                return myContacts.indexOf(i);
            }
        }
        return -1;
    }

    public boolean addNewContact(Contact contact)
    {
        if(findContact(contact) > -1)
        {
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact)
    {
        if(findContact(oldContact) > -1)
        {
            this.myContacts.set(findContact(oldContact), newContact);
            return true;
        }
        System.out.println(oldContact.getName()+", was not found.");
        System.out.println(oldContact.getName() +", was replaced with "+newContact.getName());
        return false;
    }

    public boolean removeContact(Contact contact)
    {
        if (findContact(contact) > -1)
        {
            this.myContacts.remove(contact);
            System.out.println(contact.getName()+", was deleted.");
            return true;
        }
        System.out.println(contact.getName()+", was not found.");
        return false;
    }

    public void printContacts()
    {
        System.out.println("Contact List:");
        for(int i = 0 ; i<this.myContacts.size() ; i++)
        {
            System.out.println((i+1)+". "+
                    this.myContacts.get(i).getName()+" -> "+
                    this.myContacts.get(i).getPhoneNumber());
        }
    }


    public Contact queryContact(String name)
    {
        for (int i=0 ; i<this.myContacts.size() ; i++)
        {
            if (myContacts.get(i).getName().equals(name))
            {
                return myContacts.get(i);
            }
        }
        return null;
    }






}
