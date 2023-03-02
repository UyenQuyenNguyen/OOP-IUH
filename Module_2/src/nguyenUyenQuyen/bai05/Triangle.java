package nguyenUyenQuyen.bai05;

public class Triangle {
	private double ma, mb, mc;
	
	//Khởi tạo constructor mặc định
	public Triangle(){
		ma = mb = mc =0;
	}
	
	/**
	 * 
	 * @param ma
	 * @param mb
	 * @param mc
	 */
	public Triangle(double ma, double mb, double mc){
		if(ma < mb + mc && mb < ma + mc && mc < mb + ma && ma > 0 && mb > 0 && mc > 0){
			this.ma = ma;
			this.mb = mb;
			this.mc = mc;
		}
		else
			ma = mb = mc = 0;
	}

	public double getMa() {
		return ma;
	}
	/**
	 * 
	 * @param mc
	 * @throws Exception neu canh nhap vao < 0
	 */
	public void setMa(double ma)throws Exception {
		if(ma > 0)
			this.ma = ma;
		else
			throw new Exception("Canh cua mot tam giac phai > 0");
	}

	public double getMb() {
		return mb;
	}
	/**
	 * 
	 * @param mc
	 * @throws Exception neu canh nhap vao < 0
	 */
	public void setMb(double mb)throws Exception {
		if(mb > 0)
			this.mb = mb;
		else
			throw new Exception("Canh cua mot tam giac phai > 0");
	}

	public double getMc() {
		return mc;
	}
	/**
	 * 
	 * @param mc
	 * @throws Exception neu canh nhap vao < 0
	 */
	public void setMc(double mc)throws Exception {
		if(mc > 0)
			this.mc = mc;
		else
			throw new Exception("Canh cua mot tam giac phai > 0");
	}
	
	
	/**
	 * 
	 * @return kieu tam giac
	 */
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
			result = "Không phải tam giác.";
		return result;
	}	
		
	/**
	 * 
	 * @return chu vi hinh tam giac
	 */
	public double tinhChuVi(){
		return ma+mb+mc;
	}
	
	/**
	 * 
	 * @return dien tich hinh tam giac
	 */
	public double tinhDienTich(){
		double p = (ma+mb+mc)/2;
		return Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
	}
	public static String taoTieuDe(){
		return String.format("%-24s%-25s%-10s%-10s","DO DAI BA CANH","PHAN LOAI","CHU VI","DIEN TICH" + "\n-------------------------------------------------------------");
	}
	
	
	//Khoi tao phuong thuc toString
	public String toString(){
		return String.format("%-8.2f%-8.2f%-8.2f%-25s%-10.2f%-10.2f",ma,mb,mc,phanLoai(),tinhChuVi(),tinhDienTich());
	}
}
