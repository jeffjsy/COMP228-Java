package LabSix;

import java.util.Stack;

public class LabSix {		
	
	public static String reverse(String input) {
		char[] charArray = input.toCharArray(); //turn string input to array of characters
		int size = charArray.length;		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < size; i++) { 
			stack.push(charArray[i]); // push array to stack
		}
		
		for (int i = 0; i < size; i++) {
			charArray[i] = stack.pop(); // pop stack
		}
		
		return String.valueOf(charArray); // return reversed string
	}
	
	
	public static void main(String[] args) {
		String s = "COMP228";
		String s2 = "abcdefghkLMNOP";
		System.out.printf("Reverse of '%s' ----------> '%s'%n", s, reverse(s));
		System.out.printf("Reverse of '%s' ----------> '%s'%n", s2, reverse(s2));
	}

}
