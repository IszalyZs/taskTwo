package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    private int hitPoints;
    private int damage;
    private boolean isArmor;
    private boolean isShield=true;


    public MilitaryUnit(int hitPoints, int damage, boolean isArmor) {
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.isArmor = isArmor;

    }

    public int doDamage() {
        return this.damage;
    }

    public void sufferDamage(int damage) {
        if (isShield == true && this.getClass().getSimpleName().equals("Swordsman")) {
            isShield = false;
        } else if (isArmor) {
            this.hitPoints -= damage / 2;
        } else this.hitPoints -= damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
