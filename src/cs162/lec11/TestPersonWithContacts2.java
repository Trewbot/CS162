package cs162.lec11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
 * The following program uses an array to store a list of PersonWithContacts objects
 * The topic of "Array of objects" is optional and will not be tested
 */
public class TestPersonWithContacts2 {
	
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new FileReader("personel.txt"));
		
		String line; //store one line (a person's info) from the file
		String[] info; //store pieces of information after splitting the line
		String firstName;  //store first name reading from the file
		String lastName;   //store last name reading from the file
		
		//Use an array of PersonWithContacts to store all persons from the file
		PersonWithContacts[] persons = new PersonWithContacts[20];
		
		int numOfPerson = 0;  //store the number of person in the array persons
			
		while(inFile.hasNextLine())
		{
			line = inFile.nextLine();
			info = line.split(" "); //split line using space as separator
			firstName = info[0];
			lastName = info[1];
			PersonWithContacts pwc = new PersonWithContacts(firstName, lastName);
			for(int i = 2; i < info.length; i++) //add contact names into contacts
				pwc.addContacts(info[i]);
			
			persons[numOfPerson] = pwc; //add person into the array
			numOfPerson++;  //increase the number of person
		}
		
		int sumContacts = 0;  //store the sum of contacts of all people
		for(int i = 0; i < numOfPerson; i++)
		{
			sumContacts = sumContacts + persons[i].getNumOfContacts();
		}
		
		double average = (double)sumContacts / numOfPerson;
		
		System.out.println("The average contacts number is: " + average);
		
		inFile.close();
	}

}