package nguyenUyenQuyen.bai01;

public class ChuyenXeNoiThanh extends ChuyenXe{
	private int soTuyen;
	private float soKmDiDuoc;
	/**
	 * 
	 */
	public ChuyenXeNoiThanh() {
		super();
		soTuyen = 999999;
		soKmDiDuoc = 999999;
	}
	/**
	 * @param soTuyen
	 * @param soKmDiDuoc
	 */
	public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe,
			double doanhThu, int soTuyen, float soKmDiDuoc) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		setSoTuyen(soTuyen);
		setSoKmDiDuoc(soKmDiDuoc);
		
	}
	public int getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(int soTuyen) {
		if(soTuyen > 0)
			this.soTuyen = soTuyen;
		else
			soTuyen = 999999;
		
	}
	public float getSoKmDiDuoc() {
		return soKmDiDuoc;
	}
	public void setSoKmDiDuoc(float soKmDiDuoc) {
		if(soKmDiDuoc > 0)
			this.soKmDiDuoc = soKmDiDuoc;
		else
			soKmDiDuoc = 999999;
	}
	 
	@Override
	public String toString() {
		
		return String.format("%8s %30s %15s %20s %15s %15s %15.2f %20s",super.getMaSoChuyen(), super.getHoTenTaiXe(), super.getSoXe(), "", "", soTuyen, soKmDiDuoc, super.getDoanhThu());
	}
	
	
	
	
	
	
}
