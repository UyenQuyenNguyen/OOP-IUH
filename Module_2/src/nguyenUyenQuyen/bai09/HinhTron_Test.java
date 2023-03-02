package nguyenUyenQuyen.bai09;

public class HinhTron_Test {
	public static void main(String[] args) {
		try {
			HinhTron h1 = new HinhTron(new ToaDo("P", 5, 5), 10.5);
			System.out.println(h1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
