package nguyenUyenQuyen.bai06;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HangSanhSu extends HangHoa {
	private LocalDate ngaySanXuat, ngayNhapKho;

	/**
	 * @param maHang
	 * @param tenHang
	 * @param donGia
	 * @param soLuongTon
	 */
	public HangSanhSu(String maHang, String tenHang, double donGia,
			int soLuongTon, LocalDate ngaySanXuat, LocalDate ngayNhapKho) {
		super(maHang, tenHang, donGia, soLuongTon);
		setNgaySanXuat(ngaySanXuat);
		setNgayNhapKho(ngayNhapKho);
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if(ngaySanXuat.isAfter(LocalDate.now()))
			ngaySanXuat = LocalDate.now();
		else
			this.ngaySanXuat = ngaySanXuat;
	}

	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}

	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		if(ngayNhapKho.isAfter(LocalDate.now()))
			ngayNhapKho = LocalDate.now();
		else
			this.ngayNhapKho = ngayNhapKho;
	}
	public static String taoTieuDe(){
		return String.format("%-10s%-25s%-15s%-10s%-25s%-15s%-20s%-20s","MÃ HÀNG", "TÊN HÀNG", "ĐƠN GÍA", "SỐ LƯỢNG TỒN", "ĐÁNH GIÁ", "VAT", "NGÀY SẢN XUẤT", "NGÀY NHẬP KHO");
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy");
		return String.format("%s%-20s%-20s", super.toString(), dtf.format(getNgaySanXuat()), dtf.format(getNgayNhapKho()));
	}
	
	@Override
	protected String danhGiaMucDoBanBuon() {
		Period age = Period.between(ngayNhapKho, LocalDate.now());
		int ngay = age.getDays();
		int thang = age.getMonths();
		int nam = age.getYears();
		int kiemTra = nam * 12 + thang *30 + ngay;
		if(super.getSoLuongTon() > 50 && kiemTra > 10)
			return "Bán chậm.";
		else
			return "Không có đánh giá.";
	}
	@Override
	protected double tinhVAT() {
		return super.getDonGia() * 0.1;
	}
}
