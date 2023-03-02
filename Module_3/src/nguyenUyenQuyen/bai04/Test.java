package nguyenUyenQuyen.bai04;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Sach[] s = new Sach[6];

		s[0] = new SachGiaoKhoa("123", LocalDate.of(2022, 9, 9), 100000, 10, "Trẻ", true);
		s[1] = new SachGiaoKhoa("124", LocalDate.of(2022, 8, 8), 200000, 12, "Kim Đồng", false);
		s[2] = new SachGiaoKhoa("125", LocalDate.of(2022, 7, 7), 300000, 30, "Trẻ", true);
		s[3] = new SachThamKhao("126", LocalDate.of(2022, 1, 1), 20000, 20, "Phụ nữ VN", 10000);
		s[4] = new SachThamKhao("127", LocalDate.of(2022, 2, 3), 10000, 30, "Kim Đồng", 10000);
		s[5] = new SachThamKhao("128", LocalDate.of(2022, 3, 2), 40000, 5, "Y Học", 10000);

		DanhSachSach l = new DanhSachSach(10);
		l.themSach(s[0]);
		l.themSach(s[1]);
		l.themSach(s[2]);
		l.themSach(s[3]);
		l.themSach(s[4]);
		l.themSach(s[5]);
		System.out.println(Sach.taoTieuDe());
		for (Sach sach : s) {
			System.out.println(sach);
		}
		
		Locale LocaleVN = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(LocaleVN);
		System.out.printf("\nTổng thành tiền sách giáo khoa: %s\n", nf.format(l.tinhTongThanhTienSGK()));

		System.out.println("Nhập tên nhà xuất bản cần xuất thông tin: ");
		Scanner sc = new Scanner(System.in);
		String k = sc.nextLine();

		List<Sach> kq = l.timSachGiaoKhoaTheoNXB(k);
		String result = "";
		for (Sach sach : kq) {
			result += sach + "\n";
		}
		sc.close();
		
		System.out.println("Kết quả tìm kiếm: ");
		if(result != ""){
			System.out.println(Sach.taoTieuDe());
			System.out.println(result);
		}
		else
			System.out.println("Không tìm thấy nhà xuất bản này.");
	}
}
