package nguyenUyenQuyen_phan02;

public class Cylinder {
	private float R;
	private float H;
	
	public Cylinder(float r, float h){
		this.R = r;
		this.H = h;
	}
	public double tinhDTXQ(){
		return 2*3.14*R*H;
	}
	public double tinhDTTP(){
		return 2*3.14*R*(R+H);
	}
	public double tinhTheTich(){
		return 3.14*R*R*H;
	}
}
