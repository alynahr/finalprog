package com.mycompany.reward;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class pointDisplay extends rewardCenter {
    private int points;

    public pointDisplay(int initialPoints) {
        this.points = initialPoints;
    }

    public int getPoints() {
        return points;
    }

    public void decreasePoints(int amount) {
        if (points >= amount) {
            points -= amount;
        } else {
            System.out.println("Not enough points to redeem this reward.");
        }
    }
}
