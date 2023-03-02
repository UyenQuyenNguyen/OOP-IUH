 package nguyenUyenQuyen.bai13;

public class DanhSachCongNhan {
	private int count;
	private CongNhan[] danhSach;

	/**
	 * 
	 */
	public DanhSachCongNhan() {
		danhSach = new CongNhan[1];
		count = 0;

	}

	/**
	 * @param count
	 * @param dsCongNhan
	 */
	public DanhSachCongNhan(int n) {
		if (n > 0)
			danhSach = new CongNhan[n];
		else
			danhSach = new CongNhan[1];
		count = 0;
	}

	public boolean ThemCongNhan(int mMa, String mHo, String mTen, int mSoSP) {
		if (count < danhSach.length && KiemTraTrungMa(mMa) == -1) {
			danhSach[count++] = new CongNhan(mMa, mHo, mTen, mSoSP);
			return true;
		} else
			return false;
	}

	private int KiemTraTrungMa(int mMa) {
		int i = 0;
		int flag = -1;
		while (i < count) {
			if (mMa == danhSach[i].getmMa()) {
				flag = i;
				break;
			}
			i++;
		}
		return flag;
	}

	public int getSoLuongCongNhan() {
		return count;
	}

	public boolean XoaCongNhanTheoMa(int mMa) {
		if (KiemTraTrungMa(mMa) == -1) {
			for (int i = KiemTraTrungMa(mMa); i < count - 1; i++) {
				danhSach[i] = danhSach[i + 1];
			}
			count--;
			return true;
		} else
			return false;
	}

	public String getDanhSachCongNhanLamTren200SanPham()throws Exception {
		String s = "";
		if(count == danhSach.length){
			for (CongNhan x : danhSach) {
				if (x.getmSoSP() > 200) {
					s += x + "\n";
				}
			}
		}
		else
			throw new Exception("Nhập công nhân bằng kích thước mảng khai báo !");
		return s;
	}

	private void Swap(CongNhan danhSach[], int i, int j, CongNhan temp) {
		temp = danhSach[i];
		danhSach[i] = danhSach[j];
		danhSach[j] = temp;
	}

	public void SapXepTheoSoSanPhamGiamDan() {
		CongNhan temp = null;
		for (int i = 0; i < count -1; i++){
			for (int j = i +1 ; j < count; j++) {
				if (danhSach[i].getmSoSP() > danhSach[j].getmSoSP())
					Swap(danhSach, i, j, temp);

			}
		}
	}

	public String getTieuDe() {
		return String.format("%10s %20s %10s %15s %15s\n", "MA SO", "HO",
				"TEN", "SO SAN PHAM", "TIEN LUONG");
	}

	public String toString() {
		String s = "";
		for (CongNhan x : danhSach) {
			s += x + "\n";
		}
		return String.format("%s", s);

	}

	public static void Menu() {
		System.out
				.println(">>>---------------------------------CHUONG TRINH QUAN LY CONG NHAN---------------------------------<<<");
		System.out.println("1. Chương trình chính");
		System.out.println("2. Thêm công nhân vào danh sách.");
		System.out.println("3. Lấy số lượng công nhân có trong danh sách.");
		System.out.println("4. Xóa công nhân bằng mã");
		System.out
				.println("5. Xuất danh sách công nhân làm trên 200 sản phẩm.");
		System.out.println("6. Sắp xếp công nhân theo số sản phẩm.");
		System.out.println("0. Thoát chương trình. ");
		System.out.println(">>> Nhập lựa chọn: ");
	}

}
