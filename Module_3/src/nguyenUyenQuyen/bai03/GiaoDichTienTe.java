package nguyenUyenQuyen.bai03;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class GiaoDichTienTe extends GiaoDich {
	private double tiGia;
	private LoaiTienTe loaiTienTe;

	/**
	 * 
	 */
	public GiaoDichTienTe() {
		super();
		tiGia = 1;
		loaiTienTe = LoaiTienTe.VND;
	}

	/**
	 * @param tiGia
	 * @param loaiTienTe
	 */
	public GiaoDichTienTe(String maGiaoDich, LocalDate ngayGiaoDich,
			double donGia, int soLuong, double tiGia, LoaiTienTe loaiTienTe) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		setTiGia(tiGia);
		setLoaiTienTe(loaiTienTe);
	}

	public double getTiGia() {
		return tiGia;
	}

	public void setTiGia(double tiGia) {
		if (tiGia > 0)
			this.tiGia = tiGia;
		else
			tiGia = 1;
	}

	public LoaiTienTe getLoaiTienTe() {
		return loaiTienTe;
	}

	public void setLoaiTienTe(LoaiTienTe loaiTienTe) {
		if (loaiTienTe == LoaiTienTe.USD || loaiTienTe == LoaiTienTe.EURO || loaiTienTe == LoaiTienTe.VND)
			this.loaiTienTe = loaiTienTe;
		else
			loaiTienTe = LoaiTienTe.VND;

	}
	
	public double getThanhTien(){
		if(loaiTienTe == LoaiTienTe.USD|| loaiTienTe == LoaiTienTe.EURO)
			return super.getThanhTien() * tiGia;
		else
			return super.getThanhTien();
		
	}

	@Override
	public String toString() {
		Locale localeVN  = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(localeVN);
		return String.format("%10s %20s %15s %15s %15s %20s %20s %20s",super.getMaGiaoDich(),super.getNgayGiaoDich(), super.getDonGia(), super.getSoLuong(), "", nf.format(tiGia), loaiTienTe, nf.format(getThanhTien()));
	}
	
	

}
