interface Terbang {
    public void terbang();
}

abstract class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }

    abstract void suara();

    void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

class Kucing extends Hewan {
    Kucing(String nama) {
        super(nama);
    }

    @Override
    void suara() {
        System.out.println(nama + " sedang mengeong. Meow!");
    }
}

class Burung extends Hewan implements Terbang {
    Burung(String nama) {
        super(nama);
    }

    @Override
    void suara() {
        System.out.println(nama + " sedang berkicau. Cuit!");
    }

    public void terbang() {
        System.out.println(nama + " terbang dengan mengepakkan sayap.");
    }
}

public class percobaan3 {
    public static void main(String [] args) {
        Kucing k = new Kucing("Caesar");
        Burung b = new Burung("Juan");

        k.suara();
        k.makan();

        b.suara();
        b.makan();
        b.terbang();
    }
}













































































































