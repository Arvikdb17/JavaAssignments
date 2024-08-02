package Inheritance;

public class WizardsAndWarriors {
    class Fighter {

        boolean isVulnerable() {
            return true;
        }

        int getDamagePoints(Fighter fighter) {
            return 10;
        }

    }

    // TODO: define the Warrior class
    class Warrior extends Fighter{
        public String toString(){
            return "Fighter is a Warrior";
        }
        boolean isVulnerable(){
            return false;
        }
        int getDamagePoints(Fighter fighter) {
            if(fighter.isVulnerable()){
                return 10;
            }
            return 6;
        }
    }
    // TODO: define the Wizard class
    class Wizard extends Fighter{
        boolean spell = false;
        public String toString(){
            return "Fighter is a Wizard";
        }
        public void prepareSpell(){
            spell  = true;
        }
        boolean isVulnerable(){
            if(spell) return false;
            return true;
        }
        int getDamagePoints(Fighter f){
            if(spell) return 12;
            return 3;
        }

    }
}
