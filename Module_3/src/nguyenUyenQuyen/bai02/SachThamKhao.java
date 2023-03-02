package nguyenUyenQuyen.bai02;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.time.format.DateTimeFormatter;

public class SachThamKhao extends Sach {
	private double thue;

	/**
	 * 
	 */
	public SachThamKhao() {
		super();
		thue = 0;
	}

	/**
	 * @param thue
	 */
	public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong,
			String NXB,double thue) {
		super(maSach, ngayNhap, donGia, soLuong, NXB);
		this.thue = thue;
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		if(thue >= 0)
			this.thue = thue;
		else
			thue = 0;
	}
	

	@Override
	public String toString() {
		Locale LocaleVN = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(LocaleVN);
		return String.format("%10s %20s %15s %15s %25s %15s %15s", super.getMaSach(), super.getNgayNhap(), super.getDonGia(), super.getSoLuong(), super.getNXB(), "", nf.format(thue));
	}
	
	
	
	
}
