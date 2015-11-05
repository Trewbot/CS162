package cs162.lec11;
public class TestPersonWithContacts {
	
	public static void main(String[] args)
	{
		//Create a PersonWithContacts
		PersonWithContacts me = new PersonWithContacts("Ruxin", "Dai");
		
		//Add several contacts to the person
		me.addContacts("Ahmad");
		me.addContacts("Hossein");
		me.addContacts("Tony");
		me.addContacts("Arpan");
		me.addContacts("Jacob");
		me.addContacts("Mary-Alice");
		
		
		//Print all the contacts
		me.printAllContacts();
		System.out.println();
		
		//Search contact
		String target = "Tony";
		int searchResult = me.searchContact(target);
		if(searchResult == -1)
			System.out.println("Search " + target + " fails!");
		else
			System.out.println(target + " positions at " + 
								(searchResult + 1) + " of the contacts." );
		System.out.println();
		
		target = "Jack";
		searchResult = me.searchContact(target);
		if(searchResult == -1)
			System.out.println("Search " + target + " fails!");
		else
			System.out.println(target + " positions at " + 
								(searchResult + 1) + " of the contacts." );
		System.out.println();
		
		//Test toString method
		System.out.println(me);
	}

}
