package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class KmaxEle {
 static int t=0;
	public static void main(String[] args) {
		int[] arr= {2,5,7,8,9,10};
		int k=2;
		List<Integer>list=new ArrayList<>();
		for(int i:arr) {
			list.add(i);
		}
		System.out.println(list);
		System.out.println(max(list,k));
		
		
	}
	static int max(List<Integer> list,int s){
		t++;
		int max=0;
		int max_pos=0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)>max) {
				max=list.get(i);
				max_pos=i;
			}
		}
		System.out.println(max);
		if(t==s) {
			return max;
		}
			list.remove(max_pos);
			System.out.println(list);
			max=0;
			max_pos=0;
			return max(list,s);	
		
	}

}
