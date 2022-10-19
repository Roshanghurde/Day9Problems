package Day_9_problems;

public class Day9pbm6 {

	    public static void main(String args[])
	    {
	        final int parttime = 1;
	        final int fulltime = 2;
	        final int wageperhrs = 20;
	        final int maximumworkingdays = 20;
	        final int maximumworkinghrs = 100;

	        int totalWage = 0;
	        int workinghrs = 0;
	        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "workinghrs", "wage", "Total workinghrs");
	        for (int day = 1, totalworkinghrs = 0; day <= maximumworkingdays
	                && totalworkinghrs < maximumworkinghrs; day++, totalworkinghrs += workinghrs)
	        {

	            int employee = (int) (Math.random() * 100) % 3;
	            switch (employee)
	            {
	            case fulltime:
	                workinghrs = 8;
	                break;
	            case parttime:
	                workinghrs = 4;
	                break;
	            default:
	                workinghrs = 0;
	                break;
	            }
	            int wage = workinghrs * wageperhrs;
	            totalWage += wage;
	            System.out.printf("%5d       %5d      %5d      %5d\n", day, workinghrs, wage, totalworkinghrs + workinghrs);

	        }
	        System.out.println("Total wage for a month is " + totalWage);
	    }
	}