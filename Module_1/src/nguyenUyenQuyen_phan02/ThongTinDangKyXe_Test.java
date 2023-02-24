package nguyenUyenQuyen_phan02;

public class ThongTinDangKyXe_Test {
	public static void main(String[] args) {
		try{
		ThongTinDangKyXe dk1 = new ThongTinDangKyXe("Nguyễn Thu Loan","Future Neo",100,35000000);
		ThongTinDangKyXe dk2 = new ThongTinDangKyXe("Lê Minh Tính","Ford Ranger",300,250000000);
		ThongTinDangKyXe dk3 = new ThongTinDangKyXe("Nguyễn Minh Triết","Landscape",1500,100000000);
		
		System.out.printf("TÊN CHỦ XE"+"\t\t\t LOẠI XE"+"\t\t DUNG TÍCH"+"\t\t\t TRỊ GIÁ");
		System.out.println("\n==================================================================================================");
		System.out.println(dk1.toString());
		System.out.println(dk2.toString());
		System.out.println(dk3.toString());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}	
}
