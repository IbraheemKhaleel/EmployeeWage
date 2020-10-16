package EmployeeWage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class EmployeeWage implements EmployeeWageInterface
{ 
	public static final int ISPRESENT = 1 ;
	public static final int PARTTIME = 2 ;
	String name ;
	int wagePerHour ;
	int maxWorkingHours;
	int maxWorkingDays ;
	private List<EmployeeWageBuilder> employeeWageBuilderList ;
	public EmployeeWage( )
    {
		employeeWageBuilderList = new ArrayList<EmployeeWageBuilder>();
    }
	public void addCompany( String company , int wagePerHour , int maxWorkingHours, int maxWorkingDays)
	{
		EmployeeWageBuilder employeeWageBuilder = new EmployeeWageBuilder( company , wagePerHour , maxWorkingHours , maxWorkingDays);
		employeeWageBuilderList.add(employeeWageBuilder) ;		
	}
	public void wageCalculation()
	{
		for(int index = 0 ; index < employeeWageBuilderList.size() ; index++ )
		{
			EmployeeWageBuilder employeeWageBuilder = employeeWageBuilderList.get(index);
			employeeWageBuilder.setTotalEmployeeWage(this.wageCalculation(employeeWageBuilder));
			System.out.println(employeeWageBuilder);
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
    		dailyWage=employeeWageBuilder.wagePerHour*empHrs ;
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
		EmployeeWageInterface employeeWage = new EmployeeWage();
		employeeWage.addCompany("dMart", 20 , 100, 20 );
		employeeWage.addCompany(" Reliance ", 15, 75 , 25 );
		employeeWage.wageCalculation();
	}
}
