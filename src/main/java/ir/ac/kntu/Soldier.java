package ir.ac.kntu;

public class Soldier {
    String name;
    int health;
    int attack;
    int attackRange;
    int fieldOfRange;
    boolean isImpulse;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }

    public int getFieldOfRange() {
        return fieldOfRange;
    }

    public void setFieldOfRange(int fieldOfRange) {
        this.fieldOfRange = fieldOfRange;
    }

    public boolean isImpulse() {
        return isImpulse;
    }

    public void setImpulse(boolean impulse) {
        isImpulse = impulse;
    }
}
