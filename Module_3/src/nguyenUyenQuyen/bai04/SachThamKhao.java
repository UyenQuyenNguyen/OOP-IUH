package nguyenUyenQuyen.bai04;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class SachThamKhao extends Sach {
	private double thue;

	public SachThamKhao() {
		super();
		this.thue=0;
	}

	public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		setThue(thue);
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		if(thue>=0)
			this.thue = thue;
		else {
			this.thue = 0;
		}
	}

	@Override
	public String toString() {
		Locale LocaleVN = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(LocaleVN);
		return String.format("%10s %20s %15s %15s %25s %15s %15s", super.getMaSach(), super.getNgayNhap(), nf.format(super.getDonGia()), super.getSoLuong(), super.getNhaXuatBan(), "", nf.format(thue));
	}

	@Override
	public double getThanhTien() {
		return super.getSoLuong()*super.getDonGia()+thue;
	}

	
}

