package nguyenUyenQuyen_phan02;

public class Point_Test {
	public static void main(String[] args) {
		Point td = new Point(3,4,'A');
		td.negate();
		System.out.println("Diem doi xung voi qua goc toa do O la: "+td.toString());
		System.out.println("Khoang cach tu diem den goc toa do O la:"+td.getDistance());
	}
}
