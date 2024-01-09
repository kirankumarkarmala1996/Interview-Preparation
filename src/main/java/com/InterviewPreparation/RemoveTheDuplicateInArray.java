package com.InterviewPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveTheDuplicateInArray {
	
		public static void main(String[] args) {
			
//		way =>1	
			
			/*
			 * int[] arr = { 65, 96, 21, 872, 25, 96 };
			 * int n = arr.length; // using collections Set hashSet = new HashSet(); for
			 * (int i = 0; i < n; i++) hashSet.add(arr[i]);
			 * 
			 * System.out.print(hashSet);
			 */
			
//		way =>2

			/*
			 * // int[] arr = {6, 2, 3, 4, 43, 6, 7, 5, 6, 34, 4}; int[] uniqueArr = new
			 * int[arr.length]; int counter = 0; Arrays.sort(arr); for (int i = 0; i <
			 * arr.length - 1; i++) { if (arr[i] != arr[i + 1]) { uniqueArr[counter] =
			 * arr[i]; counter++; } } uniqueArr[counter] = arr[arr.length - 1];
			 * System.out.println("Array with Unique Elements : "); for (int i = 0; i <=
			 * counter; i++) { System.out.println(uniqueArr[i]); }
			 */
		
			    
//		way =>3
		
		        Integer[] numberArr = new Integer[] {65, 96, 21, 872, 25, 96};

		       List<Object> uniqueList = Arrays.asList(numberArr).stream().distinct().collect(Collectors.toList());
		       Arrays.asList(numberArr).stream().distinct().collect(Collectors.toList());
		        for (Object singleElement:
		            uniqueList ) {
		            System.out.println(singleElement);
		        }

		}


		
				
		
	


}
