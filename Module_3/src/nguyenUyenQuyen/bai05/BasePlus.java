package nguyenUyenQuyen.bai05;

public class BasePlus extends Commission{
	private double baseSalary;

	/**
	 * @param firstName
	 * @param lastName
	 * @param SNN
	 * @param grossSales
	 * @param commissionRate
	 * @param baseSalary
	 */
	public BasePlus(String firstName, String lastName, int SNN,
			double grossSales, float commissionRate, double baseSalary) {
		super(firstName, lastName, SNN, grossSales, commissionRate);
		setBaseSalary(baseSalary);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if(baseSalary >= 0)
			this.baseSalary = baseSalary;
		else
			this.baseSalary = 0;
	}
	
	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return super.earnings() * baseSalary;
	}

	@Override
	public String toString() {
		return "base salaried " + super.toString() + "\nbase salary: " + baseSalary;
	}
	
	
	
	
	
	
	
	

}
