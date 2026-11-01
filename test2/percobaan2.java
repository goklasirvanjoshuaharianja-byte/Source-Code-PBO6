interface Terbang {
   public void terbang();
}


class Burung implements Terbang {
    @Override

    public void terbang() {
        System.out.println("Burung terbang dengan mengepakkan sayap. ");
    }
}

class Pesawat implements Terbang {
    @Override
    
    public void terbang() {
        System.out.println("Pesawat terbang menggunakan mesin jet. ");
    }
}

public class percobaan2 {
    public static void main(String [] args) {
        Burung b = new Burung();
        Pesawat p = new Pesawat();

        b.terbang();
        p.terbang();
    }
}