package nguyenUyenQuyen_phan02;

public class ThongTinDangKyXe {
	//Các thuôc tính
	private String TenChu;
	private String Loai;
	private double DonGia;
	private int DungTich;
	public ThongTinDangKyXe(){
		TenChu = "Chua nhap ten";
		Loai = "Chua nhap";
		DonGia = 0;
		DungTich = 0;
	}
	//Constructor đầy đủ tham số
	public ThongTinDangKyXe(String tenChu, String loai, double donGia, int dungTich)throws Exception{
		setTenChu(tenChu);
		setLoai(loai);
		setDonGia(donGia);
		setDungTich(dungTich);
	}
	//Các hàm getter và setter
	public String getTenChu() {
		return TenChu;
	}

	public void setTenChu(String tenChu)throws Exception {
		if(kiemTraTenChu(tenChu) == true){
			this.TenChu = tenChu;
		}else
			throw new Exception("Ten chu xe khong duoc de trong!");
	}

	public String getLoai() {
		return Loai;
	}

	public void setLoai(String loai)throws Exception {
		if(kiemTraPhanLoai(loai)== true)
			this.Loai = loai;
		else
			throw new Exception("Loai xe khong duoc de trong!");
	}

	public double getDonGia() {
		return DonGia;
	}

	public void setDonGia(double donGia)throws Exception{
		if(donGia >= 0)
			this.DonGia = donGia;
		else
			throw new Exception("Don gia >= 0 !");
	}

	public int getDungTich() {
		return DungTich;
	}

	public void setDungTich(int dungTich)throws Exception {
		if(dungTich >= 0)
			this.DungTich = dungTich;
		else
			throw new Exception("Dung tich >= 0 !");
	}
	//Khởi tạo phương thức kiểm tra ten chu xe khong duoc rong
	public boolean kiemTraTenChu(String tenChu){
		if(tenChu == " " || tenChu.isEmpty())
			return false;
		return true;
	}
	//Khoi tao phuong thuc kiem tra phan loai xe khong duoc rong
	public boolean kiemTraPhanLoai(String loai){
		if(loai == " " || loai.isEmpty())
			return false;
		return true;
	}
	//Khởi tạo phương thứ toString
	public String toString(){
		return String.format( "%s\t\t\t%s\t\t%s\t\t\t\t%s",TenChu,Loai,DonGia,DungTich);
	}
	
}
