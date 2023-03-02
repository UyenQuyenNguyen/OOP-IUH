package nguyenUyenQuyen.bai07;

import java.time.LocalDate;

public class HangThucPham_Test {
	public static void main(String[] args) {
		try{
			HangThucPham Hang1 =  new HangThucPham("001","Gạo",100000,LocalDate.of(2018,7,10),LocalDate.of(2018,7,10));
			HangThucPham Hang2 =  new HangThucPham("002","Mì",5000,LocalDate.of(2018,1,3),LocalDate.of(2018,3,9));
			HangThucPham Hang3 =  new HangThucPham("003","Nước",10000,LocalDate.of(2017,1,3),LocalDate.of(2022,9,25));
			HangThucPham Hang4 = new HangThucPham();
			System.out.println(HangThucPham.taoTieDe());
			System.out.println(Hang1);
			System.out.println(Hang2);
			System.out.println(Hang3);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
		
}
