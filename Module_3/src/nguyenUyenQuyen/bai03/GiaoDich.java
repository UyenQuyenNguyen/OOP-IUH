package nguyenUyenQuyen.bai03;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class GiaoDich {
	private String maGiaoDich;
	private LocalDate ngayGiaoDich;
	private double donGia;
	private int soLuong;
	/**
	 * 
	 */
	public GiaoDich() {
		maGiaoDich = "xxx";
		ngayGiaoDich = LocalDate.now();
		donGia = 999999;
		soLuong = 999999;
	}
	/**
	 * @param maGiaoDich
	 * @param ngayGiaoDich
	 * @param donGia
	 * @param soLuong
	 */
	public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia,
			int soLuong) {
		setMaGiaoDich(maGiaoDich);
		setNgayGiaoDich(ngayGiaoDich);
		setDonGia(donGia);
		setSoLuong(soLuong);
	}
	
	public String getMaGiaoDich() {
		return maGiaoDich;
	}
	public void setMaGiaoDich(String maGiaoDich) {
		if(!maGiaoDich.trim().equals(""))
			this.maGiaoDich = maGiaoDich;
		else
			maGiaoDich = "xxx";
	}
	public LocalDate getNgayGiaoDich() {
		return ngayGiaoDich;
	}
	public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
		if(ngayGiaoDich.isAfter(LocalDate.now())){
			ngayGiaoDich = LocalDate.now();
		}
		else
			this.ngayGiaoDich = ngayGiaoDich;
			
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
	
	public double getThanhTien(){
		return soLuong * donGia;
	}
	
	public static String taoTieuDe(){
		return String.format("%10s %20s %15s %15s %15s %20s %20s %20s","MÃ GIAO DỊCH","NGÀY GIAO DỊCH","ĐƠN GIÁ", "SỐ LƯỢNG", "LOẠI VÀNG", "TỈ GIÁ", "LOẠI TIỀN TỆ", "THÀNH TIỀN");
	}
	
	@Override
	public String toString() {
		Locale localeVN  = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(localeVN);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%10s %20s %15s %15s %15s %20s %20s %20f",maGiaoDich, dtf.format(ngayGiaoDich), nf.format(getDonGia()), soLuong, "", "", "", getThanhTien());

	}
	
	
}
