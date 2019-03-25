public class programplanet{
public static void main (String [] args){
	planet plt = new planet(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9]);
	
	String nama = plt.getnama();
	String ditemukan = plt.getditemukan();
	String diameter = plt.getdiameter();
	String jenis = plt.getjenis();
	String rotasi = plt.getrotasi();
	String revolusi = plt.getrevolusi();
	String satelit = plt.getsatelit();
	String bintang = plt.getbintang();
	String sabumi = plt.getsabumi();
	String jenisbintang = plt.getjenisbintang();
	
	System.out.println(nama);
	System.out.println(ditemukan);
	System.out.println(diameter);
	System.out.println(jenis);
	System.out.println(rotasi);
	System.out.println(revolusi);
	System.out.println(satelit);
	System.out.println(bintang);
	System.out.println(sabumi);
	System.out.println(jenisbintang);
	
	
}	
}