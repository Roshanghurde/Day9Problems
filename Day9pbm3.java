package Day_9_problems;

public class Day9pbm3 {

	    public static void main(String args[])
	    {
	         int parttime = 1;
	         int fulltime = 2;
	         int wageperhrs = 20;
	        int employee = (int)(Math.random()*100)%3;
	        int workinghrs = 0;
	        if (employee == fulltime)
	        {
	            System.out.println("employee present fulltime");
	            workinghrs = 8;
	        } else if (employee == parttime)
	        {
	            System.out.println("employee  present parttime");
	            workinghrs = 4;
	        } else
	        {
	            System.out.println("employee  absent");
	        }
	        int wage = workinghrs*wageperhrs;
	        System.out.println("Daily employee Wage="+ wage);
	    }
	}