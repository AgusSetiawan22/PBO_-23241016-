 class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        Karyawan kar = new Karyawan(); Manusia mns; 
        mns = mhs;
        mns.setNama("Steven tampaan");
        System.out.println(mns.getNama());
        mns = kar;
        mns.setNama("siwee");
        System.out.println(mns.getNama());
    }
 }

