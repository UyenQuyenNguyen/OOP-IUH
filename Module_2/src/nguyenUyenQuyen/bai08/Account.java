package nguyenUyenQuyen.bai08;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	final double RATE = 0.035;
	/**
	 * 
	 */
	public Account() {
		accountNumber = 999999;
		name = "Chưa xác định";
		balance = 50000;
	}
	/**
	 * @param accountNumber
	 * @param name
	 * @param balance
	 */
	public Account(long accountNumber, String name, double balance) {
		setAccountNumber(accountNumber);
		setName(name);
		setBalance(balance);
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	private void setAccountNumber(long accountNumber){
		if(accountNumber > 0)
			this.accountNumber = accountNumber;
		else 
			accountNumber = 999999;
	}
	private void setName(String name) {
		if(!name.trim().equals(""))
			this.name = name;
		else
			name = "Chưa xác định";
	}
	public double getBalance() {
		return balance;
	}
	private void setBalance(double balance) {
		if(balance >= 50000)
			this.balance = balance;
		else
			balance = 50000;
	}
	
	public boolean deposit(double amount){
		if(amount > 0){
			balance += amount;
			return true;
		}else
			return false;
	}
	
	public boolean withdraw(double amount, double fee){
		if(amount > 0 && (amount + fee) <= this.balance+50000){
			balance -= (amount + fee);
			return true;
		}else
			return false;
	}
	
	public void addInterest(){
		balance += balance *  RATE;
	}
	
	public boolean transfer(Account acc2, double amount){
		if(amount > 0 && amount < this.balance + 50000){
			this.withdraw(amount, 0);
			acc2.deposit(amount);
			return true;
		}else
			return false;
	}
	
	public static String taoTieuDe(){
		return String.format("%-20s%-25s%25s", "SO TAI KHOAN", "TEN TAI KHOAN", "SO TIEN" + "\n-----------------------------------------------------------------------");
	}
	
	public String toString(){
		Locale localeVN = new Locale("vi","VN");
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
		String balance = numberFormat.format(getBalance());
		return String.format("%-20d%-25s%-25s",accountNumber, name, balance);
	}
	
}
