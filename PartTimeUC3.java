package EmployeeWage;

import java.util.Random;

public class PartTimeUC3 {
	public static void main(String[] args)
	{
		final int EMPRATEPERHOUR = 20;
		int empHours = 0 , dailyWage;
		int isPresent = 1;
		int isPartTime = 2;
		Random rand = new Random();
		int empCheck  = rand.nextInt(3);
		if (empCheck == isPresent)
		{
			empHours = 8 ;
			System.out.println(" employee is present ");
		}
		else if (empCheck == isPartTime)
		{
			empHours = 4 ;
			System.out.println(" employee is Part time ");
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
