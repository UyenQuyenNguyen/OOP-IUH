package nguyenUyenQuyen.bai03;

public class Cylinder {
	private float R;
	private float H;
	
	public Cylinder(float r, float h){
		this.R = r;
		this.H = h;
	}
	/**
	 * 
	 * @return dien tich xung quanh cua hinh tru
	 */
	public double tinhDienTichXungQuanh(){
		return 2*Math.PI*R*H;
	}
	/**
	 * 
	 * @return dien tich toan phan cua hinh tru
	 */
	public double tinhDienTichToanPhan(){
		return 2*Math.PI*R*(R+H);
	}
	/**
	 * 
	 * @return the tich hinh tru
	 */
	public double tinhTheTich(){
		return 3.14*R*R*H;
	}
	public String toString(){
		return String.format("Dien tich xung quanh: %.2f\nDien tich toan phan: %.2f\nThe tich: %.2f",tinhDienTichXungQuanh(),tinhDienTichToanPhan(),tinhTheTich());
	}
}
