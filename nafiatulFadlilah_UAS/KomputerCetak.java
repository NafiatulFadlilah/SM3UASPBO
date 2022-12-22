package nafiatulFadlilah_UAS;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * Kelas: SIB 2E
 */
public final class KomputerCetak {
    
    final static void cetak(Komputer[] obj){
        for(int i = 0; i < obj.length; i++){
            if(obj[i] instanceof PC){
                System.out.println("=====|| PC ||=====");
                PC pc = (PC)obj[i];
                pc.hidupkan_os();
                pc.klik_kanan();
                pc.klik_kiri();
                pc.tekan_enter();
                pc.cetak_data();
                pc.matikan_os();
                System.out.println();
            }else if(obj[i] instanceof Laptop){
                System.out.println("=====|| Laptop ||=====");
                Laptop lp = (Laptop)obj[i];
                lp.hidupkan_os();
                lp.klik_kanan();
                lp.klik_kiri();
                lp.tekan_enter();
                lp.cetak_data();
                lp.matikan_os();
                System.out.println();
            }else if(obj[i] instanceof Netbook){
                System.out.println("=====|| Netbook ||=====");
                Netbook nb = (Netbook)obj[i];
                nb.hidupkan_os();
                nb.klik_kanan();
                nb.klik_kiri();
                nb.tekan_enter();
                nb.cetak_data();
                nb.matikan_os();
                System.out.println();
            }else{
                System.out.println("Nothing");
            }
        }
    }
    
    public static void main(String[] args){
        PC pisi = new PC("Dell XPS AIO 27", "Intel Core i5", 3, 16, 27);
        Laptop lappy = new Laptop("MacBook pro", "Intel Core i5", 4, 8, "Lithium Polymer");
        Netbook netbuk = new Netbook("HP 110-3014TU Mini", "Intel Atom Processor N475", 1, 2, "Heat Pipe");
        
        Komputer[] kom = {pisi, lappy, netbuk};        
        cetak(kom);        
    }
}