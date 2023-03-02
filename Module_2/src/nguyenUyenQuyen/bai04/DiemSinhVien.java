package nguyenUyenQuyen.bai04;

public class DiemSinhVien {
	//Các thuộc tính
	private int maSV;
	private String hoTen;
	private float diemLT, diemTH;
	
	public DiemSinhVien(){
		maSV = 0;
		hoTen = "Chua nhap ho ten";
		diemLT = diemTH = 0;
	}
	/**
	 * 
	 * @param maSV
	 * @param hoTen
	 * @param diemLT
	 * @param diemTH
	 * @throws Exception
	 */
	public DiemSinhVien(int maSV, String hoTen, float diemLT, float diemTH)throws Exception{
		setMaSV(maSV);
		setHoTen(hoTen);
		setDiemLyThuyet(diemLT);
		setDiemThucHanh(diemTH);		
	}
	
	public int getMaSV() {
		return maSV;
	}
	/**
	 * 
	 * @param maSV 
	 * @throws Exception neu ma sinh vien < 0
	 */
	public void setMaSV(int maSV)throws Exception{
		if(maSV > 0)
			this.maSV = maSV;
		else 
			throw new Exception(" Ma sinh vien phai lon > 0");
	}

	public String getHoTen() {
		return hoTen;
	}
	/**
	 * 
	 * @param hoTen
	 * @throws Exception neu ho ten sinh vien rong
	 */
	public void setHoTen(String hoTen)throws Exception {
		if(!hoTen.trim().equals(" ")||!hoTen.trim().equals("")){
			this.hoTen  = hoTen;
		}else{
			throw new Exception("Loi: Ho ten sinh vien rong!");
		}
	}

	public float getDiemLyThuyet() {
		return diemLT;
	}
	/**
	 * @param diemLT
	 * Gan gia tri diemLT neu gia tri truyen vao nam trong khoang{0;10]
	 * Nguoc lai, gan gia tri mac dinh
	 */
	public void setDiemLyThuyet(float diemLT){
		if(diemLT >= 0 && diemLT <=10)
			this.diemLT = diemLT;
		else
			this.diemLT = 0;
	}

	public float getDiemThucHanh() {
		return diemTH;
	}
	/**
	 * @param diemLT
	 * Gan gia tri diemTH neu gia tri truyen vao nam trong khoang{0;10]
	 * Nguoc lai, gan gia tri mac dinh
	 */
	public void setDiemThucHanh(float diemTH) {
		if(diemTH >= 0 && diemTH <=10)
			this.diemTH = diemTH;
		else
			this.diemTH = 0;
	}
	/**
	 * 
	 * @return diem Trung Binh
	 */
	public float tinhDiemTrungBinh(){
		return (diemLT + diemTH) / 2;
	}
	//Khởi tạo phương thức toString
	public String toString(){
		return String.format("%-10d%-35s%-12.2f%-16.2f%-16.2f",maSV,hoTen,diemLT,diemTH,tinhDiemTrungBinh());	
	}
	public static String taoTieuDe(){
		return String.format("%-10s%-33s%-12s%-16s%-16s", "Ma Sinh vien","Ho Ten","Diem LT","Diem TH","Diem TB" );
	}
}

