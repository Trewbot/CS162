package cs162.lec11;

public class PersonWithContacts {
	static final int MAX_CONTACTS = 50;
	private String firstName, lastName;
	private String[] contacts;
	private int numOfContacts;
	public PersonWithContacts(String first, String last){
		firstName = first;
		lastName = last;
		contacts = new String[MAX_CONTACTS];
	}
	public boolean addContacts(String contactName){
		if(numOfContacts == MAX_CONTACTS) return false;
		contacts[numOfContacts] = contactName;
		numOfContacts++;
		return true;
	}
	public void printAllContacts(){
		for(int i = 0; i < numOfContacts; i++)
			System.out.println(contacts[numOfContacts]);
	}
	public int searchContact(String tarContact){
		for(int i = 0; i < numOfContacts; i++)
			if(tarContact.equals(contacts[i])) return i;
		return -1;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public int getNumOfContacts(){
		return numOfContacts;
	}
	public String toString(){
		return firstName + " " + lastName;
	}
}
