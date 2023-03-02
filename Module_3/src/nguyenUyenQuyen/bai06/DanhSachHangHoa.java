package nguyenUyenQuyen.bai06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DanhSachHangHoa {
	private ArrayList<HangHoa> list;
	private LoaiHang phanLoai;
	/**
	 * 
	 */
	public DanhSachHangHoa() {
		list = new ArrayList<HangHoa>();
	}
	
	public int getLength(){
		return list.size();
	}
	
	public boolean themHangHoa(HangHoa e){
		if(list.contains(e))
			return false;
		return list.add(e);
	}
	/**
	 * @param phanLoai
	 * Xuat thong tin hang hoa theo phan loai
	 */
	public void xuatHangHoaTheoPhanLoai(LoaiHang phanLoai){
		if(phanLoai == LoaiHang.HANGTHUCPHAM){
			for (HangHoa x : list) {
				if(x instanceof HangThucPham)
					System.out.println(x);
				
			}
		}if(phanLoai == LoaiHang.HANGDIENMAY){
			for (HangHoa x : list) {
				if(x instanceof HangDienMay)
					System.out.println(x);
			}
		}if(phanLoai == LoaiHang.HANGSANHSU){
			for (HangHoa x : list) {
				if(x instanceof HangSanhSu)
					System.out.println(x);
			}
		}
	}
	/**
	 * 
	 * @param maTim
	 * @return Danh sach hang hoa co ma trung voi ma tim kiem
	 */
	public DanhSachHangHoa timKiem(String maTim){
		DanhSachHangHoa kq = new DanhSachHangHoa();
		for (HangHoa x : list) {
			if(x.getMaHang().equalsIgnoreCase(maTim)){
				kq.themHangHoa(x);
			}
		}
		return kq;
	}
	
	public void SapXepTenTang(){
		Collections.sort(list, new Comparator<HangHoa>() {
			
			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});
	}
	
//	public void xuatDanhSachThucPhamKhoBan(){
//		for (HangHoa x : list) {
//			if(x instanceof HangThucPham){
//				if(x.danhGiaMucDoBanBuon().equalsIgnoreCase("Khó bán.")){
//					System.out.println(x);
//				}
//			}
//		}
//	}
	
	public List<HangHoa> layDanhSachThucPhamKhoBan(){
		List<HangHoa> kq = new ArrayList<HangHoa>();
		for (HangHoa x : kq) {
			if(x instanceof HangThucPham){
				if(x.danhGiaMucDoBanBuon().equalsIgnoreCase("Khó bán.")){
					kq.add(x);
				}
			}
		}
		return kq;
	}
	
	
	
	
	public String toString(){
		String tp = "";
		String dm = "";
		String ss = "";
		for (HangHoa x : list) {
			if(x instanceof HangThucPham){
				tp += x + "\n";
			}
			else if(x instanceof HangDienMay){
				dm += x + "\n";
			}
			else if(x instanceof HangSanhSu){
				ss += x + "\n";
			}
		}
		return "Hàng Thực Phẩm: \n" + tp +
				"Hàng Điện Máy: \n" + dm +
				"Hàng Sành Sứ: \n" + ss;
	}
	
}
