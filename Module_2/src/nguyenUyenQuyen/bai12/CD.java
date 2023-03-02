package nguyenUyenQuyen.bai12;

public class CD {
	private int maCD, soBaiHat;
	private String tuaCD;
	private float giaThanh;
	/**
	 * 
	 */
	public CD() {
		maCD = 999999;
		tuaCD = "Chưa xác định";
		soBaiHat = 999999;
		giaThanh = 999999;
	}
	/**
	 * @param maCD
	 * @param soBaiHat
	 * @param tuaCD
	 * @param giaThanh
	 */
	public CD(int maCD, int soBaiHat, String tuaCD, float giaThanh) {
		setMaCD(maCD);
		setSoBaiHat(soBaiHat);
		setTuaCD(tuaCD);
		setGiaThanh(giaThanh);
	}
	public int getMaCD() {
		return maCD;
	}
	public void setMaCD(int maCD) {
		if(maCD > 0)
			this.maCD = maCD;
		else
			this.maCD = 999999;
	}
	public int getSoBaiHat() {
		return soBaiHat;
	}
	public void setSoBaiHat(int soBaiHat) {
		if(soBaiHat > 0)
			this.soBaiHat = soBaiHat;
		else
			this.soBaiHat = 999999;
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tuaCD) {
		if(!tuaCD.isEmpty()){
			this.tuaCD = tuaCD;
		}else
			this.tuaCD = "Chưa xác định";
	}
	public float getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(float giaThanh) {
		if(giaThanh > 0)
			this.giaThanh = giaThanh;
		else
			this.giaThanh = 999999;
	}
	public String toString() {
		return String.format("%-15d %-20s %-15d %-15.2f\n",maCD,tuaCD,soBaiHat,giaThanh);
	}
	
	
	
	
	
}
