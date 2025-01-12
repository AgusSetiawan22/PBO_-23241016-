package Com.Tutorial;

class NonMember extends Member {

    NonMember(String nama) {
        super(nama); 
    }

    public double hitungDiskon(double totalBelanja) {
        if (totalBelanja > 100_000) {
            return totalBelanja * 0.03; 
        }
        return 0;
    }

    void NonMember(){
        System.out.println("ini adalah non member");
    }
}