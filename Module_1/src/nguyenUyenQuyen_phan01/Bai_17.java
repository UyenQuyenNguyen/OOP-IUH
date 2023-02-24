package nguyenUyenQuyen_phan01;
import java.util.Scanner;
public class Bai_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chieu cao cua hinh:");
		int m = sc.nextInt();//m:nhap chieu cao cua hinh
		System.out.println("Hinh a:");
		xuatHinhA(m);
		System.out.println("Hinh b:");
		xuatHinhB(m);
		System.out.println("Hinh c:");
		xuatHinhC(m);
		System.out.println("Hinh D:");
		xuatHinhD(m);
	}
	public static void xuatHinhA(int m) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<=i;j++) {
				System.out.printf("*");
			}
			System.out.println("\t");
		}
	}
	public static void xuatHinhB(int m) {
		for(int i=m;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.printf("*");
			}
			System.out.println("\t");
		}
	}
	public static void xuatHinhC(int m) {
		int k=0;
	    for (int i = 1; i <= m; ++i, k = 0) {
	        for (int j = 1; j <= m - i; ++j) {
	          System.out.print("  ");
	        }
	        while (k != 2 * i - 1) {
	          System.out.print("* ");
	          ++k;
	        }
	        System.out.println();
	      }	   
	}
	public static void xuatHinhD(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				if (k == 1 || k == 2 * i - 1 || i == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}
