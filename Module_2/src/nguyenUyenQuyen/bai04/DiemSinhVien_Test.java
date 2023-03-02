package nguyenUyenQuyen.bai04;

import java.util.Scanner;

public class DiemSinhVien_Test {
	public static void main(String[] args) {
		try{
		//Tạo sv1 bằng constructor đầy đủ tham số
		DiemSinhVien sv1 = new DiemSinhVien(21124421, "Nguyen Uyen Quyen", 10, 9);
		
		//Tao sv2 bằng constructor mặc định
		DiemSinhVien sv2 = new DiemSinhVien();
		sv2.setMaSV(21212121);
		sv2.setHoTen("Nguyen Van A");
		sv2.setDiemLyThuyet(9);
		sv2.setDiemThucHanh(8);
		
		//Tạo sv3 nhập thông tin từ bàn phím
		DiemSinhVien sv3 = new DiemSinhVien();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Tao sinh vien 3");
		System.out.println("Nhap ma sinh vien: ");
		int maSV = sc.nextInt();
		
		System.out.println("Nhap ho va ten sinh vien: ");
		sc = new Scanner(System.in);
		String hoTen = sc.nextLine();
		System.out.println("Nhap diem ly thuyet: ");
		sc = new Scanner(System.in);
		float diemLT = sc.nextFloat();
		System.out.println("Nhap diem thuc hanh: ");
		sc = new Scanner(System.in);
		float diemTH = sc.nextFloat();
		
		sv3 = new DiemSinhVien(maSV, hoTen, diemLT, diemTH);
		
		System.out.println(DiemSinhVien.taoTieuDe());
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		sc.close(); 
		
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
