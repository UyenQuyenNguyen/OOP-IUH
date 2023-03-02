package nguyenUyenQuyen.bai04;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class SachGiaoKhoa extends Sach {
	private boolean tinhTrang;

	public SachGiaoKhoa() {
		super();
		this.tinhTrang=true;
	}

	public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan,
			boolean tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		setTinhTrang(tinhTrang);
	}

	public boolean isTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		if(tinhTrang==true || tinhTrang==false)
			this.tinhTrang = tinhTrang;
		else {
			this.tinhTrang=true;
		}
	}

	@Override
	public String toString() {
		String TinhTrang ="";
		if(tinhTrang)
			TinhTrang = "Mới";
		else
			TinhTrang = "Cũ";
		Locale LocaleVN = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(LocaleVN);
		return String.format("%10s %20s %15s %15s %25s %15s %15s", super.getMaSach(), super.getNgayNhap(), nf.format(super.getDonGia()) , super.getSoLuong(), super.getNhaXuatBan(), TinhTrang,"");
	}
	
	@Override
	public double getThanhTien() {
		if(tinhTrang)
			return super.getSoLuong()*super.getDonGia();
		return super.getSoLuong()*super.getDonGia()*50/100;
	}

	
	
	
}
