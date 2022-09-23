public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Medic medic = new Medic();
        Magic magic = new Magic();
        Hero[] heroes = {warrior, medic, magic};
        medic.setHealPoints(200);
        for (int i = 0; i < heroes.length; i++) {
            if(heroes[i] instanceof Medic){
                ((Medic) heroes[i]).increaseExperience();
            }
            heroes[i].applySuperAbility();
        }
    }
}