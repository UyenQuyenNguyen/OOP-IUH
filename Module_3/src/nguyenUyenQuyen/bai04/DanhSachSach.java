package nguyenUyenQuyen.bai04;

import java.util.ArrayList;
import java.util.List;

public class DanhSachSach {
	private Sach[] list;
	private int count;

	public DanhSachSach(int n) {
		list = new Sach[n];
		count = 0;
	}

	public boolean themSach(Sach s) {
		if (count < list.length) {
			list[count] = s;
			count++;
			return true;
		}
		return false;
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < count; i++) {
			s += list[i] + "\n";
		}
		return s;
	}
	
	public double tinhTongThanhTienSGK(){
		double total = 0;
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof SachThamKhao) {
				total += list[i].getThanhTien();
			}
		}
		return total;
	}
	
	public double tinhTongThanhTienSTK(){
		double total = 0;
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof SachThamKhao) {
				total += list[i].getThanhTien();
			}
		}
		return total;
	}

	public List<Sach> timSachGiaoKhoaTheoNXB(String nxb) {
		List<Sach> kq = new ArrayList<Sach>();
		for (int i = 0; i < count; i++) {
			if (list[i].getNhaXuatBan().trim().equalsIgnoreCase(nxb))
				kq.add(list[i]);
		}
		return kq;
	}

	public double timThanhTienCaoNhat() {
		double max = list[0].getThanhTien();
		for (Sach sach : list) {
			if (max < sach.getThanhTien())
				max = sach.getThanhTien();
		}
		return max;
	}
}
