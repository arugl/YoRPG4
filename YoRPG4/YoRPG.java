/*=============================================
  class YoRPG -- Driver file for Ye Olde Role Playing Game.
  Simulates monster encounters of a wandering adventurer.
  Required classes: Warrior, Monster
  =============================================*/

import java.io.*;
import java.util.*;

public class YoRPG {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    //change this constant to set number of encounters in a game
    public final static int MAX_ENCOUNTERS = 5;

    private String evilType;
    private String goodType;
    //each round, a Warrior and a Monster will be instantiated
    private Character pat;   //Is it man or woman?
    private Character smaug;

    private int moveCount;
    private boolean gameOver;
    private int difficulty;

    private InputStreamReader isr;
    private BufferedReader in;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    //BY MIKA SARKIN JAIN
    //BY MIKA SARKIN JAIN
    public YoRPG() {
    double n = Math.random()*5;
    if (n<1) {goodType = "warrior"; pat = new Warrior("X");}
    else if (n<2) {goodType = "hero"; pat = new Hero("X");}
    else if (n<3) {goodType = "ninja"; pat = new Ninja("X");}
    else if (n<4) {goodType = "archer"; pat = new Archer("X");}
    else {goodType = "mage"; pat = new Mage("X");}
    //BY MIKA SARKIN JAIN
    //BY MIKA SARKIN JAIN
    if (Math.random()<.5){evilType = "monster";}
    else {evilType = "rogue";}
   	//BY MIKA SARKIN JAIN
    //BY MIKA SARKIN JAIN

	moveCount = 0;
	gameOver = false;
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	newGame();
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

    /*=============================================
      void newGame() -- facilitates info gathering to begin a new game
      pre:  
      post: according to user input, modifies instance var for difficulty 
      and instantiates a Warrior
      =============================================*/
    public void newGame() {

	String s;
	String name = "";
	s = "Welcome to Ye Olde RPG!\n ";
	
	// create goodTypes
	Warrior w = new Warrior("X");
	Mage mage = new Mage("X");
	Hero hero = new Hero("X");
	Archer archer = new Archer("X");
	Ninja ninja = new Ninja("X");
	
	//create evilTypes
	Monster mon = new Monster();
	Rogue rogue = new Rogue();
	
	System.out.println(s + "\n" + "Player options : ");
	System.out.println(" 1 : " + w.about()); // prints warrior info
	System.out.println(" 2 : " + mage.about()); // prints mage info
       	System.out.println(" 3 : " + hero.about()); // prints hero info
      	System.out.println(" 4 : " + archer.about()); //prints archer info
	System.out.println(" 5 : " + ninja.about() + "\n  Let's begin your journey brave adventurer! \n"); //prints ninja info

       	s = "";
	s+= "\n Who will you be? \n";
	s+= "\t1: Warrior\n";
	s+= "\t2: Mage\n";
	s+= "\t3: Hero\n";
	s+= "\t4: Archer\n";
	s+= "\t5: Ninja\n";
	System.out.print (s);
	try {
	    type = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }

	if (type == 1) goodType = "warrior";
	else if (type == 2) goodType = "mage";
	else if (type == 3) goodType = "hero";
	else if (type == 4) goodType = "archer";
	else goodType = "ninja";

	s = "";
	s += "\nChoose your difficulty: \n";
	s += "\t1: Easy\n";
	s += "\t2: Not so easy\n";
	s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
	s += "Selection: ";
	System.out.print( s );

	try {
	    difficulty = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }

	s = "Intrepid " + goodType + ", what doth thy call thyself? (State your name): ";
	System.out.print( s );

	try {
	    name = in.readLine();
	}
	catch ( IOException e ) { }


	//instantiate the player's character
	if (goodType.equals("warrior")){pat = new Warrior(name);}
	else if (goodType.equals("mage")){pat = new Mage(name);}
	else if (goodType.equals("hero")){pat = new Hero(name);}
	else if (goodType.equals("archer")){pat = new Archer(name);}
	else if (goodType.equals("ninja")){pat = new Ninja(name);}

	
	s = "";
	s += "\nYOU: " + goodType;
	System.out.println("\n" + "Opponents you may encounter : ");
	System.out.println("1 : " + mon.about()); // prints monster info
	System.out.println("2 : "  + rogue.about()); // prints rogue info
	
	s += "\nYOUR NEXT WILL BE OPPONENT...   " + evilType + "\n";
	System.out.println (s);
    }//end newGame()


    /*=============================================
      boolean playTurn -- simulates a round of combat
      pre:  Warrior pat has been initialized
      post: Returns true if player wins (monster dies).
            Returns false if monster wins (player dies).
      =============================================*/
    public boolean playTurn() {

	int i = 1;
	int d1, d2;

	if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "Nothing to see here. Move along!" );

	else {
	    System.out.println( "Lo, yonder " + evilType + " approacheth!" );
	    
	    //BY MIKA SARKIN JAIN
        //BY MIKA SARKIN JAIN
	    if (evilType.equals("monster")){
	    smaug = new Monster();}
	    else {smaug = new Rogue();}
	    //BY MIKA SARKIN JAIN
        //BY MIKA SARKIN JAIN

	    while( smaug.isAlive() && pat.isAlive() ) {

		// Give user the option of using a special attack:
		// If you land a hit, you incur greater damage,
		// ...but if you get hit, you take more damage.
		try {
		    System.out.println( "Do you feel lucky?" );
		    System.out.println( "\t1: Nay.\n\t2: Aye!" );
		    i = Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }

		if ( i == 2 )
		    pat.specialize();
		else
		    pat.normalize();

		d1 = pat.attack( smaug );
		d2 = smaug.attack( pat );

		System.out.println("You dealt " + d1 +
				    " points of damage.");

		System.out.println( "Ye Olde " + evilType + " hit back for " + d2 +
				    " points of damage.");
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
		System.out.println( "'Twas an epic battle, to be sure... " + 
				    "You cut ye olde " + evilType + " down, but " +
				    "with its dying breath ye olde " + evilType + ". " +
				    "laid a fatal blow upon thy skull." );
		return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
	    //BY MIKA SARKIN JAIN
        //BY MIKA SARKIN JAIN
		System.out.println( "HuzzaaH! Ye olde " + evilType + " hath been slain!" );
		return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
		System.out.println( "Ye olde self hath expired. You got dead." );
		return false;
	    }
	}//end else

	return true;
    }//end playTurn()
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    public static void main( String[] args ) {


	//loading...
	YoRPG game = new YoRPG();

	int encounters = 0;

	while( encounters < MAX_ENCOUNTERS ) {
	    if ( !game.playTurn() )
		break;
	    encounters++;
	    System.out.println();
	}

	System.out.println( "Thy game doth be over." );

    }//end main

}//end class YoRPG




/*=============================================
  =============================================*/
