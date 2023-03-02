package module01_01;
import java.util.Scanner; 
import java.lang.String;
public class Bai_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
		System.out.println("Nhap chuoi bat ki: ");
		String str = sc.nextLine();
		System.out.println("Chuoi sau khi cat la: ");
		cutString(str);
		}
		finally{
			sc.close();
		}
		
	}
	public static void cutString(String str){
		String[] words = str.split("\\s");
		for(String w:words){  
			System.out.println(w);  
		}  
	}
}
