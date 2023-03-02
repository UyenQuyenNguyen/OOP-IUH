package nguyenUyenQuyen.bai08;

public class Account_Test {
	public static void main(String[] args) {
		Account acc[] = new Account[3];
		acc[0] = new Account(72354, "Ted Murphy", 100000);
		acc[1] = new Account(69713, "Jane Smith", 60000);
		acc[2] = new Account(93757,"Edward Demsey", 700000);
		acc[0].deposit(250000);
		acc[1].deposit(500000);
		acc[1].withdraw(430000,2000);
		acc[2].addInterest();
		System.out.println(Account.taoTieuDe());
		for (Account account : acc) {
			System.out.println(account);
		}
		
		acc[1].transfer(acc[0], 100000);
		System.out.println(acc[0]);
		System.out.println(acc[1]);
	}
}