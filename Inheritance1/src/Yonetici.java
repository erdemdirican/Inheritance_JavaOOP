
public class Yonetici extends Calisan { //SubClass
    
    private int sorumlu_kisi;
    
    public Yonetici(String isim, int maas, String departman, int sorumlu_kisi){
        
        /*
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
        */
        
        super(isim, maas, departman);
        
        this.sorumlu_kisi = sorumlu_kisi;
        
    }
    
    public void zamYap(int zam_miktarı){
        System.out.println("Çalışanlara " + zam_miktarı + " tl zamn yapıldı.");
    }
    
    public void bilgileriGoster(){
        /*System.out.println("İsim: " + getIsim());
        System.out.println("Maaş: " + getMaas());
        System.out.println("Departman: " + getDepartman());*/
        
        super.bilgileriGoster();
        
        System.out.println("Sorumlu kişi sayısı: " + this.sorumlu_kisi);
    }
    
}
