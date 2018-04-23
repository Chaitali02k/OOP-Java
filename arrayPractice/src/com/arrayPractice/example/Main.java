package com.arrayPractice.example;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int[] myIntVsriable = getInterger(5);
		for (int i = 0; i < myIntVsriable.length; i++) {
			System.out.println("number is:" + myIntVsriable[i]);
		}
		System.out.println("average number is:" + getAverage(myIntVsriable));

	}

	private static int[] getInterger(int number) {
		System.out.println("numbers are:");
		int[] value = new int[number];
		for (int i = 0; i < value.length; i++) {
			value[i] = scanner.nextInt();
		}

		return value;
	}

	private static double getAverage(int[] numbers) {
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}

		return (double) sum / (double) numbers.length;
	}

}
