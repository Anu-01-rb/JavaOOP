/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.files;

import java.io.Serializable;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author anu-fedora
 */
public class Computer implements Serializable {

    private int hand, playerHand, win, lose, draw, status;

    public Computer() {

    }

    private int choob() {
        return ThreadLocalRandom.current().nextInt(0, 3);
    }

    public int paoYingChoob(int playerHand) { //w:1 d:0 l:-1
        this.playerHand = playerHand;
        this.hand = choob();
        if (this.playerHand == this.hand) {
            draw++;
            status = 0;
            return 0;
        }
        else if (this.playerHand == 0 && this.hand == 1) {
            win++;
            status = 1;
            return 1;
        }
        else if (this.playerHand == 1 && this.hand == 2) {
            win++;
            status = 1;
            return 1;
        }
        else if (this.playerHand == 2 && this.hand == 0) {
            win++;
            status = 1;
            return 1;
        }

        lose++;
        status = -1;
        return -1;
    }

    public int getHand() {
        return hand;
    }

    public int getPlayerHand() {
        return playerHand;
    }

    public int getWin() {
        return win;
    }

    public int getLose() {
        return lose;
    }

    public int getDraw() {
        return draw;
    }

    public int getStatus() {
        return status;
    }

}
