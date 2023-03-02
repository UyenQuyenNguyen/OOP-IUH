package nguyenUyenQuyen_phan02;

public class Triangle {
	private double ma, mb, mc;
	
	//Khởi tạo constructor mặc định
	public Triangle(){
		ma = mb = mc =0;
	}
	
	//Khởi tạo constructor có tham số
	public Triangle(double ma, double mb, double mc)throws Exception{
		if(ma<mb+mc&&mb<ma+mc&&mc<mb+ma){
			setMa(ma);
			setMb(mb);
			setMc(mc);
		}
		else
			ma = mb = mc = 0;
	}
	//Các getter và setter
	public double getMa() {
		return ma;
	}

	public void setMa(double ma)throws Exception {
		if(ma > 0)
			this.ma = ma;
		else
			throw new Exception("Canh cua mot tam giac phai > 0");
	}

	public double getMb() {
		return mb;
	}

	public void setMb(double mb)throws Exception {
		if(mb > 0)
			this.mb = mb;
		else
			throw new Exception("Canh cua mot tam giac phai > 0");
	}

	public double getMc() {
		return mc;
	}

	public void setMc(double mc)throws Exception {
		if(mc > 0)
			this.mc = mc;
		else
			throw new Exception("Canh cua mot tam giac phai > 0");
	}
	//Khởi tạo phương thức toString
	public String toString(){
		
		return String.format("\nma = %s mb = %s mc = %s",ma,mb,mc + "\t|\t"+ phanLoai() +"\t\t|\t"+ tinhChuVi()+ "\t\t|\t" + tinhDienTich());
	}
	//Khởi tạo phương thức kiểm tra tam giác
	public String phanLoai(){
		String result ="";
		if(ma<mb+mc&&mb<ma+mc&&mc<mb+ma){	
			if(ma==mb&&mb==mc){
				result = "Đều.";
			}
			else if(((ma == mb) || (ma == mc) || (mb == mc))){
				result = "Cân.";
			}
			else if((ma * ma == mb * mb + mc * mc) ||
					(mb * mb == ma * ma + mc * mc) ||
					(mc * mc == ma * ma + mb * mb)) {
				result = "Vuông.";
			}
			else if (((ma * ma + mb * mb == mc * mc) && (ma == mb)) ||
					((ma * ma + mc * mc == mb * mb) && (ma == mc)) ||
					((mb * mb + mc * mc == ma * ma) && (mb == mc))){
				result = "Vuông cân.";
			}
			else
				result = "Thường.";
		}
		else
			result = "Error!";
		return result;
	}	
		
	//Khởi tạo phương thức tính chu vi tam giac
	public double tinhChuVi(){
		return ma+mb+mc;
	}
	
	//Khởi tạo phương thức tính diệnn tích hình chữ nhật
	public double tinhDienTich(){
		double p = (ma+mb+mc)/2;
		return Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
	}
}
