package nguyenUyenQuyen.bai11;
import java.time.LocalDate;
import java.time.Period;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
public class SoTietKiem {
	private String maSo;
	private LocalDate ngayMoSo;
	private double soTienGoi;
	private int kyHan;
	private float laiSuat;
	/**
	 * @param maSo
	 * @param ngayMoSo
	 * @param soTienGoi
	 * @param kiHan
	 * @param laiSuat
	 */
	public SoTietKiem(String maSo, LocalDate ngayMoSo, double soTienGoi,int kyHan, float laiSuat)throws Exception {
		setMaSo(maSo);
		setNgayMoSo(ngayMoSo);
		setSoTienGoi(soTienGoi);
		setKiHan(kyHan);
		setLaiSuat(laiSuat);
	}
	
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo)throws Exception{
		if(!maSo.isEmpty())
			this.maSo = maSo;
		else
			throw new Exception("Loi: Ma so rong !");
	}
	public LocalDate getNgayMoSo() {
		return ngayMoSo;
	}
	public void setNgayMoSo(LocalDate ngayMoSo)throws Exception{
		if(ngayMoSo.isAfter(LocalDate.now())){
			throw new Exception("Loi: Ngay mo so phai be hon hoac bang ngay hien tai !");
		}
		else
			this.ngayMoSo = ngayMoSo;
	}
	public double getSoTienGoi() {
		return soTienGoi;
	}
	public void setSoTienGoi(double soTienGoi)throws Exception{
		if(soTienGoi > 0)
			this.soTienGoi = soTienGoi;
		else
			throw new Exception("Loi: So tien gui < 0");
	}
	public int getKiHan() {
		return kyHan;
	}
	public void setKiHan(int kyHan)throws Exception{
		if(kyHan > 0)
			this.kyHan = kyHan;
		else
			throw new Exception("Loi: Ki han < 0 ");
	}
	public float getLaiSuat() {
		return laiSuat;
	}
	public void setLaiSuat(float laiSuat)throws Exception{
		if(laiSuat > 0)
			this.laiSuat = laiSuat;
		else
			throw new Exception("Loi: Lai suat < 0");
	}
	public int tinhSoThangGoiThuc() {
		Period age = Period.between(ngayMoSo, LocalDate.now());
		int dt_nam = age.getYears();
		int dt_thang = age.getMonths();
		int soThangGoi = dt_nam * 12 + dt_thang;
		if (soThangGoi % kyHan == 0)
			return soThangGoi;
		else
			return soThangGoi / kyHan * kyHan;
	}
	
	public double tinhTienLai(){
		return soTienGoi * laiSuat * tinhSoThangGoiThuc();
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("STK %s[%s-%s]KH %d tháng, số tháng tính lãi: %d, ls %.2f, số tiền:%s --> Tiền lãi: %s",maSo,dtf.format(ngayMoSo),dtf.format(LocalDate.now()),kyHan,tinhSoThangGoiThuc(),laiSuat,df.format(soTienGoi),df.format(tinhTienLai()));
	}
	
	
	
	
}
