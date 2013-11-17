//BY MIKA SARKIN JAIN
//BY MIKA SARKIN JAIN
public class Ninja extends Character{
public Ninja(String s){
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
return "Ninjas are quick and deadly.";
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