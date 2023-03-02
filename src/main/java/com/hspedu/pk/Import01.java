package com.hspedu.pk;
import java.util.Arrays;
//
//import java.util.Scanner; //表示只会引入java.util包下的 Scanner
//import java.util.*;//表示将java.util 包下的所有类都引入
public class Import01 {
	public static void main(String[] args) {
		int[]arr= {-1,20,2,13,3};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
	}

}
