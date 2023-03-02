package nguyenUyenQuyen.bai04;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Sach {
	private String maSach;
	private LocalDate ngayNhap;
	private double donGia;
	private int soLuong;
	private String nhaXuatBan;

	public Sach() {
		this("xxx", LocalDate.now(), 0, 0, "xxx");
	}

	public Sach(String maSach, LocalDate ngayNhap, double donGia, int soLuong,
			String nhaXuatBan) {
		setMaSach(maSach);
		setNgayNhap(ngayNhap);
		setDonGia(donGia);
		setSoLuong(soLuong);
		setNhaXuatBan(nhaXuatBan);
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		if (!maSach.trim().equals(""))
			this.maSach = maSach;
		else {
			this.maSach = "xxx";
		}
	}

	public LocalDate getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(LocalDate ngayNhap) {
		if (ngayNhap.isBefore(LocalDate.now()))
			this.ngayNhap = ngayNhap;
		else {
			this.ngayNhap = LocalDate.now();
		}
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		if (donGia >= 0)
			this.donGia = donGia;
		else {
			this.donGia = 0;
		}
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		if (soLuong >= 0)
			this.soLuong = soLuong;
		else {
			this.soLuong = 0;
		}

	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		if (!nhaXuatBan.trim().equals(""))
			this.nhaXuatBan = nhaXuatBan;
		else {
			this.nhaXuatBan = "xxx";
		}
	}

	public abstract double getThanhTien();

	public static String taoTieuDe() {
		return String.format("%10s %20s %15s %15s %25s %15s %15s", "MÃ SÁCH",
				"NGÀY NHẬP", "ĐƠN GÍA", "SỐ LƯỢNG", "NHÀ XUẤT BẢN",
				"TÌNH TRẠNG", "THUẾ");
	}

	@Override
	public String toString() {
		Locale LocaleVN = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(LocaleVN);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%10s %20s %15s %15s %25s %15s %15s", maSach,
				dtf.format(ngayNhap), nf.format(getDonGia()), soLuong,
				nhaXuatBan, "", "");
	}

}
