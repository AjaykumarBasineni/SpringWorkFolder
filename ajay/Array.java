package com.ajay;

public class Array {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			// System.out.println(array[i]);
			int splitNum = array[i];
			int rem = splitNum % 2;
			if (rem == 0) {
				sum = sum + array[i];
			}

		}
		System.out.println(sum);
		
		Array arr = new Array();
		int countOfStringsInList = arr.countOfStringsInList();
		System.out.println("Count Of Strings In List :"+countOfStringsInList);
	}

	public int countOfStringsInList() {
		String[] array2 = new String[] {"apple","banana","apple","orange","apple"};
		int count = 0;
		for(int i = 0; i < array2.length; i++) {
			count = count+1;
		}
		return count;
	}
}