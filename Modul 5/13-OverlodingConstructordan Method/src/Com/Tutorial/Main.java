package Com.Tutorial;

public class Main {
    public static void main(String[] args) {
        // Membuat objek
        Player player1 = new Player("senku"); 
        Player player2 = new Player(); 
        Player player3 = new Player(); 
        Player player4 = new Player("naruto"); 

        
        player1.cetak();
        player2.cetak();
        player3.cetak();
        player4.cetak();
    }
}