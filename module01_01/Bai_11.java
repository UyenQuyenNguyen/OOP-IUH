package module01_01;
import java.util.Scanner;
public class Bai_11{
	public static void main(String[] args) {
    	System.out.println("Nhap so nguyen n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        khoiTao();
        System.out.println(n+" so dau tien cua day Fibonaci:");
        for(int i = 0; i < n; i++)    	
            System.out.print(fibonacci[i] + " ");
    }
    
    public static long[] fibonacci = new long[1000001];
    public static void khoiTao()
    {
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for(int i = 2; i < 1000000; i++)
        {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
    }
}

