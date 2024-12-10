package Com.Tutorial;

// Kelas Dasar
class Hewan {
    String nama;

    // Konstruktor
    public Hewan(String nama) {
        this.nama = nama;
    }

    // Metode untuk suara hewan
    public String suara() {
        return "Suara hewan";
    }
}

// Kelas Turunan Kucing
class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama); // Memanggil konstruktor kelas dasar
    }

    @Override
    public String suara() {
        return "nurfitalia";
    }
}

// Kelas Turunan Anjing
class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama); // Memanggil konstruktor kelas dasar
    }

    @Override
    public String suara() {
        return "rizal";
    }
}

// Kelas Utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("m.afrizal");
        Anjing anjing = new Anjing("rizal");

        System.out.println(kucing.nama + " berkata: " + kucing.suara());
        System.out.println(anjing.nama + " berkata: " + anjing.suara());
    }
}