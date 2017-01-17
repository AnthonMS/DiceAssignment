/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Random;

/**
 *
 * @author Anthon
 */
public class Die
{

    private int value;
    private int sides;

    public Die(int sides)
    {
        this.sides = sides;
        throwDie();
    }

    public void throwDie()
    {

        Random ran = new Random();
        value = ran.nextInt(sides) + 1;

//        if (sides == 6)
//        {
//            Random ran = new Random();
//            value = ran.nextInt(6) + 1;
//        } else
//            if (sides == 10)
//            {
//                Random ran = new Random();
//                value = ran.nextInt(10) + 1;
//            } else
//                if (sides == 12)
//                {
//                    Random ran = new Random();
//                    value = ran.nextInt(12) + 1;
//                } else
//                    if (sides == 24)
//                    {
//                        Random ran = new Random();
//                        value = ran.nextInt(24) + 1;
//                    } else
//                    {
//                        System.out.println("Error... \nThe Die must have 6, 10, 12 or 24 sides.");
//                    }

    }

    public int getValue()
    {
        return value;
    }

}
