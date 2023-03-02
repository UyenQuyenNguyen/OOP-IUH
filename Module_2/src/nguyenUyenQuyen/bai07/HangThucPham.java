package nguyenUyenQuyen.bai07;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class HangThucPham {
	private String MaHang;
	private String TenHang;
	private double DonGia;
	private LocalDate NgaySanXuat;
	private LocalDate NgayHetHan;
	/**
	 * 
	 */
	public HangThucPham() {
		// TODO Auto-generated constructor stub
	}
	public HangThucPham(String maHang)throws Exception{
		setMaHang(maHang);
		TenHang = "xxx";
		DonGia = 0;
		NgaySanXuat = LocalDate.now();
		NgayHetHan = NgaySanXuat;
	}
	public HangThucPham(String maHang, String tenHang, double donGia,LocalDate ngaySanXuat, LocalDate ngayHetHan)throws Exception {
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}
	public String getMaHang() {
		return MaHang;
	}
	/**
	 * 
	 * @param maHang
	 * @throws Exception neu maHang nhap vao rong 
	 */
	public void setMaHang(String maHang)throws Exception {
		if(!maHang.trim().equals(""))
			this.MaHang = maHang;
		else 
			throw new Exception("Loi: Ma hang rong !");
	}
	public String getTenHang() {
		return TenHang;
	}
	
	public void setTenHang(String tenHang){
		if(!tenHang.trim().equals(""))
			this.TenHang = tenHang;
		else 
			TenHang = "xxx";
	}
	public double getDonGia() {
		return DonGia;
	}
	
	public void setDonGia(double donGia){
		if(donGia >= 0)
			this.DonGia = donGia;
		else
			DonGia = 0;
	}
	public LocalDate getNgaySanXuat() {
		return NgaySanXuat;
	}
	/**
	 * @param ngaySanXuat
	 * Gan gia tri neu NgaySanXuat truoc ngay hien tai. 
	 * Nguoc lai, gan gia tri ngay san xuat la ngay hien tai;
	 */
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if(ngaySanXuat.isBefore(LocalDate.now())){
			this.NgaySanXuat = ngaySanXuat;
		}else
			this.NgaySanXuat = LocalDate.now();
	}
	public LocalDate getNgayHetHang() {
		return NgayHetHan;
	}
	/**
	 * @param ngayHetHan
	 * Gan gia tri neu NgayHetHan sau NgaySanXUat
	 * Nguoc lai, gan gia tri NgayHetHan la NgaySanXuat;
	 */
	public void setNgayHetHan(LocalDate ngayHetHan) {
		if(ngayHetHan.isAfter(NgaySanXuat)){
			this.NgayHetHan = ngayHetHan;
		}else
			this.NgayHetHan = NgaySanXuat;
	}
	
	/**
	 * @return kết quả hàng còn hạn hay đã hết hạng
	 * 
	 */
	public boolean kiemTraHetHan(){
		return NgayHetHan.isBefore(LocalDate.now()) ? true : false;
	}
	public static String taoTieDe(){
		return String.format("%15s%15s%15s%20s%20s%20s","MÃ HÀNG","TÊN HÀNG","ĐƠN GIÁ","NGÀY SẢN XUẤT","NGÀY HẾT HẠN","GHI CHÚ"+"\n--------------------------------------------------------------------------------------------------------");
	}
	public String toString(){
		String result = "";
		if(kiemTraHetHan()){
			result = "Hàng hết hạng !";
		}
		DecimalFormat df = new DecimalFormat("#.##0,00");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%15s%15s%15s%20s%20s%20s",MaHang, TenHang,df.format(DonGia),dtf.format(NgaySanXuat),dtf.format(NgayHetHan),result);
	}
}
