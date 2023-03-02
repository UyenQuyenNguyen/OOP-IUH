package module01_01;
import java.util.Scanner;
import java.lang.String;
public class Bai_08 {
	public static void main(String[] args) {
		String Chuoi;
		Scanner sc = new Scanner(System.in);
		try{
		System.out.println("Nhap chuoi bat ki: ");
		Chuoi = sc.nextLine();
		System.out.println("Chuoi vua nhap la: " + Chuoi);
		System.out.println("Số lần xuất hiện của ký tự a trong chuỗi "  + Chuoi + " = " + CountA(Chuoi));
		}
		finally{
			sc.close();
		}
	}
	public static int CountA(String Chuoi){
		char Letter = 'a';
		int count = 0;
		for(int i=0; i < Chuoi.length(); i++){
			if(Chuoi.charAt(i)==Letter)
				count++;
		}
		return count;
	}
}
