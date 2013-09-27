package fr.iutvalence.java.mp.p3;

import java.util.Scanner;

// TODO FIXED detail comment (what is a movement?)
/**
 * This class provides interactions with a movement (a horizontal direction : LEFT/RIGHT/FIXED) from the player
 * @author maliel
 *
 */
public class Player
{
    
    // TODO FIXED (think about it) should it be really contained in this class?
    /**
     * Current player username.
     */
    private String playerUsername;
     
    /**
     * Constructor for a define player
     * @param userName chosen by the user
     */
    public Player(String userName)
    {
        this.playerUsername = userName;
    }
    
    /**
     * this function provides to get a direction enter by the user keyboard
     * 4 for a left movement, 6 for a right movement
     * if other values, the function return FIXED (= no movement)
     * @return a direction
     */
    public Direction getDirection()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char carac = str.charAt(0);
        switch (carac)
        {
            case '4' :
                return Direction.LEFT;
            case '6' :
                return Direction.RIGHT;
            default :
                return Direction.FIXED;
        }
        
    }
    //TODO create function to get player movement (FIXE/LEFT/RIGHT)
}
