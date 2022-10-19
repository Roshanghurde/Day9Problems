package Day_9_problems;

public class Day9pbm2 {

	    public static void main(String args[])
	    {
	         int fulltime = 1;
	         int wageperhrs = 20;
	        int employee = (int)(Math.random()*100)%2;
	        int workinghrs= 0;
	        if (employee == fulltime)
	        {
	            System.out.println("employee present");
	            workinghrs = 8;
	        } else
	        {
	            System.out.println("employee absent");
	        }
	        int wage = workinghrs*wageperhrs;
	        System.out.println("daily employee wage=" + wage);
	    }
	}