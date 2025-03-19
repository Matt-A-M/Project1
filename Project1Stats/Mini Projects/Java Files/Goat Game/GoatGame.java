import java.util.Random;


public class GoatGame {
// check notebook for conditions 
	Random rand = new Random();
	String[] choices = new String[3];
	double firstChoiceWinCount = 0;
	double firstChoiceLoseCount = 0;

	double winCount = 0;
	double loseCount = 0;

//sets up String array of choices example: [fail, win, win]
	public String[] createGame(String[] c) {
		for(int k = 0; k < 3; k++) {
			choices[k] = "Fail";
		}
		choices[rand.nextInt(3)] = "Win";
		return choices;
	}
//runs through game 10000 times and returns percentage value of wins
	public double runGame() {
		int i = 0;
		while(i < 10000) {
			createGame(choices);
			String firstChoice = choices[rand.nextInt(0, 2)];
//firstChoice win/loss are possible specs if one wanted to see 
// if a person who lost would've won on the first turn or vice versa
			if(firstChoice.equals("Win")) {
				firstChoiceWinCount++;
			}else {
				firstChoiceLoseCount++;
			}
//Creates new array to remove one fail option;
			String[] newChoice = new String[choices.length - 1];
			for(int j = 0; j < 2; j++) {
				newChoice[j] = choices[rand.nextInt(0, 2)];
				}
			if(newChoice[0].equals("Fail") && newChoice[1].equals("Fail")) {
				newChoice[rand.nextInt(0, 1)] = "Win";
			String finalChoice = newChoice[rand.nextInt(2)];
			if(finalChoice.equals("Win")) {
				winCount++;
			} else {
				loseCount++;
				}
				i++;
				}
		}
		return((winCount/10000) * 100);
		
}
}
		
	
		

	

