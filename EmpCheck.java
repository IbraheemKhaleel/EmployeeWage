package EmployeeWage;

import java.util.Random;

public class EmpCheck {

	public static void main(String[] args) 
	{
		int isPresent = 1;
		Random rand = new Random();
		int empCheck  = rand.nextInt(2);
		if (empCheck == isPresent)
		{
			System.out.println(" employee is present ");
		}
		else
		{
			System.out.println(" employee is absent ");
		}

	}
}

