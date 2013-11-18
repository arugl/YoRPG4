//BY MIKA SARKIN JAIN
//BY MIKA SARKIN JAIN
public class Hero extends Character{
public Hero(String s){
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
return "Heroes dedicate their lives to fight evil. If you are a morally driven person, you will want to be a hero. :)";
}

//METHODS
//specialize: gives our hero a titanium weapon permanently 
public void specialize(){
strength = 200;
}

public void normalize(){
}

public void regenerate() {
life = 2000;
defense = 10;
attack = 10;
strength = 100;
}

}
