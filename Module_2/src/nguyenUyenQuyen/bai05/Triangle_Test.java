package nguyenUyenQuyen.bai05;

public class Triangle_Test {
	public static void main(String[] args) {
		try{
		Triangle tg[] = new Triangle[5];
		tg[0] = new Triangle(1,2,3);
		tg[1] = new Triangle(3,0,5);
		tg[2] = new Triangle(2,4,5);
		tg[3] = new Triangle(4,4,6);
		tg[4] = new Triangle(5,5,5);
		System.out.println(Triangle.taoTieuDe());
		for(Triangle x : tg){
			System.out.println(x);
		}
		
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}