package com.techbeamers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Write Code To Sort The List Of Strings Using Java Collection?
//Itt az a baj, hogy az Array az nem Collections.
public class sortStrings {
	public static void main(String[] args) throws Exception {
		 
		String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
				"aug", "Sep", "Oct", "nov", "Dec" };
 
		List<String> list= new ArrayList<String>();
		List<String> resultList= new ArrayList<String>();
		list= Arrays.asList(inputList);
		
		// Display input un-sorted list.
		System.out.println("-------Input List-------");
		showList(inputList);
		System.out.println(list);
 
		// Call to sort the input list.
		Arrays.sort(inputList);
		Collections.sort(list);
 
		// Display the sorted list.
		System.out.println("\n-------Sorted List-------");
		showList(inputList);
		System.out.println(list);
 
		// Call to sort the input list in case-sensitive order.
		System.out.println("\n-------Sorted list (Case-INSensitive)-------");
		Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);
		Collections.sort(list,String.CASE_INSENSITIVE_ORDER);
 
		// Display the sorted list.
		showList(inputList);
		System.out.println(list);
	}
 
	public static void showList(String[] array) {
		for (String str : array) {
			System.out.print(str + " ");
		}
		System.out.println();
	}

}
