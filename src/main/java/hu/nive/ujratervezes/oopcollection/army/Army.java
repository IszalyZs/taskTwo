package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<MilitaryUnit> militaryUnits = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        militaryUnits.add(militaryUnit);
    }

    public void damageAll(int damage) {
        for (int i = 0; i < militaryUnits.size(); i++) {
            militaryUnits.get(i).sufferDamage(damage);
            if (militaryUnits.get(i).getHitPoints() < 25) {
                militaryUnits.remove(i);
                i++;
            }
        }
    }

    public int getArmyDamage() {
        int sumDamage = 0;
        for (MilitaryUnit unit : militaryUnits) {
            sumDamage += unit.doDamage();
        }
        return sumDamage;
    }

    public int getArmySize() {
        return militaryUnits.size();

    }
}