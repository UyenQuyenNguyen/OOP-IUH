package module01_01;

import java.util.Scanner;
import java.util.*;

public class Bai_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
		System.out.println("Enter the number of elements of the array : ");
		int n = sc.nextInt();
		int [] a= new int[n];
		System.out.println("The number of elements: " + a.length);
		inputArray(a,n);
		outputArray(a,n);
		System.out.println("Enter element to find: ");
		int k = sc.nextInt();
		int check = findElement(a,k,n);
		if(check == 0){
			System.out.println("Element not found!");
		}
		else 
			System.out.println("Element "+ k +" is found at a["+ check +"]");
		}
		finally{
			sc.close();
		}
	}
	public static void inputArray(int[] a, int n){
		Random rand = new Random();
		for(int i = 0; i < n; i++){
			a[i] = rand.nextInt(50);
		}
	}
	public static void outputArray(int[] a, int n){
		for(int i=0; i < n; i++){
			System.out.println(a[i]);
		}
	}
	public static int findElement(int[] a, int k, int n){
		int flag = 0;
		for(int i = 0 ; i< n; i++){
			if(a[i]==k){
				flag = i;
			}
		}
		return flag;
	}
}