package com.daliya;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class StringUniqueChar {

	boolean checkUniqueChar(String input) {

//      BruteForce Approach O(n^2)
//		for (int i = 0; i < input.length(); i++) {
//			for (int j = i + 1; i < input.length(); i++) {
//				if (input.charAt(i) == input.charAt(j)) {
//					return false;
//				}
//			}
//		}
//     Binary sort and adjacent character checking  O(NlogN) as this is the complexity of binary sort
//		char[] inputChar = input.toCharArray();
//		Arrays.sort(inputChar);
//		for(int i=0;i<input.length()-1;i++){
//			if(inputChar[i]==inputChar[i+1]) {
//				return false;
//			}
//		}
//		Hash Set 
		char[] inputChar = input.toCharArray();
		HashSet<Character> set = new HashSet<>();
		for(Character indiChar :inputChar) {
			if(!set.add(indiChar)) {
				return false;
			}
		}
		return true;

	}

	public static void main(String args[]) {
		StringUniqueChar str = new StringUniqueChar();
		System.out.println(str.checkUniqueChar("abacas"
				+ ""));
	}

}
