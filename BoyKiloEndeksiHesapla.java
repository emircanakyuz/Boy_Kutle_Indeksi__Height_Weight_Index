public class BoyKiloEndeksiHesapla {
    private String isim;
    private int yas;
    private double boy;
    private double agirlik;

    public BoyKiloEndeksiHesapla(String isim, int yas, double boy, double agirlik) {
        this.agirlik = agirlik;
        this.boy = boy;
        this.isim = isim;
        this.yas = yas;
    }
    public BoyKiloEndeksiHesapla(String isim, double boy, double agirlik){
        this.isim=isim;
        this.boy=boy;
        this.agirlik=agirlik;
    }
    
    
    public double hesapla(){
        double boyKiloEndeksi=(agirlik/Math.pow(this.boy,2));
        if(yas==0){
            System.out.println("ismi: " + isim + " boyu: " + boy + " Ağırlığı: " + agirlik + "Boy Kilo Endeksi: " + boyKiloEndeksi);    
        }
        else{
            System.out.println("ismi: " + isim + " Yaşı: " + yas + " boyu: " + boy + " Ağırlığı: " + agirlik + "Boy Kilo Endeksi: " + boyKiloEndeksi);
        }
        return 0;
    }
    public String getIsim(){
        return isim;
    }
    public int getYas(){
        return yas;
    }
    public double getBoy(){
        return boy;
    }
    public double getAgirlik(){
        return agirlik;
    }
}
