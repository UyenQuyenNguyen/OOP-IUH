package nguyenUyenQuyen.bai14;

public class OrderDetail {
	private int quatity;
	private Product product;

	/**
	 * @param quatity
	 * @param product
	 */
	public OrderDetail(int x){
		
	}
	public OrderDetail(Product p, int x) {
		p = new Product();
		setQuatity(x);
	}

	public int getQuatity() {
		return quatity;
	}

	public void setQuatity(int quatity) {
		if (quatity > 0)
			this.quatity = quatity;
		else
			quatity = 1;
	}
	
	public double calcTotalPrice(){
		return quatity * product.getPrice();
	}

	@Override
	public String toString() {
		return "%5d | "+ quatity + product;
	}

}
