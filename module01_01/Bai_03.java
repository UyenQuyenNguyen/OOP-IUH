package module01_01;
import java.util.Scanner;
public class Bai_03 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Nhap n: ");
			int n = sc.nextInt();
			tinhTongChanLe(n);
			System.out.println("Tong day so: " + tinhTongChanLe(n));
		}
		catch( Exception e){
			System.out.println("Nhap so nguyen!");
		}
		finally{
			sc.close();
		}
	}
	public static int tinhTongChanLe(int n){
		if(n==0|| n==1)
			return n;
		else 
			return n + tinhTongChanLe(n-2);
	}
}
