package nguyenUyenQuyen_phan02;

public class Triangle_Test {
	public static void main(String[] args) {
		try{
		Triangle tg1 = new Triangle(1,2,3);
		Triangle tg2 = new Triangle(3,0,5);
		Triangle tg3 = new Triangle(2,4,5);
		Triangle tg4 = new Triangle(4,4,6);
		Triangle tg5 = new Triangle(5,5,5);
		
		//Xuất thông tin thep dạng bảng
		System.out.printf("\tDO DAI BA CANH"+ "\t\t|\tPHAN LOAI" +"|" + "\t|\tCHU VI" + "\t\t|\tDIEN TICH");
		System.out.println("\n\t-------------\t\t|\t---------\t|\t------\t\t|\t---------");
		System.out.printf(tg1.toString());
		System.out.printf(tg2.toString());
		System.out.printf(tg3.toString());
		System.out.printf(tg4.toString());
		System.out.printf(tg5.toString());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}