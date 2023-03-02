package nguyenUyenQuyen.bai03;
import java.time.LocalDate;
public class Test {
	public static void main(String[] args) {
		GiaoDich gd[] = new GiaoDich[3];
		gd[0] = new GiaoDichTienTe("111", LocalDate.of(2022,8,10), 1000000, 12, 23885, LoaiTienTe.USD);
		gd[1] = new GiaoDichVang("112", LocalDate.of(2022,8,10), 1000, 12,"SJC");
		gd[2] = new GiaoDichTienTe("113", LocalDate.of(2022,8,10), 1000, 12, 24438, LoaiTienTe.EURO);
//		GiaoDichTienTe tt = new GiaoDichTienTe("111", LocalDate.of(2022,8,10), 1000, 12, 23885, "USD");
//		GiaoDichVang v = new GiaoDichVang("111", LocalDate.of(2022,8,10), 1000, 12,"SJC");
		System.out.println(GiaoDich.taoTieuDe());
		for (GiaoDich giaoDich : gd) {
			System.out.println(giaoDich);
		}
		System.out.println("Tong so luong gia dich: " + gd.length);
		System.out.println("Tong giao dich vang: " +getSoLuongGiaoDichVang(gd));
		System.out.printf("Tong so giao dich tien te: %d\n", gd.length - getSoLuongGiaoDichVang(gd));
		System.out.println("Tong thanh tien trung binh cua giao dich tien te: " + tinhTrungBinhThanhTienCuaGiaoDichTienTe(gd));
		System.out.println(GiaoDich.taoTieuDe());
		xuatGiaoDichLonHon1Ty(gd);
	}
	
	public static int getSoLuongGiaoDichVang(GiaoDich gd[]){
		int count = 0;
		for (GiaoDich giaoDich : gd) {
			if(giaoDich instanceof GiaoDichVang){
				count++;
			}
		}
		return count;
	}
	
	public static double tinhTrungBinhThanhTienCuaGiaoDichTienTe(GiaoDich gd[]){
		int count = 0;
		double total = 0;
		for (GiaoDich x : gd) {
			if(x instanceof GiaoDichTienTe){
				total += x.getThanhTien();
				count++;
			}
		}
		return total/count;
	}
	
	public static void xuatGiaoDichLonHon1Ty(GiaoDich gd[]){
		GiaoDich[] result = new GiaoDich[gd.length];
		for (int i = 0; i < result.length; i++) {
			if(gd[i].getThanhTien() > 1000000000){
				System.out.println(gd[i]);
			}
		}
	}
	
	
}
