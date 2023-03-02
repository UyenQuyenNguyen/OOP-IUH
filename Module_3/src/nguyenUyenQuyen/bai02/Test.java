package nguyenUyenQuyen.bai02;
import java.time.LocalDate;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Sach s[] = new Sach[3];
		s[0] = new SachGiaoKhoa("111", LocalDate.of(2022,10,8), 100000, 10, "Trẻ", true);
		s[1] = new SachThamKhao("111", LocalDate.of(2022,10,8), 200000, 10, "Nhi Đồng", 1000);
		s[2] = new SachThamKhao("111", LocalDate.of(2022,10,8), 200000, 10, "Nhi Đồng", 1000);
		System.out.println(Sach.taoTieuDe());
		for (Sach sach : s) {
			System.out.println(sach);
		}
		DecimalFormat df = new DecimalFormat("#,##0.00");
		System.out.println("Tong thanh tien tat ca: " + df.format(getTongThanhTien(s)));
		System.out.println("Tong tien Sach Giao Khoa: " + df.format(getThanhTienSachGiaoKhoa(s)));
		System.out.println("Tong tien Sach Tham Khao: " + df.format(getThanhTienSachThamKhao(s)));
		System.out.println("Nhập tên nhà xuất bản cần xuất thông tin: ");
		Scanner sc = new Scanner(System.in);
		String K = sc.nextLine();
		System.out.println(Sach.taoTieuDe());
		xuatSachGiaoKhoaCuaNhaXuatBanK(K, s);
		System.out.println("Sach thanh tien cao nhat la: " + df.format(getThanhTienCaoNhat(s)));
	}
	public static double getTongThanhTien(Sach s[]){
		double total = 0;
		for (Sach sach : s) {
			total += sach.getThanhTien();
		}
		return total;
	}
	public static double getThanhTienSachGiaoKhoa(Sach s[]){
		double total = 0;
		for (Sach sach : s) {
			if(sach instanceof SachGiaoKhoa){
				total += sach.getThanhTien();
			}
		}
		return total;
	}
	public static double getThanhTienSachThamKhao(Sach s[]){
		double total = 0;
		for (Sach sach : s) {
			if(sach instanceof SachThamKhao){
				total += sach.getThanhTien();
			}
		}
		return total;
	}
	
	public static void xuatSachGiaoKhoaCuaNhaXuatBanK(String K, Sach s[]){
		boolean flag = false; //Khong tim thay
		for(int i = 0; i < s.length; i++){
			if(s[i].getNXB().equalsIgnoreCase(K)){
				System.out.println(s[i]);
				flag = true;
			}
		}
		if(!flag)
			System.out.println("Khong tim thay !");
	}
	
	public static double getThanhTienCaoNhat(Sach s[]){
		double max = 0;
		for (int i = 0; i < s.length; i++) {
			if(max < s[i].getThanhTien()){
				max = s[i].getThanhTien();
			}
		}
		return max;
	}
	
}
