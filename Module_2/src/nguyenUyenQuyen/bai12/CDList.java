package nguyenUyenQuyen.bai12;

public class CDList {
	private CD[] danhSach;
	private int soLuong;

	/**
	 * Khởi tạo ds với số lượng n,mặc định 1
	 * 
	 * @return
	 */
	/**
	 * @param danhSach
	 * @param soLuong
	 */
	public CDList(int n) {
		if (n > 0)
			danhSach = new CD[n];
		else
			danhSach = new CD[1];
		soLuong = 0;
	}

	public boolean themMotCD(int maCD, int soBaiHat, String tuaCD, float giaThanh) {
		if (soLuong < danhSach.length && kiemTraTrungMa(maCD) == -1) {
			danhSach[soLuong++] = new CD(maCD, soBaiHat, tuaCD, giaThanh);
			return true;
		} else
			return false;
	}

	/**
	 * 
	 * @param maCD
	 * @return vi tri cua CD trong danh sach neu trung ma nguoc lai, tra ve -1
	 */
	private int kiemTraTrungMa(int maCD) {
		int i = 0;
		int flag = -1;
		while (i < soLuong) {
			if (maCD == danhSach[i].getMaCD()) {
				flag = i;
				break;
			}
			i++;
		}
		return flag;
	}

	public int tinhSoLuongCD() {
		return soLuong;
	}

	public boolean xoaCDTheoMa(int maCD) {
		if (kiemTraTrungMa(maCD) != -1) {
			for (int i = kiemTraTrungMa(maCD); i < soLuong - 1; i++) {
				danhSach[i] = danhSach[i + 1];
			}
			soLuong--;
			return true;
		} else
			return false;
	}

	public float tinhTongGiaCD() {
		float giaThanh = 0;
		for (int i = 0; i < soLuong; i++) {
			giaThanh += danhSach[i].getGiaThanh();
		}
		return giaThanh;
	}

	public CD timCDTheoMa(int maCD) {
		CD cd = new CD();
		if (kiemTraTrungMa(maCD) != -1) {
			return danhSach[kiemTraTrungMa(maCD)];
		} else
			return cd;
	}

	/*
	 * public boolean timCDTheoMa(int maCD) { return kiemTraTrungMa(maCD) ? true
	 * : false; }
	 */

	/*
	 * public int timCDTheoMa(int maCD){ if(kiemTraTrungMa(maCD)!=1) return
	 * kiemTraTrungMa(maCD); return -1; }
	 * 
	 * public String getThongTin(int maCD) { String s = ""; if
	 * (kiemTraTrungMa(maCD) != -1) { s =
	 * danhSach[kiemTraTrungMa(maCD)].toString(); } return s; }
	 */

	private void swap(CD danhSach[], int i, int j, CD temp) {
		temp = danhSach[i];
		danhSach[i] = danhSach[j];
		danhSach[j] = temp;
	}

	public void sapXepGiamDanTheoGia() {
		CD temp = null;
		for (int i = 0; i < soLuong - 1; i++) {
			for (int j = i + 1; j < soLuong; j++) {
				if (danhSach[i].getGiaThanh() < danhSach[j].getGiaThanh())
					swap(danhSach, i, j, temp);
			}
		}
	}

	public void tangDanTheoTuaCD() {
		CD temp = null;
		for (int i = 0; i < soLuong - 1; i++) {
			for (int j = i + 1; j < soLuong; j++) {
				if (danhSach[i].getTuaCD().compareToIgnoreCase(
						danhSach[j].getTuaCD()) > 0)
					swap(danhSach, i, j, temp);
			}
		}
	}

	public String getTieuDe() {
		return String.format("%-15s %-20s %-15s %-15s", "Mã CD", "Tựa CD",
				"Số bài hát", "Giá thành");
	}
	
	public CD timCDGiaThanhLonNhat(){
		int max = 0;
		for (int i = 0; i < soLuong - 1; i++) {
			if(danhSach[max].getGiaThanh() < danhSach[i].getGiaThanh()){
				max = i; 
			}
		}
		return danhSach[max];
	}

	public String toString() {
		String s = "";
		for (CD cd : danhSach) {
			s += cd;
		}
		return  s;
	}

	

}
