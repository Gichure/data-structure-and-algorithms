### Binary Search
Binary Search is applied on the sorted array or list of large size. It has a time complexity of O(log n) making it very fast as compared to other searching algorithms. The only limitation is that the array or list of elements must be sorted for the binary search algorithm to work on it.
#### Algorithm
```
1.	Start with the middle element: 
	If the target value is equal to the middle element of the array, then 	return the index of the middle element.
	If not, then compare the middle element with the target value, 
	If the target value is greater than the number in the middle index, then 	pick the elements to the right of the middle index, and start with Step 	1.
	If the target value is less than the number in the middle index, then 	pick the elements to the left of the middle index, and start with Step 1.
2.	When a match is found, return the index of the element matched.
3.	If no match is found, then return -1
```

#### Time Complexity
Binary search has a time complexity of O(log n). 

#### Java Example

```
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
```


