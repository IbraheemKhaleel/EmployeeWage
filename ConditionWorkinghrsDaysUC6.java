package EmployeeWage;

import java.util.Random;

public class ConditionWorkinghrsDaysUC6 
{
	public static final int isPresent = 1;
	public static final int isPartTime = 2;
	public static final int EMPRATEPERHOUR = 20;
	public static final int NUMOFWORKINGDAYS = 20; 
	public static final int NUMOFWORKINGHOURS = 100;
	public static void main(String[] args)
	{
		int empHours = 0 , dailyWage =0 , totalEmployeeWage =0 ;
		int totalWorkingHours = 0;
		int totalWorkingDays = 0;
		Random rand = new Random();
		while ( totalWorkingHours < NUMOFWORKINGHOURS && totalWorkingDays < NUMOFWORKINGDAYS  )
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
			totalWorkingHours++;
			totalWorkingDays++;
		dailyWage = EMPRATEPERHOUR*empHours;
		System.out.println(" daily wage is " + dailyWage);
		totalEmployeeWage = totalEmployeeWage+ dailyWage ;
		totalWorkingHours += empHours ;
		}
		System.out.println(" total wage is " + totalEmployeeWage);
		System.out.println( totalWorkingHours);
		System.out.println(totalWorkingDays);
	}
}
