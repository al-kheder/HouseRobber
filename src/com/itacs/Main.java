package com.itacs;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(HouseRobber.robber( TextReader.readFile("data.txt")));

//        System.out.println(HouseRobber.robber(new int[]{20,70,90,3,1}));

//        System.out.println(HouseRobber.robber(new int[]{1,2,3,4,5,6,7}));

//         System.out.println(HouseRobber.robber(new int[]{100}));

    }
}
