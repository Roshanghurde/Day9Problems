package Day_9_problems;

public class AddressBook {
	 String FIRSTNAME;
	    String LASTNAME;
	    String ADDRESS;
	    String CITY;
	    String STATE;
	    int ZIP;
	    long PHONENUMBER;
	    String EMAIL;



	    public AddressBook(String firstName, String lastName, String address, String city, String state, int zip, long phoneNumber,
	                   String email) {
	        super();
	        this.FIRSTNAME = firstName;
	        this.LASTNAME = lastName;
	        this.ADDRESS = address;
	        this.CITY = city;
	        this.STATE = state;
	        this.ZIP = zip;
	        this.PHONENUMBER = phoneNumber;
	        this.EMAIL = email;
	    }
	    public String getFirstName() {
	        return FIRSTNAME;
	    }
	    public void setFirstName(String firstName) {
	        this.FIRSTNAME = firstName;
	    }
	    @Override
	    public String toString() {
	        return  "  \nfirstName=" + FIRSTNAME + 
	        		", \n lastName=" + LASTNAME + 
	        		", \n address=" + ADDRESS + 
	        		", \ncity=" + CITY +
	                ", \nstate=" + STATE + 
	                ", \n zip=" + ZIP + 
	                ", \n phone=" + PHONENUMBER + 
	                ", \n email=" + EMAIL + "]";
}
}