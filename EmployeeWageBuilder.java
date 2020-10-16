package EmployeeWage;

public class EmployeeWageBuilder 
{
	 public final String company;
	 public final int maxWorkingHours;
	 public final int maxWorkingDays;
	 public final int wagePerHour;
	 public int totalEmployeeWage;
	
	 public EmployeeWageBuilder(String company, int wagePerHour, int maxWorkingHours, int maxWorkingDays) 
	    {
	    	this.company = company ;
	    	this.wagePerHour = wagePerHour ;
	    	this.maxWorkingHours = maxWorkingHours ;
	    	this.maxWorkingDays = maxWorkingDays ;
	    }
	 public void setTotalEmployeeWage(int totalEmployeeWage)
	 {
		 this.totalEmployeeWage=totalEmployeeWage;
	 }
	 public String toString()
	 {
		 return "\n\nTotal employee wage for the company " + company + "  is " + totalEmployeeWage+ "\n\n " ;
	 }
}
