package com.bl.linecomparisonproblem;

import java.util.Scanner;

public class LineComparisonUC1 {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		calculateLength();
	}

	private static void calculateLength() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x1: ");
		int x1 = sc.nextInt();
		System.out.println("Enter the value of x2: ");
		int x2 = sc.nextInt();
		System.out.println("Enter the value of y1: ");
		int y1 = sc.nextInt();
		System.out.println("Enter the value of y2: ");
		int y2 = sc.nextInt();

		double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Length of the line is: " + length1);
	}
}
