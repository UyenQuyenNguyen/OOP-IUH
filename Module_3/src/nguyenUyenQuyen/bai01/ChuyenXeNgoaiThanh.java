package nguyenUyenQuyen.bai01;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
	private String noiDen;
	private int soNgayDiDuoc;
	/**
	 * 
	 */
	public ChuyenXeNgoaiThanh() {
		super();
		noiDen = "xxx";
		soNgayDiDuoc = 999999;
	}
	/**
	 * @param noiDen
	 * @param soNgayĐiDuoc
	 */
	public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe,
			double doanhThu,String noiDen, int soNgayDiDuoc) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		setNoiDen(noiDen);
		setSoNgayDiDuoc(soNgayDiDuoc);
		
	}
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		if(!noiDen.trim().equals(""))
			this.noiDen = noiDen;
		else
			noiDen = "xxx";
	}
	public int getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}
	public void setSoNgayDiDuoc(int soNgayDiDuoc) {
		if(soNgayDiDuoc > 0)
			this.soNgayDiDuoc = soNgayDiDuoc;
		else
			soNgayDiDuoc = 999999;
	}
	
	
	
	@Override
	public String toString() {
		return String.format("%8s %30s %15s %20s %15d %15s %15s %20s",super.getMaSoChuyen(), super.getHoTenTaiXe(), super.getSoXe(), noiDen, soNgayDiDuoc, "", "", super.getDoanhThu());
	}
	
	
	
	
	
	
	
}
