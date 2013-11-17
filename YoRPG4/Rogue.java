//BY MIKA SARKIN JAIN
//BY MIKA SARKIN JAIN
public class Rogue extends Character{
public Rogue(){
name = "Rogue";
life = 150;
defense = 20;
attack = 1;
strength = (int)(Math.random()*45 + 20);
}

public String getName(){
return name;
}

public void specialize(){}

public void normalize(){}

public static String about(){
return "Rogues steal things.";
}

public void regenerate() {
life = 150;
defense = 20;
attack = 1;
strength = (int)(Math.random()*45 + 20);
}

}
//BY MIKA SARKIN JAIN
//BY MIKA SARKIN JAIN