package com.gut;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

//	1. Write a Java program to check whether the given parentheses string is balanced or not using Stack.
//Follow the operations below:
//* Read a string containing (), {}, [] brackets
//* Push opening brackets into the Stack
//* Pop elements when matching closing brackets are found
//* If all brackets are matched correctly, print true
//* Otherwise, print false
//Input:
//	{}()
//	({()})
//	{}(
//	[]
//Output:
//	true
//	true
//	false
//	true

public class ValidParanthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (isValid(s)) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}

	public static boolean isValid(String s) {
		HashMap<Character,Character>map=new HashMap<>();
		Deque<Character>stack=new ArrayDeque<>();
		map.put( ')','(');
		map.put('}','{');
		map.put( ']','[');
		for(char c:s.toCharArray()) {
			if(c=='(' || c=='{' || c=='[') {
				stack.push(c);
			}
			else {
				if(!stack.isEmpty() && stack.peek()==map.get(c)) {
					stack.pop();
				}
				else {
					return false;
				}
				//return false;
			}
		}
		return stack.isEmpty();
	}
}
