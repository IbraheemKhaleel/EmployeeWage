package EmployeeWage;

import java.util.Random;

public class EmployeeWage 
{
	int maxWorkingHours;
	public static final int ISPRESENT = 1 ;
	public static final int PARTTIME = 2 ;
	int wagePerHour ;
	int maxWorkingDays ;
    int empHrs, empCheck, dailyWage = 0 ;
    int totalWage = 0 ;
    int totalWorkingDay = 0, totalWorkingTime = 0 ;
    String name ;
	public EmployeeWage( String name , int wagePerHour, int maxWorkingHours, int maxWorkingDays )
    {
    	this.name = name ;
    	this.wagePerHour = wagePerHour ;
    	this.maxWorkingHours = maxWorkingHours ;
    	this.maxWorkingDays = maxWorkingDays ;
    }
    public void wageCalculation()
    {
    	Random rand=new Random();
    	while( totalWorkingDay < maxWorkingDays && totalWorkingTime < maxWorkingHours )
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
    		dailyWage=wagePerHour*empHrs ;
    		totalWage= totalWage + dailyWage ;
    		totalWorkingTime = totalWorkingTime + empHrs ;
    		totalWorkingDay++;
    		System.out.println("Total working hours is  "+ totalWorkingTime + " Total working days are "+ totalWorkingDay );
    		System.out.println("Total daily wage is " + totalWage);
    	}
    }
	public static void main(String args[])
	{
		EmployeeWage dMart = new EmployeeWage ( "dMart ", 20 , 100 , 20 );
		EmployeeWage reliance = new EmployeeWage ("Reliance ",20,100,20);
		System.out.println(" Name of company is " + dMart.name);
		dMart.wageCalculation();
		System.out.println(" \n\n Name of company is \n\n " + reliance.name);
		reliance.wageCalculation();
	}
}
