package nguyenUyenQuyen.bai13;
import java.util.Scanner;
public class Test {
		public static void main(String[] args)throws Exception {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập số lượng công nhân: ");
			int x = sc.nextInt();
			DanhSachCongNhan ds = new DanhSachCongNhan(x);
			ds.ThemCongNhan(111, "Trinh Tran Phuong", "Tuan", 500);
			ds.ThemCongNhan(112, "Entertaiment", "J - 97", 300);
			ds.ThemCongNhan(113, "Nguyễn Bảo", "Khánh", 99);
			ds.ThemCongNhan(114, "DJ", "K-ICM", 80);
			ds.ThemCongNhan(115, "Đom", "Đóm", 250);
			DanhSachCongNhan.Menu();
			boolean flag = true;
			while(flag){
				int key = sc.nextInt();
				switch(key){
				case 0:
					System.out.println("Goodbye !");
					flag = false;
					break;
				case 1: 
					DanhSachCongNhan.Menu();
					break;
				case 2:
					System.out.println("Nhập mã công nhân: ");
					int mMa = sc.nextInt();
					System.out.println("Nhập họ công nhân: ");
					sc.nextLine();
					String mHo = sc.nextLine();
					System.out.println("Nhập tên công nhân: ");
					String mTen = sc.nextLine();
					System.out.println("Nhập số sản phẩm: ");
					sc = new Scanner(System.in);
					int mSoSP = sc.nextInt();
					if(ds.ThemCongNhan(mMa,mHo,mTen,mSoSP)){
						System.out.println("Thêm thành công! Nhập 1 để tiếp tục.");
					}else
						System.out.println("Thêm thất bại! Kiểm tra trùng mã hoặc kích thước mảng.");
					break;
				case 3: 
					System.out.printf("Số lượng công nhân trong danh sách là: %d", ds.getSoLuongCongNhan());
					System.out.println("\nNhập 1 để tiếp tục.");
					break;
				case 4:
					System.out.println("\nNhập mã cồn nhân để xóa: ");
					mMa = sc.nextInt();
					if(ds.XoaCongNhanTheoMa(mMa)){
						System.out.println("Xóa thành công !");
						System.out.println(ds);
					}else
						System.out.println("Xóa không thành công do không tìm thấy mã");
					break;
				case 5: 
					try{
						System.out.print(ds.getTieuDe());
						System.out.println(ds.getDanhSachCongNhanLamTren200SanPham());
						System.out.println("\nNhập 1 để tiếp tục.");
					}
					catch(Exception e){
						System.out.println(e.getMessage());
						System.out.println("Nhập 2 để nhập công nhân.");
					}
					break;
				case 6: 
					ds.SapXepTheoSoSanPhamGiamDan();
					System.out.print(ds.getTieuDe());
					System.out.println(ds);
					System.out.println("Nhập 1 để tiếp tục.");
					break;
				default: 
					System.out.println("Không có chức năng này ! Nhập 1 để tiếp tục hoặc nhập 0 để siêu thoát.");
				}
			}
		}
}
