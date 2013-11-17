//BY MIKA SARKIN JAIN
//BY MIKA SARKIN JAIN
public class Monster extends Character{
public Monster(){
name = "Monster";
life = 300;
defense = 40;
attack = 2;
strength = (int)(Math.random()*90 + 40);
}

public String getName(){
return name;
}

public void specialize(){}

public void normalize(){}

public static String about(){
return "Monsters are mean.";
}

public void regenerate() {
life = 300;
defense = 40;
attack = 2;
strength = (int)(Math.random()*90 + 40);
}
}
//BY MIKA SARKIN JAIN
//BY MIKA SARKIN JAIN