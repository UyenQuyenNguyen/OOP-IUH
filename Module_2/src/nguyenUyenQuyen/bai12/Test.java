package nguyenUyenQuyen.bai12;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng CD: ");
		int x = sc.nextInt();
		CDList cdlist = new CDList(x);
		Menu();
		boolean daNhap = false;
		boolean flag = true;
		int key = 1;
		while (flag) {
			key = sc.nextInt();
			switch (key) {
			case 0:
				System.out.println("Goodbye !");
				flag = false;
				break;
			case 1:
				Menu();
				break;
			case 2:
				cdlist.themMotCD(111, 3, "Hồng Nhan", 5000000);
				cdlist.themMotCD(112, 4, "Bạc Phận", 5250000);
				cdlist.themMotCD(113, 2, "Sóng Gió", 5750000);
				cdlist.themMotCD(114, 3, "Đom Đóm", 5500000);
				cdlist.themMotCD(115, 1, "Ngôi Sao Cô Đơn", 5000000);
				daNhap = true;
				System.out.println("\nNhập thành công ! Nhập 1 để tiếp tục.");
				break;
			case 3:
				System.out.println("Nhập mã CD:");
				int maCD = sc.nextInt();
				System.out.println("Nhập Tựa CD: ");
				sc.nextLine();
				String TuaCD = sc.nextLine();
				System.out.println("Nhập số bài hát: ");
				int soBaiHat = sc.nextInt();
				System.out.println("Nhập giá thành: ");
				float giaThanh = sc.nextFloat();
				if (cdlist.themMotCD(maCD, soBaiHat, TuaCD, giaThanh)) {
					System.out.println("Thêm thành công! Nhập 1 để tiếp tục.");
					daNhap = true;
				} else
					System.out
							.println("Thêm thất bại! Kiểm tra trùng mã hoặc kích thước mảng.");
				break;
			case 4:
				if (daNhap) {
					System.out
							.println(">>>------------------------DANH SACH CD------------------------<<<");
					System.out.println(cdlist.getTieuDe());
					System.out.println(cdlist);
				} else
					System.out.println("Mời nhập danh sách.");
				System.out.println("Nhập 1 để tiếp tục.");
				break;
			case 5:
				if (daNhap) {
					System.out.printf(
							"Số lượng CD có trong danh sách là: %d\n",
							cdlist.tinhSoLuongCD());
				} else
					System.out.println("Mời nhập danh sách.");
				System.out.println("Nhập 1 để tiếp tục.");
				break;
			case 6:
				if (daNhap) {
					System.out.println("Nhập mã cần xóa: ");
					maCD = sc.nextInt();
					if (cdlist.xoaCDTheoMa(maCD))
						System.out.println("Xóa thành công!");
					else
						System.out
								.println("Xóa không thành công vì không tìm thấy mã cần xóa!");
				} else
					System.out.println("Mời nhập danh sách.");
				System.out.println("Nhập 1 để tiếp tục.");
				break;
			case 7:
				if (daNhap) {
					System.out.printf("Tổng giá thành của các CD là: %.2f\n",
							cdlist.tinhTongGiaCD());
				} else
					System.out.println("Mời nhập danh sách.");
				System.out.println("Nhập 1 để tiếp tục.");
				break;
			case 8:
				if (daNhap) {
					System.out.println("Nhập mã cần tìm: ");
					maCD = sc.nextInt();

					if (cdlist.timCDTheoMa(maCD).getMaCD() != 999999) {
						System.out.println(cdlist.getTieuDe());
						System.out.println(cdlist.timCDTheoMa(maCD));
					} else
						System.out.println("Không tìm thấy !");
				} else
					System.out.println("Mời nhập danh sách.");
				System.out.println("Nhập 1 để tiếp tục.");
				break;
			case 9:
				if (daNhap) {
					cdlist.sapXepGiamDanTheoGia();
					System.out.println(cdlist.getTieuDe());
					System.out.println(cdlist);
				} else
					System.out.println("Mời nhập danh sách.");
				System.out.println("Nhập 1 để tiếp tục.");
				break;
			case 10:
				if (daNhap) {
					cdlist.tangDanTheoTuaCD();
					System.out.println(cdlist.getTieuDe());
					System.out.println(cdlist);
				} else
					System.out.println("Mời nhập danh sách.");
				System.out.println("Nhập 1 để tiếp tục.");
				break;
			case 11:
				if(daNhap){
					CD cd = cdlist.timCDGiaThanhLonNhat();
					System.out.println(cdlist.getTieuDe());
					System.out.println(cd);
				}
				break;
			default:
				System.out
						.println("Không có chức năng này ! Nhập 1 để tiếp tục hoặc nhập 0 để siêu thoát.");

			}
		}
	}
	public static void Menu() {
		System.out
				.println(">>>----------------------------CHƯƠNG TRÌNH QUẢN LÝ CD----------------------------<<<");
		System.out.println("1. Chương trình chính.");
		System.out.println("2. Nhập danh sách mặc định của chuơng trình.");
		System.out
				.println("3. Thêm một CD vào danh sách nếu kích thước mảng cho phép, không thêm trùng mã.");
		System.out
				.println("4. Trả thông tin của toàn bộ CD có trong danh sách.");
		System.out.println("5. Tính số lượng CD có trong danh sách.");
		System.out.println("6. Xóa CD theo mã.");
		System.out.println("7. Tính tổng giá thành của các CD.");
		System.out.println("8. Tìm kiếm theo mã CD.");
		System.out.println("9. Sắp xếp danh sách giảm dần theo giá thành.");
		System.out.println("10. Sắp xếp danh sách tăng dần theo tựa CD.");
		System.out.println("11. Xuất CD có giá thành cao nhất.");
		System.out.println("0. Thoát chương trình !");
		System.out.println(">>> Nhập lựa chọn: ");
	}
}
