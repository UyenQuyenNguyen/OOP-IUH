package nguyenUyenQuyen_phan01;
import java.util.Scanner;
public class Bai_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
		String a[] = new String[100];
		System.out.println("Nhap so phan tu cua mang:");
		int n;
		n = sc.nextInt();
		nhapMang(a, n);
		xuatMang(a, n);
		sc.nextLine();
		System.out.println("Nhap chuoi can tim: ");
		String g = sc.nextLine();
		if(kiemTra(a, n, g)==true)
			System.out.println("Co chuoi trong mang");
		else
			System.out.println("Khong co chuoi trong mang");
		}
		finally{
			sc.close();
		}
		
	}
	public static void nhapMang(String a[],int n) {
		Scanner sc = new Scanner(System.in);
		try{
			for(int i=0;i<n;i++) {
				System.out.println("Nhap chuoi thu "+(i+1)+" :");
				a[i] = sc.nextLine();
			}
		}
		finally{
			sc.close();
		}
	}
	public static void xuatMang(String a[],int n) {
		System.out.println("Cac chuoi vua nhap la: ");
		for(int i=0;i<n;i++) {
			System.out.println(a[i] );
		}
	}
	public static boolean kiemTra(String a[],int n,String g) {
		for(int i=0;i<n;i++) {
			if(a[i].equals(g)) {
				return true;
			}
		}
		return false;
	}
}
