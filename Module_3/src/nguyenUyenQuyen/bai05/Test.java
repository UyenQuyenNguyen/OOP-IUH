package nguyenUyenQuyen.bai05;

public class Test {
	public static void main(String[] args) {	
		Employee_List l = new Employee_List();
		l.addEmployee(new Salaried("Nguyen", "A", 21124421, 100));
		l.addEmployee(new Hourly("Tran", "B", 2116241, 150, 3));
		l.addEmployee(new Commission("Le", "C", 21124321, 500, (float)1.5));
		l.addEmployee(new BasePlus("Pham","D" , 21121551, 100000, (float)2.0, 3000000));
		l.addEmployee(new Commission("Le", "C", 21124321, 500, (float)1.5));
		
		System.out.println(l);
		
	}
}
