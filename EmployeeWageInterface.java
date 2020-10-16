package EmployeeWage;

public interface EmployeeWageInterface 
{
	public void addCompany( String company , int wagePerHour , int maxWorkingHours, int maxWorkingDays);
	public void wageCalculation();
	public int getTotalWage( String company);
}
