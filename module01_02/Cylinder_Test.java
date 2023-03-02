package nguyenUyenQuyen_phan02;

public class Cylinder_Test {
	public static void main(String[] args) {
		Cylinder hinhTru = new Cylinder(4,8);
		System.out.println("Dien tich xung quanh: " + hinhTru.tinhDTXQ());
		System.out.println("Dien tich toan phan: "+ hinhTru.tinhDTTP());
		System.out.println("The tich hinh tru: "+ hinhTru.tinhTheTich());
	}

}
