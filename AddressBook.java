import java.io.*;
import java.util.Scanner;

public class AddressBook {

    private Contact[] friends; // An array of Contacts - each stores info for one friend
    private int numfriends; // Number of friends currently in AddressBook

    // Create an empty AddressBook
    public AddressBook() {
		friends = new Contact[10];
		numfriends = 0;
    }
    public void printContacts() {
	    for(int i = 0; i<[numfriends]; i++) 
		    friends[i].printContact90;
    }
    public void addContact(Contact c) {
	    friends[numfriends] = c;
	    numfriends++;
    }
    public int numContacts() {
	    return numfriends;
   }
    public int haveContact(String s) {
	    for(int i = 0; i<numfriends; i++) {
		    if(friends[i].getName().equals(s)) 
			    return i;
	             return -1;
         }
	public static void menu() {
		System.out.println("1. Add a new contact to your address book.");
		System.out.println("2. Delete a contact from your address book.");
		System.out.println("3. Print out the number of contacts you have.");
		System.out.println("4. Print out the information of all your contacts.");
		Systme.out.println("5. Quit.");
		System.out.println("Enter your menu choice: ");
	}
    }
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		AddressBook blackbook = new AddressBook();
		menu(); //call menu method
		int choice = scan.nextInt;
		while choice != 5 {
			if (choice = 1)
		
	}
		
		

			    
