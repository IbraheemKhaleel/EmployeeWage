package EmployeeWage;

import java.util.Random;

public class DailyWageUC2 {
	public static void main(String[] args)
	{
		final int EMPRATEPERHOUR = 20;
		int empHours = 0 , dailyWage;
		int isPresent = 1;
		Random rand = new Random();
		int empCheck  = rand.nextInt(2);
		if (empCheck == isPresent)
		{
			empHours = 8 ;
			System.out.println(" employee is present ");
		}
		else
		{
			empHours = 0 ;
			System.out.println(" employee is absent ");
		}
		dailyWage = EMPRATEPERHOUR*empHours;
		System.out.println(" daily wage is " + dailyWage);

	}

}
