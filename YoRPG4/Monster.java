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
return "Monsters are mean. They mainly live in the depths of the forest, but also in caves, underground, etc..basically everywhere.. Relatively easy to kill.";
}

public void regenerate() {
life = 300;
defense = 40;
attack = 2;
strength = (int)(Math.random()*90 + 40);
}
}
