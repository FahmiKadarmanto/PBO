public class planet{
		private String nama;
		private String ditemukan;
		private String diameter;
		private String jenis;
		private String rotasi;
		private String revolusi;
		private String satelit;
		private String bintang;
		private String sabumi;
		private String jenisbintang;
		
	public planet(String nama, String ditemukan, String diameter, String jenis, String rotasi, String revolusi, String satelit, String bintang, String sabumi, String jenisbintang){
		this.nama=nama;
		this.ditemukan=ditemukan;
		this.diameter=diameter;
		this.jenis=jenis;
		this.rotasi=rotasi;
		this.revolusi=revolusi;
		this.satelit=satelit;
		this.bintang=bintang;
		this.sabumi=sabumi;
		this.jenisbintang=jenisbintang;
	}
	
	public void setnama(String namaplanet){
		nama = namaplanet;
	}
	public String getnama(){
		return nama;
	}
	
	public void setditemukan(String ditemukannya){
		ditemukan =ditemukannya;
	}
	public String getditemukan(){
		return ditemukan;
	}
	
	public void setdiameter(String diameternya){
		diameter = diameternya;
	}
	public String getdiameter(){
		return diameter;
	}
	
	public void setjenis(String jenisnya){
		jenis = jenisnya;
	}
	public String getjenis(){
		return jenis;
	}
	
	public void setrotasi(String rotasinya){
		rotasi = rotasinya;
	}
	public String getrotasi(){
		return rotasi;
	}
	
	
	public void setrevolusi(String revolusinya){
		revolusi = revolusinya;
	}
	public String getrevolusi(){
		return revolusi;
	}
	
	public void setsatelit(String jumlahsatelit){
		satelit = jumlahsatelit;
	}
	public String getsatelit(){
		return satelit;
	}
	
	
	public void setbintang(String namabintang){
		bintang = namabintang;
	}
	public String getbintang(){
		return bintang;
	}
	
	
	
	public void setsabumi(String jarakbumi){
		sabumi = jarakbumi;
	}
	public String getsabumi(){
		return sabumi;
	}
	
	
	public void setjenisbintang(String jenisbintangnya){
		jenisbintang = jenisbintangnya;
	}
	public String getjenisbintang(){
		return jenisbintang;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
