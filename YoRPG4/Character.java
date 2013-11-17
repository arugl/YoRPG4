//BY MIKA SARKIN JAIN
//BY MIKA SARKIN JAIN
public abstract class Character{
protected String name;
protected int life;
protected int strength;
protected int defense;
protected double attack;

public boolean isAlive(){
return life > 0;}

public int getDefense(){
return defense;
}

public void lowerHP(int n){
life -= n;
}

public int attack(Character c){
int damage = (int)((strength * attack) - c.getDefense());
c.life -= damage;
return damage;
}

public void specialize(){
defense -= 5;
attack += 5;
}

public void normalize(){
defense = 10;
attack = 10;
}

public abstract void regenerate(); 

public int superAttack(Character c){
int damage = (int)(2*(strength * attack) - c.getDefense());
c.life -= damage;
return damage;
}

}
//BY MIKA SARKIN JAIN
//BY MIKA SARKIN JAIN