abstract class Hewan {
    String nama;
    int umur;

    Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    abstract void suara();

    void tampilInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur + " tahun");
    }
}

interface Terbang {
    public void terbang();
}

class Kucing extends Hewan {
    String ras;

    Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    @Override
    void suara() {
        System.out.println(nama + " sedang mengeong : Miaw!");
    }

    @Override
    void tampilInfo() {
        super.tampilInfo();
        System.out.println("Jenis : Kucing");
        System.out.println("Ras  : " + ras);
    }
}


class Anjing extends Hewan {
    String jenis;

    Anjing(String nama, int umur, String jenis) {
        super(nama, umur);
        this.jenis = jenis;
    }

    @Override
    void suara() {
        System.out.println(nama + " sedang menggonggong : Woof!");
    }

    @Override
    void tampilInfo() {
        super.tampilInfo();
        System.out.println("Jenis : Anjing");
        System.out.println("Tipe : " + jenis);
    }
}

class Burung extends Hewan implements Terbang {
    String warna;

    Burung(String nama, int umur, String warna) {
        super(nama, umur);
        this.warna = warna;
    }

    @Override 
    void suara() {
        System.out.println(nama + " sedang berkicau : Cuit!");
    }

    public void terbang() {
        System.out.println(nama + " terbang dengan mengepakkan sayap. ");
    }

    @Override
    void tampilInfo() {
        super.tampilInfo();
        System.out.println("Jenis : Burung");
        System.out.println("Warna : " + warna);
    }
}

public class percobaan4 {
    public static void main(String [] args) {
    Hewan[] daftarHewan = {
        new Kucing("Caesar", 3, "Anggora"),
        new Anjing("Juan", 2, "Husky"),
        new Burung("Deny", 1, "Kuning"),
        new Kucing("Josh", 4, "Persia"),
        new Anjing("Zhico", 5, "PittBull")
    };

    for(Hewan h : daftarHewan) {
        h.tampilInfo();
        h.suara();

        if(h instanceof Terbang) {
            Terbang t = (Terbang) h;
            t.terbang();
        }

        System.out.println("-------------------------");
    }
}

}