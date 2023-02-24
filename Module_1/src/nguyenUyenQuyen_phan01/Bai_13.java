package nguyenUyenQuyen_phan01;
public class Bai_13 {
	public static void main(String[] args) {
		int tongChan = 0;
		for(int i =0; i < 10 ; i++){
			tongChan += i*2;
			System.out.println("I = " + i*2);
		}
		System.out.println("Tong 10 so hang chan dau tien = " + tongChan);
	}
}
