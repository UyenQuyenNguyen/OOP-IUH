package nguyenUyenQuyen.bai02;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach{
	private  boolean tinhTrang;

	/**
	 * 
	 */
	public SachGiaoKhoa() {
		super();
		tinhTrang = true;
	}

	/**
	 * @param tinhTrang
	 */
	public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong,
			String NXB, boolean tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, NXB);
		setTinhTrang(tinhTrang);
	}

	public boolean getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	@Override
	public String toString() {
		String TinhTrang ="";
		if(tinhTrang)
			TinhTrang = "Mới";
		else
			TinhTrang = "Cũ";
		return String.format("%10s %20s %15s %15s %25s %15s %15s", super.getMaSach(), super.getNgayNhap(), super.getDonGia(), super.getSoLuong(), super.getNXB(), TinhTrang,"");
	}
	
	
	
}
