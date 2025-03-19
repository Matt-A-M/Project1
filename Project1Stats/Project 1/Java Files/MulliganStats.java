import java.util.ArrayList;
public class MulliganStats{
    public static double percent(int amountOfPokemon){
        SteelEnergy steelEnergy = new SteelEnergy();
        Genesect genesect = new Genesect();
        int mulliganCounter = 0;
       for(int i = 0; i <= 10000; i++){
        ArrayList<PokemonCard> deck1 = new ArrayList();
           for( int k = 0; k < amountOfPokemon; k++) {
           deck1.add(genesect);
        }
           if(deck1.size() < 60){
           for(int j = deck1.size();j < 60;j++ ){
            deck1.add(steelEnergy);
        }
        }
        ArrayList<PokemonCard> deck2 = new ArrayList();
           for( int k = 0; k < amountOfPokemon; k++) {
           deck2.add(genesect);
        }
           if(deck2.size() < 60){
           for(int j = deck2.size();j < 60;j++ ){
            deck2.add(steelEnergy);
        }
        }
           Player player1 = new Player(deck1);
           Player player2 = new Player(deck2);
           PokemonGame game = new PokemonGame(player1, player2);
           game.startGame();
           if(!player1.containsPokemon()){
           mulliganCounter++;
        }
       
    }
    return (mulliganCounter/10000) * 100;
}
public double candyPercent(int amountOfCandy){
    SteelEnergy steelEnergy = new SteelEnergy();
    Genesect genesect = new Genesect();
    RareCandy rarecandy = new RareCandy();
    int candyCounter = 0;
      for(int i = 0; i <= 10000; i++){
        ArrayList<PokemonCard> deck1 = new ArrayList();
        for( int k = 0; k < amountOfCandy; k++) {
           deck1.add(rarecandy);
           }
        for(int l = 0; l < 20; l++){
           deck1.add(genesect);
           }
        if(deck1.size() < 60){
    
            for(int j = deck1.size();j < 60;j++ ){
            deck1.add(steelEnergy);
           }
           }
        ArrayList<PokemonCard> deck2 = new ArrayList();
           for( int k = 0; k < 60; k++) {
           deck2.add(genesect);
        }
           if(deck2.size() < 60){
           for(int j = deck2.size();j < 60;j++ ){
            deck2.add(steelEnergy);
        }
        }
        Player player1 = new Player(deck1);
        Player player2 = new Player(deck2);
        do{
            PokemonGame game = new PokemonGame(player1, player2);
            game.stopGame();
            game.startGame();
        }while(!player1.containsPokemon());
        if(player1.containsCandy(amountOfCandy)){
            candyCounter++;
        }
       
   }
   return (candyCounter/10000) * 100;
}
public static void main(String args[]){
    for(int i = 1; i < 61; i++){
        //for candy counter change 61 to 5, change method to candy method
        System.out.printf("%.2f", percent(i));
        System.out.println("");
    }
}
}



