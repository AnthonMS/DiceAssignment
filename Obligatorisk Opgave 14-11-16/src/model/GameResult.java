/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Anthon
 * Kommentar:
 * Jeg har valgt at lave 2 int variabler til at holde pointsummen af huse og spilleren.
 * Og så har jeg lavet 2 int variabler til at holde navnet af huset og spilleren.
 * Og så har jeg bare lavet en constructor som skal sendes med navn og pointsum.
 * Og så sender den en streng tilbage via toString metoden.
 */
public class GameResult
{

    private int playerResult;
    private int houseResult;
    private String playerName;
    private String houseName;

    public GameResult(int pResult, int hResult, String pName, String hName)
    {
        playerResult = pResult;
        houseResult = hResult;
        playerName = pName;
        houseName = hName;
    }

    @Override
    public String toString()
    {
        return "Game Result:"
                + "\n" + playerName + ": " + playerResult
                + "\n" + houseName + ": " + houseResult;
    }

}
