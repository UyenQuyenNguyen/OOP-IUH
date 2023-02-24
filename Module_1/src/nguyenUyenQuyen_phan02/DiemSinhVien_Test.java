package nguyenUyenQuyen_phan02;

import java.util.Scanner;

public class DiemSinhVien_Test {
	public static void main(String[] args) {
		try{
		//Tạo sv1 bằng constructor đầy đủ tham số
		DiemSinhVien sv1 = new DiemSinhVien(21124421, "Nguyen Uyen Quyen", 10, 9);
		System.out.println(sv1.toString());
		
		//Tao sv2 bằng constructor mặc định
		DiemSinhVien sv2 = new DiemSinhVien();
		sv2.setMaSV(12345678);
		sv2.setHoTen("Nguyen Van A");
		sv2.setDiemLyThuyet(9);
		sv2.setDiemThucHanh(8);
		
		System.out.println(sv2.toString());
		
		//Tạo sv3 nhập thông tin từ bàn phím
		DiemSinhVien sv3 = new DiemSinhVien();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma sinh vien: ");
		int maSV = sc.nextInt();
		Integer.parseInt(sc.nextLine());
		System.out.println("Nhap ho va ten sinh vien: ");
		String hoTen = sc.nextLine();
		System.out.println("Nhap diem ly thuyet: ");
		float diemLT = sc.nextFloat();
		System.out.println("Nhap diem thuc hanh: ");
		float diemTH = sc.nextFloat();
		
		sv3 = new DiemSinhVien(maSV, hoTen, diemLT, diemTH);
		System.out.println(sv3.toString());
		
		sc.close(); 
		
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
