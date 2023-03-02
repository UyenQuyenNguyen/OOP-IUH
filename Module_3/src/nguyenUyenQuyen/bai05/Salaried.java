package nguyenUyenQuyen.bai05;

public class Salaried extends Employee {
	private double weeklySalary;

	/**
	 * @param nSS
	 * @param firstName
	 * @param lastName
	 * @param weeklySalary
	 */
	public Salaried(String firstName, String lastName, int nSS, double weeklySalary ) {
		super(firstName, lastName, nSS);
		setWeeklySalary(weeklySalary);
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return weeklySalary;
	}

	@Override
	public String toString() {
		return "salaried employee:" + super.toString() + "\nweekly salary: " + weeklySalary;
	}
	
	
	

	
	
}
