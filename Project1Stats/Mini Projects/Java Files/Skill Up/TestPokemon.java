public class TestPokemon
{
    public static void main(String args[]){
        Charmander charmanderSteve = new Charmander();
        
        charmanderSteve.getHp();
        
        Stadium tester = new Stadium();
        
        Pikachu ummhmm = new Pikachu();
        
        tester.battle(charmanderSteve, ummhmm);
        
    }
}