package Day_9_problems;

public class Day9pbm4  {
	
	    public static void main(String args[])
	    {
	        final int parttime = 1;
	         final int fulltime = 2;
	         int wageperhrs = 20;
	        int employee = (int)(Math.random()*100)%3;
	        int workinghrs =0;
	        switch (employee)
	        {
	            case fulltime:
	                System.out.println("employee  present fulltime");
	                workinghrs = 8;
	                break;
	            case parttime:
	                System.out.println("employee  Present parttime");
	                workinghrs = 4;
	                break;
	            default:
	                System.out.println("employee is absent");    
	        }
	        int wage = workinghrs * wageperhrs;
	        System.out.println(" daily employee wage=" + wage);
	    }
	}