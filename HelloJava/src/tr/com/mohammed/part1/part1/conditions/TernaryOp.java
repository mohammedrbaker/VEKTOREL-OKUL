package tr.com.mohammed.part1.part1.conditions;

import java.util.Scanner;

public class TernaryOp {
	
	public static void main(String[] args) {
//		int a = 5;
//		int b = 5;
//		String f = (a==b)?"True, E�ittir":"False, E�it De�ildir!";
//		System.out.println(f);
		System.out.println("�ki say� giriniz: ");
		Scanner scan = new Scanner (System.in);
		int num1= scan.nextInt();
		int num2= scan.nextInt();
		double div = (num1 !=0)? (num1*num2): (num1/num2);
		System.out.println(div);
	}

}
