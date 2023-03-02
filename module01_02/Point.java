package nguyenUyenQuyen_phan02;
import java.lang.Math;
public class Point {
	private float X;
	private float Y;
	private char Name;
	public Point() {
		 X = 0;
		 Y = 0;
		 Name = 'O';
	}
	public Point(float x, float y, char name){
		this.X = x;
		this.Y= y;
		this.Name= name;
	}
	public void negate(){
		X -=X*2;
		Y -=Y*2;
	}
	public double getDistance(){
		
		return Math.sqrt(X*X+Y*Y);
	}
	public String toString(){
		return String.format(" %c(%.1f, %.1f) ",Name, X, Y);
	}
}

