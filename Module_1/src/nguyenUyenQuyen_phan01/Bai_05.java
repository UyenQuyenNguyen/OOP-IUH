package nguyenUyenQuyen_phan01;

import java.util.Scanner;

public class Bai_05 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Nhap a va b : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			timUCLN(a,b);
			System.out.println("UCLN cua " + a + " va " + b + " la: " + (timUCLN(a,b)));
			
		}
		catch( Exception e){
			System.out.println("Nhap so nguyen, lam on!!!");
		}
		finally{
			sc.close();
		}
		
	}
	public static int timUCLN(int a, int b){
		if(a==0||b==0)
			return a+b;
		while(a!=b){
			if(a>b)
				return a -= b;
			else 
				return b -= a;
		}
		return a;
	}
}
