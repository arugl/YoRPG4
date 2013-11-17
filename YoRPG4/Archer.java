//BY MIKA SARKIN JAIN
//BY MIKA SARKIN JAIN
public class Archer extends Character{
public Archer(String s){
name = s;
life = 2000;
defense = 10;
attack = 10;
strength = 100;
}

public String getName(){
return name;
}

public static String about(){
return "Archers shoot arrows from bows.";
}

public void regenerate() {
life = 2000;
defense = 10;
attack = 10;
strength = 100;
}

}
//BY MIKA SARKIN JAIN
//BY MIKA SARKIN JAIN