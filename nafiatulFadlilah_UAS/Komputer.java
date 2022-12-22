package nafiatulFadlilah_UAS;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * Kelas: SIB 2E
 */
public abstract class Komputer implements Mouse, Keyboard, Printer{
    String merk, jnsProsesor;
    int kecProsesor, sizeMemory;
    
    Komputer(String merk, String jnsProsesor, int kecProsesor, int sizeMemory){
        this.merk = merk;
        this.jnsProsesor = jnsProsesor;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
    }
    
    abstract void hidupkan_os();
    abstract void matikan_os();
}