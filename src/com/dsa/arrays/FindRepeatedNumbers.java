package com.dsa.arrays;

public class FindRepeatedNumbers {

	public static void main(String[] args) {
		int[]arr= {1,5,1,2,3,4,4,1,5,6,2,7,7,6,7,8};
		boolean[] visited=new boolean[arr.length];
		//boolean status=false;
		for(int i=0;i<arr.length;i++){

			if(visited[i]) {
				continue;
			}
			int count=1;
			boolean status=false;
			for(int j=i+1;j<arr.length;j++) {
				if( arr[i]==arr[j]) {
					visited[j]=true;
					status=true;
					count++;
				}
				}
				System.out.println(arr[i]+" "+count);
			
			}
		}

	}



