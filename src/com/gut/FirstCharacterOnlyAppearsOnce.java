package com.gut;

public class FirstCharacterOnlyAppearsOnce {

	public static void main(String[] args) {
		String s="VccubeubseJJaVajjc";
		char s1=' ';
		boolean arr[]=new boolean[s.length()];
		for(int i=0;i<s.length();i++) {
			if(arr[i]) {
				continue;
			}
			boolean status=true;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					arr[j]=true;
					status=false;
				}
			}
			if(status) {
				s1=s.charAt(i);
				break;
			}
		}
		if(s1!=' ') {
			System.out.println(s1);
		}
		else {
			System.out.println("No element found in the String");
		}

	}

}
