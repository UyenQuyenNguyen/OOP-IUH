package nguyenUyenQuyen.bai01;
import java.text.NumberFormat;
import java.util.Locale;
public class ChuyenXe {
	private String  maSoChuyen, hoTenTaiXe, soXe;
	private double doanhThu;
	/**
	 * 
	 */
	public ChuyenXe() {
		maSoChuyen = "xxx";
		hoTenTaiXe = "xxx";
		soXe = "xxx";
		doanhThu = 999999;
	}
	/**
	 * @param maSoChuyen
	 * @param hoTenTaiXe
	 * @param soXe
	 * @param doanhThu
	 */
	public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe,
			double doanhThu) {
		setMaSoChuyen(maSoChuyen);
		setHoTenTaiXe(hoTenTaiXe);
		setSoXe(soXe);
		setDoanhThu(doanhThu);
	}
	public String getMaSoChuyen() {
		return maSoChuyen;
	}
	public void setMaSoChuyen(String maSoChuyen) {
		if(!maSoChuyen.trim().equals(""))
			this.maSoChuyen = maSoChuyen;
		else
			maSoChuyen = "xxx";
	}
	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}
	public void setHoTenTaiXe(String hoTenTaiXe) {
		if(!hoTenTaiXe.trim().equals(""))
			this.hoTenTaiXe = hoTenTaiXe;
		else
			hoTenTaiXe = "xxx";
	}
	public String getSoXe() {
		return soXe;
	}
	public void setSoXe(String soXe) {
		if(!soXe.trim().equals(""))
			this.soXe = soXe;
		else
			soXe = "xxx";
	}
	public double getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		if(doanhThu > 0)
			this.doanhThu = doanhThu;
		else
			doanhThu = 999999;
	}
	public static String taoTieuDe(){
		return String.format("%8s %25s %15s %15s %20s %15s %15s %20s","MÃ SỐ CHUYẾN", "HỌ TÊN TÀI XẾ", "SỐ XE", "NƠI ĐẾN", "SỐ NGÀY ĐI ĐƯỢC", "SỐ TUYẾN", "SỐ KM ĐI ĐƯỢC", "DOANH THU");
	}
	
	@Override
	public String toString() {
		Locale localeVN = new Locale("vi","VN");
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
		String DoanhThu = numberFormat.format(getDoanhThu());
		
		
		return String.format("%8s %25s %25s %10s %15s %15s %15s %20s", maSoChuyen, hoTenTaiXe, soXe,"","","","" ,DoanhThu);
	}
	
	
	
	
	
	
}
