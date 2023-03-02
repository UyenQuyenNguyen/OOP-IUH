package nguyenUyenQuyen.bai14;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		Product p = new Product("Nguyen Uyen Quyen", "21124421", 1000000);
		OrderDetail od = new OrderDetail(p, 1);
		Order o = new Order(1, LocalDate.of(2022, 9, 30));
		System.out.println(o.getOrderID());
	}
}
