package EmployeeWage;

import java.util.Random;

public class EmployeeWage 
{
	public static final int ISPRESENT = 1 ;
	public static final int PARTTIME = 2 ;
	String name ;
	int wagePerHour ;
	int maxWorkingHours;
	int maxWorkingDays ;
	private int numberOfCompanies = 0 ;
	private EmployeeWageBuilder[] employeeWageBuilder ;
	public EmployeeWage( )
    {
		employeeWageBuilder = new EmployeeWageBuilder[5];
    }
	private void addCompany( String company , int wagePerHour , int maxWorkingHours, int maxWorkingDays)
	{
		employeeWageBuilder[numberOfCompanies] = new EmployeeWageBuilder( company , wagePerHour , maxWorkingHours , maxWorkingDays);
		numberOfCompanies++ ;		
	}
	private void wageCalculation()
	{
		for(int index = 0 ; index < numberOfCompanies ; index++ )
		{
			employeeWageBuilder[index].setTotalEmployeeWage(this.wageCalculation(employeeWageBuilder[index]));
    		System.out.println(employeeWageBuilder[index]);
		}
	}
    public int wageCalculation(EmployeeWageBuilder employeeWageBuilder)
    {
    	int empHrs = 0;
    	int dailyWage = 0 , totalWage = 0 ;
    	int empCheck , totalWorkingDay = 0 , totalWorkingTime= 0 ;
    	Random rand=new Random();
    	while( totalWorkingDay < employeeWageBuilder.maxWorkingDays && totalWorkingTime < employeeWageBuilder.maxWorkingHours )
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
    	return totalWorkingTime*employeeWageBuilder.wagePerHour;
    }
	public static void main(String args[])
	{
		EmployeeWage employeeWage = new EmployeeWage ( );
		employeeWage.addCompany("dMart", 20 , 100, 20 );
		employeeWage.addCompany(" Reliance ", 15, 75 , 25 );
		employeeWage.wageCalculation();
	}
}
