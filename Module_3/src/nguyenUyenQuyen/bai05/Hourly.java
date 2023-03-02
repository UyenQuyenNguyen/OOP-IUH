package nguyenUyenQuyen.bai05;

public class Hourly extends Employee{
	private double wage;
	private int hours;
	/**
	 * @param firstName
	 * @param lastName
	 * @param SNN
	 * @param wage
	 * @param hours
	 */
	public Hourly(String firstName, String lastName, int SNN, double wage,
			int hours) {
		super(firstName, lastName, SNN);
		setWage(wage);
		setHours(hours);
	}

	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		if(wage >= 0)
			this.wage = wage;
		else
			wage = 0;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		if(hours >= 0)
			this.hours = hours;
		else
			hours = 0;
	}
	
	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		if(hours <= 40)
			return wage * hours;
		else{
			return 40 * wage + (hours - 40) * wage * 1.5;
		}
	}
	
	@Override
	public String toString() {
		return "hourly emloyee: " + super.toString() + "\nhourly wage: " + wage + "; hours worked: " + hours; 
	}
	
	
	
	
}
