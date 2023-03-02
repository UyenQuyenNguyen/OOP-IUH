package nguyenUyenQuyen.bai06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham extends HangHoa {
	private String nhaCungCap;
	private LocalDate ngaySanXuat, ngayHetHan;

	/**
	 * @param maHang
	 * @param tenHang
	 * @param donGia
	 * @param soLuongTon
	 */
	public HangThucPham(String maHang, String tenHang, double donGia,
			int soLuongTon, String nhaCungCap, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
		super(maHang, tenHang, donGia, soLuongTon);
		setNhaCungCap(nhaCungCap);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}

	public String getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(String nhaCungCap) {
		if(!nhaCungCap.trim().equals(""))
			this.nhaCungCap = nhaCungCap;
		else
			this.nhaCungCap = "xxx";
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if(ngaySanXuat.isBefore(LocalDate.now()))
			this.ngaySanXuat = ngaySanXuat;
		else
			this.ngaySanXuat = LocalDate.now();
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	
	public String taoTieuDe(){
		return String.format("%-10s%-25s%-15s%-10d%-25s%-15s%-20s%-20s%-20s","MÃ HÀNG", "TÊN HÀNG", "ĐƠN GÍA", "SỐ LƯỢNG TỒN", "ĐÁNH GIÁ", "VAT", "NHÀ CUNG CẤP", "NGÀY SẢN XUẤT", "HẠN SỬ DỤNG");
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy");
		return String.format("%s%-20s%-20s%-20s",super.toString(),nhaCungCap, dtf.format(ngaySanXuat), dtf.format(getNgayHetHan()));
	}
	
	@Override
	protected String danhGiaMucDoBanBuon() {
		if(super.getSoLuongTon() >= 1 && ngayHetHan.isBefore(LocalDate.now()))
			return "Khó bán.";
		else
			return "Không có đánh giá.";
	}
	@Override
	protected double tinhVAT() {
		return super.getDonGia() * 0.05;
	}
	
	
	
	
}
