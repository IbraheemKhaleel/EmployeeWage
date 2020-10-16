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
    public static void empCheck( String company, int ratePerHrs,int maxHrsPerMonth, int maxDaysPerMonth )
    {
    	int empHrs, empCheck, dailyWage = 0 ;
    	int totalWage = 0 ;
    	int totalWorkingDay = 0, totalWorkingTime = 0 ;
    	while( totalWorkingDay < MAXWORKINGDAYS && totalWorkingTime < MAXWORKINGHOURS )
    	{
    		Random rand=new Random();
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
    		dailyWage=ratePerHrs*empHrs ;
    		totalWage= totalWage + dailyWage ;
    		totalWorkingTime = totalWorkingTime + empHrs ;
    		totalWorkingDay++;
    		System.out.println("Total working hours is  "+ totalWorkingTime + " Total working days are "+ totalWorkingDay );
    		System.out.println("Total daily wage is " + totalWage);
    	}
    }
	public static void main(String args[])
	{
		System.out.println("The employee details of Reliance company is \n\n ");
		empCheck("Reliance", 20,100,25);
		System.out.println("\n\nThe employee details of dMart company is \n\n ");
		empCheck("dMart", 30, 100 , 30);
	}
}
