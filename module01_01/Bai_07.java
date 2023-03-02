package module01_01;

import java.util.Scanner;

public class Bai_07 {
	 public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      try{
	        System.out.print("Nhap so nguyen= ");
	        int n = sc.nextInt();
	        System.out.println("Tong cac so nguyen to nho hon n = " + Total(n));
	      }
	      catch (Exception e){
	        	System.out.println("Phai nhap so nguyen!");
	        }
	      finally{
	    	  sc.close();
	      }
	 }
	 private static int isprime(int n){
	        int flag = 1;
	        if (n <2) return flag = 0;
	        int i = 2;
	        while(i <n){
	            if( n%i==0 ){
	                flag = 0;
	                break; 	            }
	            i++;
	        }

	        return flag;
	  }
	public static int Total(int n){
		int sum =0;
		int i = 2;
		while(i<n){
			if(isprime(i)==1){
				sum += i;
				break;
			}i++;
			
		}return sum;
		
}
}