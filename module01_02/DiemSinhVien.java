package nguyenUyenQuyen_phan02;

public class DiemSinhVien {
	//Các thuộc tính
	private int maSV;
	private String hoTen;
	private float diemLT, diemTH;
	
	//Constructor mặc định
	public DiemSinhVien(){
		maSV = 0;
		hoTen = "Chua nhap ho ten";
		diemLT = diemTH = 0;
	}
	//Constructor có tham số
	public DiemSinhVien(int maSV, String hoTen, float diemLT, float diemTH)throws Exception{
		setMaSV(maSV);
		setHoTen(hoTen);
		setDiemLyThuyet(diemLT);
		setDiemThucHanh(diemTH);		
	}
	//Getter and setter
	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV)throws Exception{
		if(maSV > 0)
			this.maSV = maSV;
		else 
			throw new Exception(" Ma sinh vien phai lon > 0");
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		if(hoTen == " " || hoTen.isEmpty()){
			System.out.println("Ho ten sinh vien khong duoc de trong !");
		}else{
			this.hoTen  = hoTen;
		}
	}

	public float getDiemLyThuyet() {
		return diemLT;
	}

	public void setDiemLyThuyet(float diemLT)throws Exception {
		if(diemLT >= 0 && diemLT <=10)
			this.diemLT = diemLT;
		else
			throw new Exception("Diem so phai thuoc khoang [0;10]");
	}

	public float getDiemThucHanh() {
		return diemTH;
	}

	public void setDiemThucHanh(float diemTH)throws Exception {
		if(diemTH >= 0 && diemTH <=10)
			this.diemTH = diemTH;
		else
			throw new Exception("Diem so phai thuoc khoang [0;10]");
	}
	//Khởi tạo phương thức tính điểm Trung Bình
	public float tinhDiemTrungBinh(){
		return (diemLT + diemTH) / 2;
	}
	//Khởi tạo phương thức toString
	public String toString(){
		return 	">>>----Thong tin sinh vien----<<< " +
				"\nMa sinh vien : " + maSV +
				"\nHo va ten : " + hoTen +
				"\nDiem ly thuyet : " + diemLT +
				"\nDiem thuc hanh : " + diemTH +
				"\nDiem trung binh : " + tinhDiemTrungBinh();	
	}
}

