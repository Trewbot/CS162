package cs162.lec11;
public class TestPersonWithContacts {
	public static void main(String[] args){
		PersonWithContacts me = new PersonWithContacts("Trevor", "Hoglund");
			me.addContacts("Real Person");
			me.addContacts("Real Person");
			me.addContacts("Real Person");
			me.addContacts("Real Person");
			me.addContacts("Real Person");
			me.addContacts("I Have Friends");
		me.printAllContacts();
		System.out.print("\n");
		String target = "Real Person";
		int res;
		System.out.println(((res = me.searchContact(target)) < 0
				? "Search \"" + target + "\" fails!"
				: "\"" + target + "\" positions at " +  (res + 1) + " of the contacts."
		)+ "\n");
		target = "Friends";
		System.out.println(((res = me.searchContact(target)) < 0
				? "Search \"" + target + "\" fails!"
				: "\"" + target + "\" positions at " +  (res + 1) + " of the contacts."
		)+ "\n");
		System.out.println(me);
	}
}
