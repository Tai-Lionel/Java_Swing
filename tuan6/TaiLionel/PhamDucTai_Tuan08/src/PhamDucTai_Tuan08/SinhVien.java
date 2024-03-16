package PhamDucTai_Tuan08;

public class SinhVien {

	private String masv;
	private String ho;
	private String ten;
	private String phai;
	private String email;
	private String diaChi;
	private String maLop;
	
	public SinhVien(String masv, String ho, String ten, String phai, String email, String diaChi, String maLop) {
		super();
		this.masv = masv;
		this.ho = ho;
		this.ten = ten;
		this.phai = phai;
		this.email = email;
		this.diaChi = diaChi;
		this.maLop = maLop;
	}

	public String getMasv() {
		return masv;
	}

	public void setMasv(String masv) {
		this.masv = masv;
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getPhai() {
		return phai;
	}

	public void setPhai(String phai) {
		this.phai = phai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getMaLop() {
		return maLop;
	}

	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}

	@Override
	public String toString() {
		return "SinhVien [masv=" + masv + ", ho=" + ho + ", ten=" + ten + ", phai=" + phai + ", email=" + email
				+ ", diaChi=" + diaChi + ", maLop=" + maLop + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((masv == null) ? 0 : masv.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		if (masv == null) {
			if (other.masv != null)
				return false;
		} else if (!masv.equals(other.masv))
			return false;
		return true;
	}
	
}
