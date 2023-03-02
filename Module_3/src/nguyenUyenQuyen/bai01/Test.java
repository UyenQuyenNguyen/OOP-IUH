package nguyenUyenQuyen.bai01;

import java.text.DecimalFormat;

public class Test {
	public static void main(String[] args) {
		ChuyenXe cx[] = new ChuyenXe[4];
		cx[0] = new ChuyenXeNgoaiThanh("111", "Nguyễn Uyển Quyên", "69 - T3", 9000000, "Tp. Cà Mau", 1);
		cx[1] = new ChuyenXeNgoaiThanh("112", "Nguyễn Uyển Quyên", "69 - T3", 9000000, "Tp. Cà Mau", 1);
		cx[2] = new ChuyenXeNoiThanh("113", "Nguyen Van B", "A212421", 500000, 5, 300);
		cx[3] = new ChuyenXeNoiThanh("114", "Trương Thị Y", "A212422", 500000, 5, 300);
		System.out.println(ChuyenXe.taoTieuDe());
		for (ChuyenXe chuyenXe : cx) {
			System.out.println(chuyenXe);
		}
		DecimalFormat df = new DecimalFormat("#,##0.00");
		System.out.println("Tổng doanh thu cho tất cả các chuyến xe: "+df.format(getTongDoanhThu(cx)));
		System.out.println("Tổng doanh thu cho chuyến xe ngoại thành: "+df.format(getDoanhThuChuyenXeNgoaiThanh(cx)));
		System.out.println("Tổng doanh thu cho chuyến xe nội thành: "+df.format(getDoanhThuChuyenXeNoiThanh(cx)));
	}
	public static double getTongDoanhThu(ChuyenXe cx[]) {
		double tong = 0;
		for (ChuyenXe chuyenXe : cx) {
			tong += chuyenXe.getDoanhThu();
		}
		return tong;
	}
	public static double getDoanhThuChuyenXeNgoaiThanh(ChuyenXe cx[]) {
		double tong = 0;
		for (ChuyenXe chuyenXe : cx) {
			if(chuyenXe instanceof ChuyenXeNgoaiThanh) {
				tong += chuyenXe.getDoanhThu();
			}
		}
		return tong;
	}
	public static double getDoanhThuChuyenXeNoiThanh(ChuyenXe cx[]) {
		double tong = 0;
		for (ChuyenXe chuyenXe : cx) {
			if(chuyenXe instanceof ChuyenXeNoiThanh) {
				tong += chuyenXe.getDoanhThu();
			}
		}
		return tong;
	}
}
