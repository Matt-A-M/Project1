import java.util.ArrayList;
public class Player{
    ArrayList <PokemonCard> deck;
    ArrayList <PokemonCard> hand;
    ArrayList <PokemonCard> prizePile;
    ArrayList <PokemonCard> discardPile;
    ArrayList <PokemonCard> bench;
    private MonsterCard active;
    
    public Player(ArrayList <PokemonCard> deck){
        this.deck = deck;
        hand = new ArrayList();
        prizePile = new ArrayList();
        discardPile = new ArrayList();
        bench = new ArrayList();
    }
    
    public ArrayList getDeck(){
        return deck;
    }
    
    public ArrayList getHand(){
        return hand;
    }
    
    public ArrayList getPrizePile(){
        return prizePile;
    }
    
    public boolean containsCandy(int amountOfCandy){
        int candyCounter = 0;
        for(int i = 0; i < prizePile.size(); i++){
            if(hand.get(i) instanceof RareCandy){
                candyCounter++;
            }
        }
        return candyCounter == amountOfCandy;
    }
    //getters for discardpile and bench
    
    public boolean containsPokemon(){
        int pokemonCounter = 0;
        for(int i = 0; i < hand.size(); i++){
            if(hand.get(i) instanceof MonsterCard){
                pokemonCounter++;
            }
        }
        return pokemonCounter != 0;
    }
        
    }
    
