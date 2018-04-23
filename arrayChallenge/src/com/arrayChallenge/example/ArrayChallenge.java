package com.arrayChallenge.example;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class ArrayChallenge {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myIntNumber = getIntegers(5);
		int[] sortedValue = sortInteger(myIntNumber);
		printArray(sortedValue);

	}

	private static void printArray(int[] myValues) {
		// TODO Auto-generated method stub
		for (int i = 0; i < myValues.length; i++) {
			System.out.println("Interer numbers are:" + myValues[i]);
		}

	}

	private static int[] getIntegers(int numbers) {
		// TODO Auto-generated method stub
		System.out.println("Numbers are:");
		int[] values = new int[numbers];
		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}

		return values;
	}

	private static int[] sortInteger(int[] myIntNumber) {

		int[] sortedArray = new int[myIntNumber.length];
		for (int i = 0; i < myIntNumber.length; i++) {
			sortedArray[i] = myIntNumber[i];

		}

		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;
			for (int i = 0; i < sortedArray.length - 1; i++) {
				if (sortedArray[i] < sortedArray[i + 1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i + 1];
					sortedArray[i + 1] = temp;
					flag = true;
				}
			}

		}

		return sortedArray;
	}

}
