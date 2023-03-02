package nguyenUyenQuyen.bai06;
import java.text.DecimalFormat;
public class ThongTinDangKyXe {
	//Các thuôc tính
	private String tenChu;
	private String loai;
	private double donGia;
	private int dungTich;
	public ThongTinDangKyXe(){
		tenChu = "Chua nhap ten";
		loai = "Chua nhap";
		donGia = 0;
		dungTich = 0;
	}
	/**
	 * 
	 * @param tenChu
	 * @param loai
	 * @param donGia
	 * @param dungTich
	 * @throws Exception
	 */
	public ThongTinDangKyXe(String tenChu, String loai, double donGia, int dungTich)throws Exception{
		setTenChu(tenChu);
		setLoai(loai);
		setDungTich(dungTich);
		setDonGia(donGia);

	}
	
	/**
	 * 
	 * @return tra ve ten chu xe
	 */
	public String getTenChu() {
		return tenChu;
	}
	/**
	 * 
	 * @param tenChu
	 * @throws Exception neu ten chu xe la chuoi trong
	 */
	public void setTenChu(String tenChu)throws Exception {
		if(!tenChu.trim().equals("")){
			this.tenChu = tenChu;
		}else
			throw new Exception("Ten chu xe khong duoc de trong!");
	}

	public String getLoai() {
		return loai;
	}
	/**
	 * 
	 * @param loai
	 * @throws Exception neu loai xe bi de trong hoac ki tu trang
	 */
	public void setLoai(String loai)throws Exception {
		if(!loai.trim().equals(""))
			this.loai = loai;
		else
			throw new Exception("Loai xe khong duoc de trong!");
	}

	public double getDonGia() {
		return donGia;
	}
	/**
	 * 
	 * @param donGia
	 * @throws Exception neu don gia nhap vap < 0
	 */
	public void setDonGia(double donGia)throws Exception{
		if(donGia >= 0)
			this.donGia = donGia;
		else
			throw new Exception("Don gia >= 0 !");
	}

	public int getDungTich() {
		return dungTich;
	}
	/**
	 * 
	 * @param dungTich
	 * @throws Exception neu gia tri dung tich nhap vao < 0
	 */
	public void setDungTich(int dungTich)throws Exception {
		if(dungTich >= 0)
			this.dungTich = dungTich;
		else
			throw new Exception("Dung tich >= 0 !");
	}
	
	/**
	 * 
	 * @return tien thue phai tra theo dung tich xylanh
	 */
	public double tinhThue(){
		double cost = 0;
		if(dungTich < 100)
			cost = donGia* 0.01;
		else if(dungTich >=100 && dungTich < 200){
			cost = donGia * 3/100;
		}
		else
			cost = donGia * 3/100;
		return cost;
	}
	//Khởi tạo phương thứ toString
	public String toString(){
		DecimalFormat df = new DecimalFormat("#,#00.00");
        return String.format("%-30s%-15s%-15d%-25s%-25s",tenChu,loai,dungTich,df.format(donGia),df.format(tinhThue()));
	}
	public static String taoTieuDe(){
		return String.format("%-30s%-15s%-15s%-25s%-25s","TÊN CHỦ XE","LOẠI XE","DUNG TÍCH", "TRỊ GIÁ", "TIỀN THUẾ"+"\n===================================================================================================");
	}
	
}
