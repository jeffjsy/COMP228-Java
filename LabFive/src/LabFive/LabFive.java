package LabFive;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;

public class LabFive {
	
	public static void main(String[] args) {
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		List<String> list = new ArrayList<String>();		
		Collections.addAll(list, suits); // adds string array 'suits' to 'list'
		
		System.out.printf("Before sort: ");
		String preSort = list.toString(); // convert list to string
		System.out.println(preSort);
		
		AscendSorter.Sort(list); // calls method to sort list ascending		
		System.out.printf("%nAfter ascending sort: ");
		String postASort = list.toString();
		System.out.println(postASort);
		
		DescendSorter.Sort(list); // calls method to sort list descending 		
		System.out.printf("%nAfter descending sort: ");
		String postDSort = list.toString();
		System.out.println(postDSort);				
			
	}
}

