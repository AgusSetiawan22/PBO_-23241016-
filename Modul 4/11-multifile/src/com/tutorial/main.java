package com.tutorial;

//keyword import untuk pqanggil package eksternal

import com.terminal.console;

public class main {
    public static void main(String[] args){
        Player player1 = new Player ("ultraman Tiga (irza)");
        Player player2 = new Player ("ultraman mebius (Rian)");
        Player player3 = new Player ("Raksasa halilintar (hakki)");
        Player player4 = new Player ("ultraman Dyna (Ishmat)");

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        console.log("Episode 1 (melawan raksasa Halilintar)");
    }
      
} 

    



