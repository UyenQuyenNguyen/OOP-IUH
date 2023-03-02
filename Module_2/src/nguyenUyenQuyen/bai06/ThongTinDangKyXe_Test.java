package nguyenUyenQuyen.bai06;

public class ThongTinDangKyXe_Test {
	public static void main(String[] args) {
		try{
//		ThongTinDangKyXe dk1 = new ThongTinDangKyXe("Nguyễn Thu Loan","Future Neo",35000000,100);
//		ThongTinDangKyXe dk2 = new ThongTinDangKyXe("Lê Minh Tính","Ford Ranger",250000000,300);
//		ThongTinDangKyXe dk3 = new ThongTinDangKyXe("Nguyễn Minh Triết","Landscape",100000000,1500);
		
		ThongTinDangKyXe dk[] = new ThongTinDangKyXe[3];
		dk[0] = new ThongTinDangKyXe("Nguyễn Thu Loan","Future Neo",35000000,100);
		dk[1] = new ThongTinDangKyXe("Lê Minh Tính","Ford Ranger",250000000,300);
		dk[2] =  new ThongTinDangKyXe("Nguyễn Minh Triết","Landscape",100000000,1500);
		
		System.out.println(ThongTinDangKyXe.taoTieuDe());
		for (ThongTinDangKyXe x : dk) {
			System.out.println(x);
		}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}	
}
