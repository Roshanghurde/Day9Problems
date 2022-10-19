package Day_9_problems;

public class Day9pbm5 {

	    public static void main(String args[])
	    {
	        final int parttime = 1;
	        final int fulltime = 2;
	        final int wageperhrs = 20;
	        final int workinghrs = 20;
	    
	        int totalWage = 0;
	        for (int day = 1; day <= workinghrs; day++)
	        {
	            int employee = (int) (Math.random() * 100) % 3;
	            int workingHrs =0;
	            switch (employee)
	            {
	                case fulltime:
	                    workingHrs = 8;
	                    break;
	                case parttime:
	                    workingHrs = 4;
	                    break;
	                default:
	            }
	            int wage = workingHrs*wageperhrs;
	            System.out.println("Day " + day + " wage is:" + wage);
	            totalWage += wage;
	        }
	        System.out.println("Total wage for a month is " + totalWage);        
	    }
	}