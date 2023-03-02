package module01_01;
import java.util.Scanner;
public class Bai_04 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	
		try {
			 System.out.println("Nhap lan luot he so cua phuong trinh: ");
			 float a= sc.nextFloat();
			 float b= sc.nextFloat();
			 tinhPTBac1(a,b);
			 System.out.println("Nghiem x = " + (tinhPTBac1(a,b)));
		} 
		catch (Exception e) {
				System.out.println(e.getMessage());
		}
		finally{
			  sc.close();
		}  
	}
	public static float tinhPTBac1(float a, float b) throws Exception{
		if(b==0){
			throw new Exception("Phuong trinh vo so nghiem!");
		}
		else if(a !=0){
			return (-b/a);
		}
		else{
			throw new Exception ("Phuong trinh vo nghiem");
		}
	
	}

}
