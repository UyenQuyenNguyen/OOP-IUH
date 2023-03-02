package module01_01;

public class Bai_12 {
	public static void main(String[] args) {
		int tongLe = 0;
		for(int i = 0 ; i < 50 ; i++){
			tongLe += ((i*2)  + 1);
			System.out.println("I = " + ((i*2) +1));
		}
		System.out.println(" Tong le < 99 = " + tongLe);
	}
}
