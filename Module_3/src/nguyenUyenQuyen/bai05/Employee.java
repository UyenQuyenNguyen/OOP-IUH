package nguyenUyenQuyen.bai05;

public abstract class Employee {
	protected int SNN;
	protected String firstName, lastName;
	/**
	 * @param nSS
	 * @param firstName
	 * @param lastName
	 */
	public Employee(String firstName, String lastName, int SNN) {
		setFirstName(firstName);
		setLastName(lastName);
		setSNN(SNN);
	}

	public void setSNN(int sNN) {
		if(sNN > 0)
			SNN = sNN;
		else
			SNN = 1;
	}

	public void setFirstName(String firstName) {
		if(!firstName.trim().equals(""))
			this.firstName = firstName;
		else
			firstName = "xxx";
	}

	public void setLastName(String lastName) {
		if(!lastName.trim().equals(""))
			this.lastName = lastName;
		else
			lastName = "xxx";
	}

	/**
	 * 
	 * @return tong Luong
	 */
	public abstract double earnings();
	
	@Override
	public String toString() {
		return String.format("%s %s \nsocial sercuity number: %s ", firstName, lastName, SNN);
	}
	
	
	
}
