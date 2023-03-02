package nguyenUyenQuyen.bai11;

import java.time.LocalDate;


public class KhachHang {
	private String maKH, hoTenKH;
	private SoTietKiem[] dsSoTietKiem;
	private int soLuongSoHienCo;

	/**
	 * @param maKH
	 * @param hoTenKh
	 * @param Số
	 *            lượng sổ tiết kiệm tối đa được mở
	 */
	public KhachHang(String maKH, String hoTenKH, int soMoi) throws Exception {
		setMaKH(maKH);
		setHoTenKH(hoTenKH);
		if (soMoi > 0)
			this.dsSoTietKiem = new SoTietKiem[soMoi];
		else
			this.dsSoTietKiem = new SoTietKiem[1];
		this.soLuongSoHienCo = 0;
	}

	public String getMaKH() {
		return maKH;
	}

	private void setMaKH(String maKH) throws Exception {
		if (!maKH.trim().equals("")) {
			this.maKH = maKH;
		} else
			throw new Exception("Loi: Ma khach hang rong !");
	}

	public String getHoTenKh() {
		return hoTenKH;
	}

	public void setHoTenKH(String hoTenKH) {
		if (!hoTenKH.trim().equals("")) {
			this.hoTenKH = hoTenKH;
		}
	}

	public SoTietKiem[] getDsSoTietKiem() {
		return dsSoTietKiem;
	}

	public int getSoLuongSoHienCo() {
		return soLuongSoHienCo;
	}

	public boolean themSoTietKiem(String maSo, LocalDate ngayMoSo,
			double soTienGoi, int kyHan, float laiSuat) throws Exception {
		if (soLuongSoHienCo < dsSoTietKiem.length) {
			dsSoTietKiem[soLuongSoHienCo ++] = new SoTietKiem(maSo, ngayMoSo,
					soTienGoi, kyHan, laiSuat);
			return true;
		}
		return false;
	}

	public String toString() {
		String s = "";
		for (SoTietKiem x : dsSoTietKiem) {
			if (x == null);
			s += x +"\n";
		}
	 return String.format("Khách hàng: %s - %s \n%s", maKH, hoTenKH,s);
	}

}
