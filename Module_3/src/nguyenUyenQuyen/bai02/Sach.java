package nguyenUyenQuyen.bai02;

import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Sach {
	private String maSach;
	private LocalDate ngayNhap;
	private double donGia;
	private int soLuong;
	private String NXB;

	/**
	 * 
	 */
	public Sach() {
		maSach = "xxx";
		ngayNhap = LocalDate.now();
		donGia = 9999999;
		soLuong = 999999;
		NXB = "xxx";
	}

	/**
	 * @param maSach
	 * @param ngayNhap
	 * @param donGia
	 * @param soLuong
	 * @param nXB
	 */
	public Sach(String maSach, LocalDate ngayNhap, double donGia, int soLuong,
			String NXB) {
		setMaSach(maSach);
		setNgayNhap(ngayNhap);
		setDonGia(donGia);
		setSoLuong(soLuong);
		setNXB(NXB);
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		if(!maSach.trim().equals(""))
			this.maSach = maSach;
		else
			maSach = "xxx";
	}

	public LocalDate getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(LocalDate ngayNhap) {
		if(ngayNhap.isAfter(LocalDate.now()))
			ngayNhap = LocalDate.now();
		else
			this.ngayNhap = ngayNhap;
		
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		if(donGia > 0)
			this.donGia = donGia;
		else
			donGia = 999999;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		if(soLuong > 0)
			this.soLuong = soLuong;
		else
			soLuong = 999999;
	}

	public String getNXB() {
		return NXB;
	}

	public void setNXB(String NXB){
		if(!NXB.trim().equals(""))
			this.NXB = NXB;
		else
			this.NXB = "xxx";
	}
	
	public double getThanhTien(){
		return soLuong * donGia;
	}
	
	public static String taoTieuDe()
	{
		return String.format("%10s %20s %15s %15s %25s %15s %15s", "MÃ SÁCH", "NGÀY NHẬP", "ĐƠN GÍA", "SỐ LƯỢNG", "NHÀ XUẤT BẢN", "TÌNH TRẠNG", "THUẾ");
	}
	@Override
	public String toString() {
		Locale LocaleVN = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(LocaleVN);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%10s %20s %15s %15s %25s %15s %15s", maSach, dtf.format(ngayNhap), nf.format(getDonGia()), soLuong, NXB, "", "");
	}
	
}
