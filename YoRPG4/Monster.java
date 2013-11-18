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
return "Monsters are mean. The monster mainly lives in the depths of the forest, but can also be living in caves, underground, etc..basically everywhere.. Be ruthless and have no mercy when facing these evil creatures.";
}

public void regenerate() {
life = 300;
defense = 40;
attack = 2;
strength = (int)(Math.random()*90 + 40);
}
}
