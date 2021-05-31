package com.laxman.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/*Reverse the worlds in a string
	Given an input string, reverse the string word by word. A word is defined as a sequence of non-space characters.
	Given s = "the sky is blue",
	return "blue is sky the".
*/

public class ReverseWordsInString {

	public static void main(String[] args) {
		String input = "the sky is blue";
		approach1(input);
		approach2(input);
		
	}

	private static void approach1(String input) {
		
		String[] strings = input.split(" ");
		// Here we can follow swap
		for (int i = 0; i < strings.length / 2; i++) {
			String temp = strings[strings.length - i - 1];
			strings[strings.length - i - 1] = strings[i];
			strings[i] = temp;
		}
		System.out.println(String.join(" ", strings));
	}
	
	private static void approach2(String input) {
		List<String> list = new ArrayList<>();
		Arrays.stream(input.split(" ")).collect(Collectors.toCollection(LinkedList::new)).descendingIterator()
				.forEachRemaining(list::add);
		String s = list.stream().map(Object::toString).collect(Collectors.joining(" "));
		System.out.println(s);
	}

}
