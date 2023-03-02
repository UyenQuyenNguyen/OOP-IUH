package nguyenUyenQuyen.bai01;

public class ToaDo {
	private float X;
	private float Y;
	private char Name;
	public ToaDo() {
		this(0, 0, ' ');
	}
	public ToaDo(float x, float y, char name){
		this.X = x;
		this.Y= y;
		this.Name= name;
	}
	public float getX() {
		return X;
	}
	public void setX(float x) {
		X = x;
	}
	public float getY() {
		return Y;
	}
	public void setY(float y) {
		Y = y;
	}
	public char getName() {
		return Name;
	}
	public void setName(char name) {
		Name = name;
	}
	public String toString(){
		return String.format(" ",Name, X, Y);
	}
	public String getThongTin(){
		return Name +"(" + X +"," + Y +")" ;
	}
}
	


