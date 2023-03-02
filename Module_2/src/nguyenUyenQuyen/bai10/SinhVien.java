package nguyenUyenQuyen.bai10;

public class SinhVien {
	private String maSV, hoTen;

	/**
	 * @param maSV
	 * @param hoTen
	 */

	public String getMaSV() {
		return maSV;
	}

	public SinhVien(String maSV, String hoTen) throws Exception {
		setMaSV(maSV);
		setHoTen(hoTen);
	}

	public void setMaSV(String maSV) throws Exception {
		if (!maSV.trim().equals(""))
			this.maSV = maSV;
		else
			throw new Exception("Loi: Ma sinh vien rong !");
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) throws Exception {
		if (!hoTen.trim().equals(""))
			this.hoTen = hoTen;
		else
			throw new Exception("Loi: Ten sinh vien rong !");
	}

	@Override
	public String toString() {
		return String.format("\t%s | %s",maSV, hoTen);
	}
	
}
