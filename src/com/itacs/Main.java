package com.itacs;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

     // System.out.println(HouseRobber.robber( TextReader.readFile("data.txt")));

   //    System.out.println(HouseRobber.robber(new int[]{20,70,90,3,1}));

        int [] firstTestData={100,200,300,100};       //400
        int [] secondTestData={20,70,90,3,1};         //111
        int [] thirdTestData={1,2,3,4,5,6,7};          // 16

        int [] dataFromText = TextReader.readFile("data.txt");

        System.out.println(HouseRobberOpti.robber(dataFromText));  //400

       // System.out.println(HouseRobberOpti.robber(new int[]{30,10,10,100,10,10,10}));

    }
}
