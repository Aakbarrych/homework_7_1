public class Medic extends Hero{
    private int healPoints;


    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public void increaseExperience(){
        System.out.println(healPoints = healPoints + (healPoints / 100 * 10));
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность Heal");
    }
}

