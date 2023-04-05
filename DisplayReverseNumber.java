package day2;

import java.util.Scanner;

public class DisplayReverseNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
    int rem;
    System.out.println("enetr a number:");
    int num = sc.nextInt();
    while(num>0)
    {
    	rem=num%10;
    	System.out.print(rem);
    	num=num/10;
    }
    sc.close();
	}

}
