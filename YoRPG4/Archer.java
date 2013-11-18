public class Archer extends Character{
public Archer(String s){
name = s;
life = 2000;
defense = 50;
attack = 10;
strength = 100;
}

public String getName(){
return name;
}

public static String about(){
return "Archers shoot arrows from bows. They use long-range attacks. Archers are able to avoid attacks from monsters because of the long-range combat. Their special power is to use their crossbow for increased damage.";
}
//METHODS
//prepares Archer for special power during the round, use crossbow for more damage
public void specialize(){
  strength = 120;
}

// prepares Archer for normal hit
public void normalize(){
  strength = 100; 
}

public void regenerate() {
life = 2000;
defense = 50;
attack = 10;
strength = 100;
}

}
