import static java.util.Collections.shuffle;
public class PokemonGame{
    private Player player1;
    private Player player2;
    public PokemonGame(Player player1,Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public void startGame(){
        if(player1.getDeck().size() != 60){
            throw new RuntimeException("Player 1 needs 60 cards");
        }
         if(player2.getDeck().size() != 60){
            throw new RuntimeException("Player 2 needs 60 cards");
        }
        shuffle(player1.getDeck());
        shuffle(player2.getDeck());
        fillHand(player1);
        fillHand(player2);
        fillPrize(player1);
        fillPrize(player2);
        
    }
    
    public void stopGame(){
        player1.getDeck().addAll(player1.getHand());
        player1.getHand().clear();
        player1.getDeck().addAll(player1.getPrizePile());
        player1.getPrizePile().clear();
        player2.getDeck().addAll(player2.getHand());
        player2.getHand().clear();
        player2.getDeck().addAll(player2.getPrizePile());
        player2.getPrizePile().clear();
    }
    
    public void drawGame(){
        
    }
    
    public void fillHand(Player playerYOU){
        for(int i = 0; i < 7; i++){
            playerYOU.getHand().add(playerYOU.getDeck().getFirst());
            playerYOU.getDeck().removeFirst();
        }
    }
    
    public void fillPrize(Player playerYOU){
        for(int i = 0; i < 6; i++){
        playerYOU.getPrizePile().add(playerYOU.getDeck().getFirst());
        playerYOU.getDeck().removeFirst();
       }
    }
    public void mulligan(Player playerYOU){
        playerYOU.getDeck().addAll(playerYOU.getHand());
        playerYOU.getHand().clear();
        shuffle(playerYOU.getDeck());
        fillHand(playerYOU);
    }
}