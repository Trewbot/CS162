package cs162.lec11;
public class TestPersonWithContacts {
	public static void main(String[] args){
		PersonWithContacts me = new PersonWithContacts("Ruxin", "Dai");
			me.addContacts("Ahmad");
			me.addContacts("Hossein");
			me.addContacts("Tony");
			me.addContacts("Arpan");
			me.addContacts("Jacob");
			me.addContacts("Mary-Alice");
		me.printAllContacts();
		System.out.print("\n");
		String target = "Tony";
		int res;
		System.out.println(((res = me.searchContact(target)) < 0
				? "Search " + target + " fails!"
				: target + " positions at " +  (res + 1) + " of the contacts."
		)+ "\n");
		target = "Jack";
		System.out.println(((res = me.searchContact(target)) < 0
				? "Search " + target + " fails!"
				: target + " positions at " +  (res + 1) + " of the contacts."
		)+ "\n");
		System.out.println(me);
	}
}
