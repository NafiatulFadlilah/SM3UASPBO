package nafiatulFadlilah_UAS;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * Kelas: SIB 2E
 */
public class Laptop extends Komputer implements Mouse, Keyboard, Printer{
    String jnsBaterai;
    
    Laptop(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, String jnsBaterai){
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.jnsBaterai = jnsBaterai;        
    }
    
    @Override
    void hidupkan_os(){
        System.out.println("Laptop " + this.merk + " hidup >> MAC OS active / running");
    }

    @Override
    void matikan_os(){
        System.out.println("Laptop " + this.merk + " mati >> MAC OS inactive / stop");
    }

    @Override
    public void klik_kanan(){
        System.out.println("Laptop " + this.merk + " melakukan klik kanan");
    }

    @Override
    public void klik_kiri(){
        System.out.println("Laptop " + this.merk + " melakukan klik kiri");
    }

    @Override
    public void tekan_enter(){
        System.out.println("Laptop " + this.merk + " melakukan enter");
    }

    @Override
    public void cetak_data(){
        System.out.println("Laptop " + this.merk + " dapat mencetak data berikut melalui printer");
        System.out.println("Merk: " + this.merk);
        System.out.println("Jenis Prosesor: " + this.jnsProsesor);
        System.out.println("Kecepatan Prosesor: " + this.kecProsesor);
        System.out.println("Size Memory: " + this.sizeMemory);
        System.out.println("Jenis Baterai: " + this.jnsBaterai);
    }
}