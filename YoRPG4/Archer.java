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
return "Archers shoot arrows from bows. They use long-range attacks. Archers are able to avoid attacks from monsters because of the long-range combat";
}

public void regenerate() {
life = 2000;
defense = 50;
attack = 10;
strength = 100;
}

}
