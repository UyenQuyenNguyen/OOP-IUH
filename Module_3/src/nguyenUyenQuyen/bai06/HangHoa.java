package nguyenUyenQuyen.bai06;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;


public abstract class HangHoa {
	protected String maHang, tenHang;
	protected double donGia;
	protected int soLuongTon;
	/**
	 * 
	 */
	public HangHoa() {
		maHang = "xxx";
		tenHang = "xxx";
		donGia = 0;
		soLuongTon = 0;
	}
	/**
	 * @param maHang
	 * @param tenHang
	 * @param donGia
	 * @param soLuongTon
	 */
	public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) {
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setSoLuongTon(soLuongTon);
	}
	public String getMaHang() {
		return maHang;
	}
	private void setMaHang(String maHang) {
		if(!maHang.trim().equals(""))
			this.maHang = maHang;
		else
			this.maHang = "xxx";
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		if(!tenHang.trim().equals(""))
			this.tenHang = tenHang;
		else
			this.tenHang = "xxx";
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		if(donGia >= 0)
			this.donGia = donGia;
		else
			this.donGia = 0;
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) {
		if(soLuongTon >= 0)
			this.soLuongTon = soLuongTon;
		else
			this.soLuongTon = 0;
	}
	
	protected abstract String danhGiaMucDoBanBuon();
	
	protected abstract double tinhVAT();
	
	@Override
	public String toString() {
		Locale localVN = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(localVN);
		return String.format("%-10s%-25s%-15s%-10d%-25s%-15.2f", maHang, tenHang, nf.format(donGia), soLuongTon, danhGiaMucDoBanBuon(), tinhVAT());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(maHang);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HangHoa other = (HangHoa) obj;
		return maHang == other.maHang;
	}

	
	
	
	
}
