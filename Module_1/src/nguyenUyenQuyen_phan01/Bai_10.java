package nguyenUyenQuyen_phan01;
import java.util.Scanner;
public class Bai_10 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Nhap chuoi: ");
        String str = sc.nextLine();
        
        System.out.println("So luong ki tu la so la:"+digit(str));
        }
        catch (Exception e){
        	System.out.println("Phai nhap so nguyen!");
        }
        finally{
        	sc.close();
        }
	}
    public static int digit(String str)
    {
        int ans = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) > 47 && str.charAt(i) < 58)
                ans++;
        }
        return ans;
    }

}
