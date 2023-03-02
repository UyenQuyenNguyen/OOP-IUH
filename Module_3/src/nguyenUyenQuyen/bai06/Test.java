package nguyenUyenQuyen.bai06;


import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachHangHoa ds = new DanhSachHangHoa();
		ds.themHangHoa(new HangThucPham("111", "Bí Ngô", 15000, 0, "Bach Hoa Xanh", LocalDate.of(2022, 9, 30), LocalDate.of(2022, 10, 29)));
		ds.themHangHoa(new HangThucPham("112", "Thịt Bằm", 10000, 10, "Coop. Food", LocalDate.of(2022, 10, 20), LocalDate.of(2022, 10, 30)));
		ds.themHangHoa(new HangDienMay("113", "HP Victus 16", 20000000, 1, 12, 400));
		ds.themHangHoa(new HangSanhSu("114", "Ly Gốm", 10000, 60, LocalDate.of(2022, 5, 30), LocalDate.of(2022, 9, 30)));
		int key = 1;
		while(true){
			Menu();
			key = sc.nextInt();
			switch(key){
			case 0:
				System.out.println("Goodbye !");
				System.exit(0);
				break;
			case 1: 
				MenuPhanLoai();
				int choice = sc.nextInt();
				System.out.println("Mã hàng: ");
				sc.nextLine();
				String maHang = sc.nextLine();
				
				System.out.println("Tên hàng: ");
				String tenHang = sc.nextLine();
				
				System.out.println("Đơn giá: ");
				double donGia = sc.nextDouble();
				
				System.out.println("Số lượng tồn: ");
				int soLuongTon = sc.nextInt();
				switch(choice){
				case 1:{
					
					System.out.println("Nhà cung cấp: ");
					sc.nextLine();
					String nhaCungCap = sc.nextLine();
					
					System.out.println("Ngày sản xuất: ");
					String NSX = sc.nextLine();
					LocalDate ngaySanXuat = LocalDate.parse(NSX);
					
					System.out.println("Ngày hết hạn: ");
					
					String HSD = sc.nextLine();
					LocalDate ngayHetHan = LocalDate.parse(HSD);
					Scanner s = new Scanner(System.in);
					if(ds.themHangHoa(new HangThucPham(maHang, tenHang, donGia, soLuongTon, nhaCungCap, ngaySanXuat, ngayHetHan))){
						System.out.println("Thêm thành công!");
					}else
						System.out.println("Trùng mã, thêm thất bại !");
					break;
					}
				
				case 2:{
					
					System.out.println("Thời gian bảo hành: ");
					int thoiGianBaoHanh = sc.nextInt();
					
					System.out.println("Công suất: ");
					int congSuat = sc.nextInt();
					
					if(ds.themHangHoa(new HangDienMay(maHang, tenHang, donGia, soLuongTon, thoiGianBaoHanh, congSuat))){
						System.out.println("Thêm thành công!");
					}else
						System.out.println("Trùng mã, thêm thất bại !");
					break;
					}
					
				case 3:{
					System.out.println("Ngày Sản Xuất: ");
					sc.nextLine();
					String NSX = sc.nextLine();
					LocalDate ngaySanXuat = LocalDate.parse(NSX);
					
					System.out.println("Ngày Nhập Kho: ");
					Scanner s = new Scanner(System.in);
					String NNK = s.nextLine();
					LocalDate ngayNhapKho = LocalDate.parse(NNK);

					if(ds.themHangHoa(new HangSanhSu(maHang, tenHang, donGia, soLuongTon, ngaySanXuat, ngayNhapKho))){
						System.out.println("Thêm thành công!");
					}else
						System.out.println("Trùng mã, thêm thất bại !");
						}
					break;
				}
				case 2:
					System.out.println("--------------------------------- DANH SÁCH HÀNG HÓA ---------------------------------");
					System.out.println(ds);
					break;
				case 3:
					MenuPhanLoai();
					int choice2 = sc.nextInt();
					switch(choice2){
					case 1: 
						ds.xuatHangHoaTheoPhanLoai(LoaiHang.HANGTHUCPHAM);
						break;
					case 2: 
						ds.xuatHangHoaTheoPhanLoai(LoaiHang.HANGDIENMAY);
						break;
					case 3: 
						ds.xuatHangHoaTheoPhanLoai(LoaiHang.HANGSANHSU);
						break;
					}
					break;
				case 4:
					System.out.println("Nhập tên hàng hóa cần tìm: ");
					Scanner s = new Scanner(System.in);
					String maTim = s.nextLine();
					DanhSachHangHoa kq = ds.timKiem(maTim);
					if(kq.getLength() != 0){
						System.out.println(kq);
					}else
						System.out.println("Không tìm thấy !");
					break;
				case 5:
					ds.SapXepTenTang();
					System.out.println(ds);
					break;
				case 7:
					List<HangHoa> x = ds.layDanhSachThucPhamKhoBan();
					String re = "";
					for (HangHoa hangHoa : x) {
						re += hangHoa + "\n";
					}
					if(re != "")
						System.out.println(re);
					else 
						System.out.println("Không tìm thấy !");
					break;
			}
		}
	}
	
	static void Menu(){
		System.out.println(">>>------------------------------ CHƯƠNG TRÌNH QUẢN LÝ HÀNG HÓA ------------------------------<<<");
		System.out.println("1. Thêm một hàng hóa vào danh sách.");
		System.out.println("2. xuất danh sách tất car hàng hóa.");
		System.out.println("3. Xuất danh sách hàng hóa theo phân loai.");
		System.out.println("4. Tìm kiếm hàng hóa bằng mã hàng.");
		System.out.println("5. Sắp xếp danh sách tăng dần theo tên.");
		System.out.println("6. Sắp xếp danh sách giảm dầm theo số lượng tồn");
		System.out.println("7. Lấy danh sách thực phẩm khó bán.");
		System.out.println("8. Xóa hàng hóa bằng mã hàng.");
		System.out.println("9. Sửa thông tin hàng hóa bằng mã hàng.");
		System.out.println(">>> Nhap lua chon: ");
	}
	
	static void MenuPhanLoai(){
		System.out.println("--- Chọn phân loại hàng hóa ---");
		System.out.println("1. Hàng thực phẩm.");
		System.out.println("2. Hàng điện máy.");
		System.out.println("3. Hàng sành sứ.");
		System.out.println("- Nhap lua chon: ");
	}
	

}

