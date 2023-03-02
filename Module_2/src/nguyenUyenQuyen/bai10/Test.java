package nguyenUyenQuyen.bai10;


public class Test {
	public static void main(String[] args) {
		try {
			SinhVien sv[] = new SinhVien[6];
			sv[0] = new SinhVien("123", "Nguyen Van A");
			sv[1] = new SinhVien("543", "Le Thi B");
			sv[2] = new SinhVien("321", "Luong Van C");
			LopHocPhan lhp = new LopHocPhan("123456", "LT Hướng đối tượng","Cô Hà","Thứ 7, tiết 4-6,phòng A1.1",sv);
			System.out.println(lhp);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
