package pm;

import java.util.Arrays;
import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[100];
		
		for(int i=1; i<=arr.length; i++) {
			arr[i-1] = i;
		}
		
		System.out.println(Arrays.toString(arr));
		
		//2
		int[] arr1 = {5,4,3,2,1};
		int[] arr2 = new int[arr1.length];
		/*
		int cnt=0;
		for(int i = arr1.length; i>0; i--) {
			arr2[cnt] = i;
			cnt++;
		}
		System.out.println(Arrays.toString(arr2));
		*/
		for(int i = 0; i<arr1.length; i++) {
			arr2[i] = arr1[arr1.length-1-i];
		}
		
		System.out.println(Arrays.toString(arr2));
		

	}
}
