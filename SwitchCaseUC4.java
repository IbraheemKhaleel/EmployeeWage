package EmployeeWage;

import java.util.Random;

public class SwitchCaseUC4 
{
	public static final int isPresent = 1;
	public static final int isPartTime = 2;
	
	public static void main(String[] args)
	{
		final int EMPRATEPERHOUR = 20;
		int empHours = 0 , dailyWage;
		Random rand = new Random();
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
		System.out.println(" daily wage is " + dailyWage);
	}
}
