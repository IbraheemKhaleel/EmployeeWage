package EmployeeWage;

import java.util.Random;

public class EmployeeWage 
{
	Random rand=new Random();
	public static final int MAXWORKINGHOURS = 100 ;
	public static final int ISPRESENT = 1 ;
	public static final int PARTTIME = 2 ;
	public static final int WAGEPERHOUR = 20 ;
	public static final int MAXWORKINGDAYS = 20 ;
	public void wageFunction()
	{
		int empHrs;
	    int empCheck;
	    int totalWorkingDay=0;
	    int dailyWage=0;
	    int totalWage=0, totalWorkingHours = 0 ;
		while(totalWorkingDay < MAXWORKINGDAYS && totalWorkingHours < MAXWORKINGHOURS)
		{
			empCheck=rand.nextInt(3);
            if(empCheck == 1)
            {
            	empHrs=8;
            }
            else if ( empCheck == 2 )
            {
				empHrs=4;
            }
			else
			{
				empHrs=0;
			}
			dailyWage=WAGEPERHOUR*empHrs;
			totalWorkingDay++;
			totalWage=totalWage+dailyWage;
		
		}
		System.out.println(" Monthly wage is  "  + totalWage );
		System.out.println(" Total working day is " + totalWorkingDay);
     }
	 public static void main(String[] args)
	 {
		EmployeeWage employeeWage = new EmployeeWage();
		employeeWage.wageFunction();
	 }
}
