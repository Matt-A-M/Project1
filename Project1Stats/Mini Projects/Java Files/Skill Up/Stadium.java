public class Stadium
{
    public void battle(Pokemon p1, Pokemon p2){
        // normally checks speed first

        while(p1.getHp() > 0 && p2.getHp() > 0){
            if(p1.getSpeed() > p2.getSpeed()){
                p2.setHp(p2.getHp() - (p1.getAttack() - p2.getDefense()));
            }
            if( p1.getSpeed() < p2.getSpeed()) {
                p1.setHp(p1.getHp() - (p2.getAttack() - p1.getDefense()));
            }
            if(p1.getHp() <= 0){
                System.out.print("Pikachu won!");
            }
            if(p2.getHp() <= 0){
                System.out.print("Charmander won!");
            }
        }

        // p1 attacks p2
        // p2 attacks p1

    }
}