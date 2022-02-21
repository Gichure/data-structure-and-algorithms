package com.pgichure.samples.dsa.linear;

public class LinearSearch {

	public static void main(String[] args) {

		int[] values = {45,25,36,96,36,89,36};
		
		int search_number = 89;
		
		int index = 0;
		
		for(int number : values) {
			
			if(number == search_number)
				System.out.println(search_number + " found at index "+ index);
			
			index ++;
		}
	}

}
