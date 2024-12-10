package Com.Tutorial;

class Player {
    private String name;

    // Constructor dengan parameter
    public Player(String name) {
        this.name = name;
    }

    // Constructor default
    public Player() {
        this.name = "usup"; // Atau bisa diisi dengan nilai default lainnya
    }

    // Method untuk mencetak nama player
    public void cetak() {
        System.out.println("Player name: " + name);
    }
}