/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Anthon
 */
public class Player
{
    private String playerName;
    private int point;
    
    public static Player player = new Player();
    public static Player house = new Player("The House", 0);
    
    public static Player getPlayer()
    {
        return player;
    }
    
    public static Player getHouse()
    {
        return house;
    }
    
//  ---------------Constructor---------------
    public Player(String playerName, int point)
    {
        this.playerName = playerName;
        this.point = point;
    }
    
    public Player()
    {
        playerName = "Dummy";
        point = 0;
    }
    
    //--------Getters & Setters----------------

    public String getPlayerName()
    {
        return playerName;
    }

    public int getPoint()
    {
        return point;
    }

    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }

    public void setPoint(int point)
    {
        this.point = point;
    }
    
    public void addPoint(int point)
    {
        this.point += point;
    }
    
    //----------Getters & Setters---------------
    
    
}
