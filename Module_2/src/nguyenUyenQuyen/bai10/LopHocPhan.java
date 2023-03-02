package nguyenUyenQuyen.bai10;

public class LopHocPhan {
	private String maLHP, tenLHP, tenGV, thongTinLopHoc;
	private SinhVien[] dsSV;

	/**
	 * @param maLHP
	 * @param tenLHP
	 * @param tenGV
	 * @param thongTinLopHoc
	 * @param dsSV
	 */
	public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongTinLopHoc, SinhVien[] dsSV)throws Exception {
		setMaLHP(maLHP);
		setTenLHP(tenLHP);
		setTenGV(tenGV);
		setThongTinLopHoc(thongTinLopHoc);
		setDsSV(dsSV);
	}

	public String getMaLHP() {
		return maLHP;
	}

	public void setMaLHP(String maLHP) throws Exception {
		if (!maLHP.trim().equals("")) {
			this.maLHP = maLHP;
		} else
			throw new Exception("Loi: Ma lop hoc phan rong !");
	}

	public String getTenLHP() {
		return tenLHP;
	}

	public void setTenLHP(String tenLHP) throws Exception {
		if (!tenLHP.trim().equals("")) {
			this.tenLHP = tenLHP;
		} else
			throw new Exception("Loi: Ten lop hoc phan rong !");
	}

	public String getTenGV() {
		return tenGV;
	}

	public void setTenGV(String tenGV)throws Exception {
		if(!tenGV.trim().equals("")){
			this.tenGV = tenGV;
		}
		else
			throw new Exception("Loi: Ten giao vien rong !");
	}

	public String getThongTinLopHoc() {
		return thongTinLopHoc;
	}

	public void setThongTinLopHoc(String thongTinLopHoc)throws Exception {
		if(!thongTinLopHoc.trim().equals("")){
			this.thongTinLopHoc = thongTinLopHoc;
		}else
			throw new Exception("Loi: Thong tin lop hoc rong !");
	}

	public SinhVien[] getDsSV() {
		return dsSV;
	}

	public void setDsSV(SinhVien[] dsSV) {
		this.dsSV = dsSV;
	}
	public int getSoLuongSV() {
		int k = 0;
		for (int i = 0; i < dsSV.length; i++) {
			if (dsSV[i] == null)
				return k;
			k++;
		}
		return k;
	}
	
	public String toString() {
		String s = "";
		for (SinhVien sv : dsSV) {
			s+= sv +"\n";
		}
		return String.format("- Mã LHP: %s\n- Tên LHP: %s\n- GV giảng dạy: %s\n- Thông tin buổi học: %s\n\nDanh sách sinh viên\n%sTổng số sinh viên:%d",maLHP,tenLHP,tenGV,thongTinLopHoc,s,getSoLuongSV());
	}
	
	

}
