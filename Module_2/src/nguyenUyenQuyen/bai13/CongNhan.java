package nguyenUyenQuyen.bai13;
import java.text.DecimalFormat;
public class CongNhan {
	private int mMa;
	private String mHo, mTen;
	private int mSoSP;

	/**
	 * 
	 */
	public CongNhan() {
		mMa = 999999;
		mHo = "Chưa nhập";
		mTen = "Chưa nhập";
		mSoSP = 0;
	}

	/**
	 * @param mMa
	 * @param mHo
	 * @param mTen
	 * @param mSoSP
	 */
	public CongNhan(int mMa, String mHo, String mTen, int mSoSP) {
		setmMa(mMa);
		setmHo(mHo);
		setmTen(mTen);
		setmSoSP(mSoSP);
	}

	public int getmMa() {
		return mMa;
	}

	public void setmMa(int mMa) {
		if (mMa > 0)
			this.mMa = mMa;
		else
			mMa = 999999;
	}

	public String getmHo() {
		return mHo;
	}

	public void setmHo(String mHo) {
		if (!mHo.trim().equals(""))
			this.mHo = mHo;
		else
			mHo = "Chưa nhập !";
	}

	public String getmTen() {
		return mTen;
	}

	public void setmTen(String mTen) {
		if (!mTen.trim().equals(""))
			this.mTen = mTen;
		else
			mTen = "Chưa nhập !";
	}

	public int getmSoSP() {
		return mSoSP;
	}

	public void setmSoSP(int mSoSP) {
		if(mSoSP >= 0)
			this.mSoSP = mSoSP;
		else
			mSoSP = 0;
	}
	
	public double tinhLuong(){
		double salary;
		if(mSoSP >=1 && mSoSP < 200){
			salary = 0.5 * mSoSP;
		}else if(mSoSP >= 200 && mSoSP < 400){
			salary = 0.55 * mSoSP;
		}else if(mSoSP >= 400 && mSoSP < 600){
			salary = 0.6 * mSoSP;
		}else if(mSoSP > 600){
			salary = 0.65 * mSoSP;
		}else
			salary = 0;
		return salary;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("%10d %20s %10s %15d %15s", mMa, mHo, mTen, mSoSP, df.format(tinhLuong()));
	}
	
	
	

}
