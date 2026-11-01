abstract class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }

    abstract void suara();

    void makan() {
        System.out.println(nama + " sedang makan");
    }   
}

class Kucing extends Hewan {
    Kucing(String nama) {
        super(nama);
    }

    @Override 
    void suara() {
        System.out.println(nama + " sedang mengeong : Meow!");
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


public class percobaan1 {
    public static void main(String [] args) {
        Kucing k = new Kucing("Milo");
        Anjing a = new Anjing("Buddy");

    k.makan();
    k.suara();

    a.suara();
    a.makan();
    }

    
}