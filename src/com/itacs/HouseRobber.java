package com.itacs;

/**
 * @author Ali al-kheder
 * @computer alkhd
 */
public class HouseRobber {

    public static int robber(int[] houses) {

        int stoleMoney = 0;

        int houseLength = houses.length;

        if (houseLength == 0) {
            return 0;
        }
        if (houseLength == 1) {
            stoleMoney = houses[0];
            return stoleMoney;
        }
        //{1,2,3,4,5,6,7}      16
        for (int i = 2; i < houseLength; i++) {
            houses[i] = max(houses[i] + houses[i - 2], houses[i - 1]);
            stoleMoney = houses[houseLength - 1];
        }

        return stoleMoney;
    }


    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }


}
