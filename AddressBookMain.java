package Day_9_problems;

import java.util.Scanner;

public class AddressBookMain {

	 public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        AddressBook2 addBook = new AddressBook2();

	        String ch;
	        while (true) {
	            System.out.println(" 1. Add contacts\n 2. Display contacts\n 3. Edit contacts\n 4. Delete contact\n  ");
	            System.out.print("\n Please enter your choice: ");

	            ch = scanner.next();

	            switch (ch) {
	                case "1":
	                    addBook.addContact();
	                    break;
	                case "2":
	                    addBook.displayContacts();
	                    break;
	                case "3":
	                    addBook.editContact();
	                    break;
	                case "4":
	                    addBook.deleteContact();
	                    break;

	                default:
	                    System.out.println(" Invalid choice: ");
	            }
	        }
	    }
	 }
