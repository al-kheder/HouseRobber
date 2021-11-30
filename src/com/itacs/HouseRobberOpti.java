package com.itacs;

/**
 * @author Ali al-kheder
 * @computer alkhd
 */

public class HouseRobberOpti {

    public static int robber(int houses[]) {
        int exclusive = 0;
        int inclusive = houses[0];
        for (int i = 1; i < houses.length; i++) {
            int temp = inclusive;
            inclusive = max(exclusive + houses[i], inclusive);
            exclusive = temp;
        }
        return inclusive;
    }


    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }

}
