package com.pgichure.samples.dsa.binary;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		
		int search_number = 13;
		
		int index = 0; // this will hold the index of middle elements
		
		int max = values.length - 1; //the maximum index
	    int min = 0; //the minimum index
	    
	    int step = 0;  // to find out in how many steps we completed the search
	    
	    while(max >= min)
	    {
	    	
	    	index = (max + min) / 2;
	        // we made the first guess, incrementing step by 1
	        step++;
	        
	        if(values[index] ==  search_number){
	        	System.out.println(search_number + " found at index "+ index + " after "+step+" steps");
	        	System.exit(0);
	        }
	        else if(values[index] >  search_number) {
	            // target would be in the left half
	            max = (index - 1);
	        }
	        else{
	            // target would be in the right half
	            min = (index + 1);
	        }
	    }
	}

}
