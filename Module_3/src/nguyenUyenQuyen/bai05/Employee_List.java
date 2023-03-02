package nguyenUyenQuyen.bai05;

import java.util.ArrayList;

public class Employee_List {
	private ArrayList<Employee> list;
	/**
	 * 
	 */
	public Employee_List() {
		list = new ArrayList<Employee>();
	}
	/**
	 * 
	 * @param e
	 * @return true, neu them thanh cong doi tuong
	 */
	public boolean addEmployee(Employee e){
		if(list.contains(e)){
			return false;
		}
		return list.add(e);
	}

	@Override
	public String toString() {
		String s = "";
		for (Employee employee : list) {
			s += employee + "\n\n";
		}
		return s;
	}
	
	

		
	
}
