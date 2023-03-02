package nguyenUyenQuyen.bai05;

public class Commission extends Employee {
	private double grossSales;
	private float commissionRate;
	/**
	 * @param firstName
	 * @param lastName
	 * @param SNN
	 * @param grossSales
	 * @param commissionRate
	 */
	public Commission(String firstName, String lastName, int SNN,
			double grossSales, float commissionRate) {
		super(firstName, lastName, SNN);
		setGrossSales(grossSales);
		setCommissionRate(commissionRate);
	}
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		if(grossSales >= 0 )
			this.grossSales = grossSales;
		else
			this.grossSales = 0;
	}
	public float getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(float commissionRate) {
		if(commissionRate >= 0 )
			this.commissionRate = commissionRate;
		else
			this.commissionRate = 0;
	}
	
	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return commissionRate * grossSales;
	}
	@Override
	public String toString() {
		return "commission employee: " + super.toString() + "\ngross sales: " + grossSales + "\ncommission rate: "+ commissionRate;
	}
	
	
	
	
	
}
