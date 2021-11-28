package com.itacs;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Ali al-kheder
 * @computer alkhd
 */
class HouseRobberTest {

    HouseRobber houseRobber = new HouseRobber();
/*
    @BeforeEach
    void setUp() {
        houseRobber= new HouseRobber();
    }
*/

    @Test
    void testhouseRobber() {
        assertEquals(400, houseRobber.robber(new int[]{100, 200, 300, 100}));

        assertEquals(111, houseRobber.robber(new int[]{20, 70, 90, 3, 1}));

        assertEquals(16, houseRobber.robber(new int[]{1, 2, 3, 4, 5, 6, 7}));

        // assertEquals(22,houseRobber.robber(new int[]{100,200,300,100}),"Test against wrong value");
    }


}