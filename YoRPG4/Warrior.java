//BY MIKA SARKIN JAIN
//BY MIKA SARKIN JAIN
public class Warrior extends Character{
public Warrior(String s){
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
return "Warriors battle.";
}

//                METHODS
    //prepares Warrior to perform a special attack: up the _attck at expense of _def
public void specialize(){
defense -= 5;
attack += 2;
    }
//prepares Warrior to perform a normal attack: set default _attck and _def
public void normalize(){
defense = 10;
attack = 10;
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
