package com.tutorial;

import com.terminal.console;

//
//
 class Player {
    private String nama;

    Player (String nama){
        this.nama = nama;
    }
    void cetak(){
        System.out.println("Player nama : " + this.nama);

        console.log("Starting eleven");
        console.log("Player name : " + this.nama);
    }

}


