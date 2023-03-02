package nguyenUyenQuyen.bai11;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		try {
			KhachHang kh = new KhachHang("KH001","Nguyen Van An", 10);
			kh.themSoTietKiem("111", LocalDate.of(2020, 05, 01), 1000000, 3, (float)0.005);
			kh.themSoTietKiem("112", LocalDate.of(2019, 12, 10), 10000000, 6, (float)0.006);
			System.out.println(kh);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
