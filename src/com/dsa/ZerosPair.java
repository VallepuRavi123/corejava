package com.dsa;

public class ZerosPair {

	public static void main(String[] args) {
		int[]arr= {1,1,0,0,0,1,1,1,0};
		int zc=0;
		int x=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				zc++;
			}
			else if(arr[i]==1) {
				x++;
			}
		}
		if(zc>x) {
			System.out.println(2*x);
		}
		else {
			System.out.println(2*zc);
		}
	}

}
