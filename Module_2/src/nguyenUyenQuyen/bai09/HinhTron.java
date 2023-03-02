package nguyenUyenQuyen.bai09;

public class HinhTron {
	private ToaDo tam;
	private double banKinh;

	/**
	 * 
	 */
	public HinhTron() {
		tam.setX(0);
		tam.setY(0);
		banKinh = 1;

	}

	/**
	 * @param tam
	 * @param banKinh
	 */
	public HinhTron(ToaDo tam, double banKinh) throws Exception {
		this.tam = tam;
		setBanKinh(banKinh);
	}

	public ToaDo getTam() {
		return tam;
	}

	public void setTam(ToaDo tam) {
		this.tam = tam;
	}

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) throws Exception {
		if (banKinh > 0)
			this.banKinh = banKinh;
		else
			throw new Exception("Loi: Ban kinh < 0 ! ");
	}

	public double tinhChuVi() {
		return 2 * Math.PI * banKinh;
	}

	public double tinhDienTich() {
		return Math.PI * Math.pow(banKinh, 2);
	}

	@Override
	public String toString() {
		return String.format("Diện tích và chu vi hình tròn tâm %s có bán kính %.1fm là %.2f và %.2f",tam,banKinh,tinhDienTich(),tinhChuVi());
	}

}
