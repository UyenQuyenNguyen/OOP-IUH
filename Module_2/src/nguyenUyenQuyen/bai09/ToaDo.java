package nguyenUyenQuyen.bai09;

public class ToaDo {
	private String ten;
	private float x, y;
	/**
	 * 
	 */
	public ToaDo() {
		x = y = 0;
		ten = "O";
	}
	/**
	 * @param ten
	 * @param x
	 * @param y
	 */
	public ToaDo(String ten, float x, float y) {
		super();
		this.ten = ten;
		this.x = x;
		this.y = y;
	}
	/**
	 * @return the ten
	 */
	public String getTen() {
		return ten;
	}
	/**
	 * @param ten the ten to set
	 */
	public void setTen(String ten) {
		this.ten = ten;
	}
	/**
	 * @return the x
	 */
	public float getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(float x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public float getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(float y) {
		this.y = y;
	}
	
	public String toString(){
		return String.format("%s(%.0f,%.0f)",ten,x,y);
	}
	
	
	
	

	
}
