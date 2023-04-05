package day2;

import java.util.Scanner;

public class DailyWages {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter week day:");
		int day=sc.nextInt();
		System.out.println("enter working hours:");
		int hours=sc.nextInt();
		double bonus=0;
		double wages=0;
		switch(day) {
		case 1,2,3 ->wages = hours*200;
		case 4,5 -> wages=hours*400;
		case 6 -> wages=hours*600;
		case 7 -> wages=hours*800;
		default -> System.out.print("enter valid number");
		};
		bonus=wages*0.1;
		if(wages>2000)
		{
	       wages=wages+bonus;
	       System.out.println(wages);
		}
		else
		{
			System.out.println(wages);
		}
		sc.close();
	}

}
