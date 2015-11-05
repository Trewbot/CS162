package cs162.lec11;
import java.io.*;
import java.util.Scanner;
public class TestPersonWithContacts2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new FileReader("personel.txt"));
		String line, firstName, lastName;
		String[] info;
		PersonWithContacts[] persons = new PersonWithContacts[20];
		int numOfPerson = 0;
		while(in.hasNextLine()){
			line = in.nextLine();
			info = line.split(" ");
			firstName = info[0];
			lastName = info[1];
			PersonWithContacts pwc = new PersonWithContacts(firstName, lastName);
			for(int i = 2; i < info.length; i++)
				pwc.addContacts(info[i]);
			persons[numOfPerson] = pwc;
			numOfPerson++;
		}
		int sumContacts = 0;
		for(int i = 0; i < numOfPerson; i++)
			sumContacts += persons[i].getNumOfContacts();
		double average = (double)sumContacts / numOfPerson;
		System.out.println("The average contacts number is: " + average);
		in.close();
	}
}