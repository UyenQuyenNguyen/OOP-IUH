package nguyenUyenQuyen.bai03;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class GiaoDichVang extends GiaoDich {
	private String loaiVang;

	/**
	 * 
	 */
	public GiaoDichVang() {
		super();
		loaiVang = "xxx";
	}

	/**
	 * @param loaiVang
	 */
	public GiaoDichVang(String maGiaoDich, LocalDate ngayGiaoDich,
			double donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		setLoaiVang(loaiVang);
	}

	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		if (!loaiVang.trim().equals(""))
			this.loaiVang = loaiVang;
		else
			loaiVang = "xxx";

	}
	
	public double getThanhTien(){
		return super.getSoLuong() * super.getDonGia();
	}

	@Override
	public String toString() {
		Locale localeVN  = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(localeVN);
		return String.format("%10s %20s %15s %15s %15s %20s %20s %20s",super.getMaGiaoDich(),super.getNgayGiaoDich(), super.getDonGia(), super.getSoLuong(), loaiVang, "", "", nf.format(getThanhTien()));
	}
	
}
