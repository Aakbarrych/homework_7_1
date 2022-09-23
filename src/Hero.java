public abstract class Hero implements HavingSuperAbility{
    private int health;
    private int damage;
    private String typeOfSuperPower;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeOfSuperPower() {
        return typeOfSuperPower;
    }

    public void setTypeOfSuperPower(String typeOfSuperPower) {
        this.typeOfSuperPower = typeOfSuperPower;
    }
}