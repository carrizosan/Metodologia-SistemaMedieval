import decorators.DA_Defense;
import decorators.IC_Defense;
import factories.WarriorFactory;
import models.Character;
import strategies.attack.AttackNone;
import strategies.defense.DefenseShield;
import strategies.move.MoveWalk;

public class Main {

    public static void main(String[] args) {
        try {
//            Character warrior = new Warrior("Lucia", new MoveWalk(), new AttackNone(), new DefenseShield()); //SIN FACTORY
            WarriorFactory warriorFactory = new WarriorFactory();
            Character warrior = warriorFactory.createCharacter("Lucia", new MoveWalk(), new AttackNone(), new DefenseShield()); //CON FACTORY

            System.out.println(warrior);
            System.out.println(warrior.attack());
            System.out.println(warrior.defense());
            System.out.println(warrior.move());
            System.out.println(warrior.train());

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.getMessage();
            }

            warrior = new IC_Defense(warrior);
            System.out.println(warrior.defense());

            warrior = new DA_Defense(warrior);
            System.out.println(warrior.defense());

            warrior = warrior.getCharacter();

            System.out.println(warrior.defense());


           /*try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.getMessage();
            }

            warrior.setAttack(new AttackArch());
            System.out.println(warrior.attack());

            warrior.setMove(new MoveRun());
            System.out.println(warrior.move());

            warrior = new Laser_Attack(warrior);
            System.out.println(warrior.attack());
            */


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
