package nguyenUyenQuyen.bai14;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
public class Order {
	private int orderID;
	private LocalDate orderDate;
	private OrderDetail[] lineItems;
	private int count;
	/**
	 * @param orderDate
	 * @param count
	 */
	public Order(int orderID, LocalDate orderDate) {
		lineItems = new OrderDetail[1]; 
		setOrderDate(orderDate);
		count = 0;
	}
	
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		if(orderDate.isAfter(LocalDate.now())){
			orderDate = LocalDate.now();
		}else
			this.orderDate = orderDate;
	}
	public int getOrderID() {
		return orderID;
	}
	public OrderDetail[] getLineItems() {
		return lineItems;
	}
	public double calcTotalCharge(){
		double total = 0 ;
		for (OrderDetail orderDetail : lineItems) {
			total += orderDetail.calcTotalPrice();
		}
		return total;
	}
	
	
	
	@Override
	public String toString() {
		String s ="";
		for (OrderDetail od : lineItems) {
			s += od + "\n";
		}
//		Locale localeVN = new Locale("vi","VN");
//		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
//		String TotalPrice = numberFormat.format(calcTotalPrice());
		return  "Mã HD:" + orderID + 
				"Ngày lập hóa đơn: " + orderDate +
				"%s" + s +
				"Tổng tiền thanh toán:" + calcTotalCharge(); 
				
				
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
