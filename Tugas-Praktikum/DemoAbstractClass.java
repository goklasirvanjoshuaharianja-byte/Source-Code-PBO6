abstract class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }

    abstract void suara();

    void makan() {
        System.out.println(nama + " sedang makan. ");
    }
}

class Kucing extends Hewan {
    Kucing(String nama) {
        super(nama);
    }

    @Override
    void suara() {
        System.out.println(nama + " sedang mengeong : Meow! ");
    }
}

class Anjing extends Hewan {
    Anjing(String nama) {
        super(nama);
    }

    @Override
    void suara() {
        System.out.println(nama + " sedang menggonggong : Woof!");
    }
}

public class DemoAbstractClass {
    public static void main(String [] args) {
        Kucing k = new Kucing("Caesar");
        Anjing a = new Anjing("Juan");

        k.suara();
        k.makan();

        a.suara();
        a.makan();
    }
}
