package EmployeeWage;

import java.util.Random;

public class WagesForMonthUC5 
{
	public static final int isPresent = 1;
	public static final int isPartTime = 2;
	public static final int EMPRATEPERHOUR = 20;
	public static final int NUMOFWORKINGDAYS = 5; 
	public static void main(String[] args)
	{
		int empHours = 0 , dailyWage =0 , totalEmployeeWage =0 ;
		Random rand = new Random();
		for (int index = 0 ;index < NUMOFWORKINGDAYS; index++)
		{
			int empCheck  = rand.nextInt(3);
			switch (empCheck)
			{
				case isPresent:
					empHours = 8 ;
					System.out.println(" employee is present ");
					break;
				case isPartTime:
					empHours = 4 ;
					System.out.println(" employee is Part time ");
					break;
				default :
					empHours = 0 ;
					System.out.println(" employee is absent ");
			}
		dailyWage = EMPRATEPERHOUR*empHours;
		totalEmployeeWage = totalEmployeeWage+ dailyWage ;
		}
		System.out.println(" daily wage is " + dailyWage);
		System.out.println(" total wage is " + totalEmployeeWage);	
	}
}
