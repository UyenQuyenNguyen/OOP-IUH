package nguyenUyenQuyen.bai06;

public class HangDienMay extends HangHoa{
	private int thoiGianBaoHang, congSuat;

	/**
	 * @param maHang
	 * @param tenHang
	 * @param donGia
	 * @param soLuongTon
	 */
	public HangDienMay(String maHang, String tenHang, double donGia,
			int soLuongTon, int thoiGianBaoHanh, int congSuat) {
		super(maHang, tenHang, donGia, soLuongTon);
		setThoiGianBaoHang(thoiGianBaoHanh);
		setCongSuat(congSuat);
	}

	public int getThoiGianBaoHang() {
		return thoiGianBaoHang;
	}

	public void setThoiGianBaoHang(int thoiGianBaoHang) {
		if(thoiGianBaoHang >= 0)
			this.thoiGianBaoHang = thoiGianBaoHang;
		else
			this.thoiGianBaoHang = 0;
	}

	public int getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(int congSuat) {
		if(congSuat >= 0 )
			this.congSuat = congSuat;
		else
			this.congSuat = 0;
	}
	public static String taoTieuDe(){
		return String.format("%-10s%-25s%-15s%-10d%-25s%-15s%-20s%-25s","MÃ HÀNG", "TÊN HÀNG", "ĐƠN GÍA", "SỐ LƯỢNG TỒN", "ĐÁNH GIÁ", "VAT", "THOI GIAN BAO HANH", "CONG SUAT");
	}

	@Override
	public String toString() {
		return String.format("%s%-20s%-25s", super.toString(), thoiGianBaoHang, congSuat);
	}
	
	@Override
	public String danhGiaMucDoBanBuon(){
		if(super.getSoLuongTon() < 3)
			return "Bán được.";
		else
			return "Không có đánh giá.";
	}
	
	@Override
	public double tinhVAT(){
		return super.getDonGia() * 0.1;
	}
	
	
	
}
