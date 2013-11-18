//BY MIKA SARKIN JAIN
//BY MIKA SARKIN JAIN
public class Mage extends Character{
public Mage(String s){
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
return "The mage uses magic unlike the other characters who physically attack others. Their special power is to regain hp during battle.";
}

//METHODS
//prepares Mage for special power during the round, to regain some hp if hp is low
public void specialize(){
	life = life + 300;
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
