package com.mycompany.reward;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class rewardsRedemption extends pointDisplay {
    public class RewardsRedemption {
    private pointDisplay pointDisplay;

    public RewardsRedemption(pointDisplay pointDisplay) {
        this.pointDisplay = pointDisplay;
    }

    public void riceRedeemActionPerformed() {
        if (pointDisplay.redeemPoints(50)) {
            System.out.println("1kg of Rice redeemed. Remaining points: " + pointDisplay.getPoints());
        }
    }

    public void fiftyLoadActionPerformed() {
        if (pointDisplay.redeemPoints(25)) {
            System.out.println("P50 LOAD redeemed. Remaining points: " + pointDisplay.getPoints());
        }
    }

    public void thirtyLoadRedeemActionPerformed() {
        if (pointDisplay.redeemPoints(20)) {
            System.out.println("P30 LOAD redeemed. Remaining points: " + pointDisplay.getPoints());
        }
    }

    public void cashRedeemActionPerformed() {
        if (cashRedeem.equals(50) && pointDisplay.equals(pointDisplay)) {
            int (pointDisplay - 50);
            System.out.println("P100 IN CASH redeemed. Remaining points: " + pointDisplay.getPoints());
        }
    }
}
}
