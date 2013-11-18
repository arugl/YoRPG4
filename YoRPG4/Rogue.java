//BY MIKA SARKIN JAIN
//BY MIKA SARKIN JAIN
public class Rogue extends Character{
public Rogue(){
name = "Rogue";
life = 1300;
defense = 20;
attack = 5;
strength = (int)(Math.random()*45 + 50);
}

public String getName(){
return name;
}

public void specialize(){}

public void normalize(){}

public static String about(){
return "Rogues fight with daggers. They are nimble and fast. More challenging than the average Monster.";
}

public void regenerate() {
life = 1300;
defense = 20;
attack = 5;
strength = (int)(Math.random()*45 + 50);
}

}
