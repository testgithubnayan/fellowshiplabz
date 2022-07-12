
public class SnakeAndLadder {
	
    public static final int NO_PlAY = 1;
    public static final int LADDER = 2;
    public static final int SNAKE = 3;
    public static final int START_POSITION = 0;
    public static final int WIN = 100;

	public static void main(String[] args) {
		
	int diceRollCount = 0;
        int playerPosition1 = 0;
        int playerPosition2 = 0;
        
        while ((playerPosition1 <= 100) && (playerPosition2 <= 100)) {
        	
            int ROLL_THE_DICE1 = (int) (Math.floor(Math.random() * 10) % 6) + 1;
            int ROLL_THE_DICE2 = (int) (Math.floor(Math.random() * 10) % 6) + 1;
            System.out.println("After rolling the dice we get:" + ROLL_THE_DICE1);
            
            int playerCheck1 = (int) (Math.floor(Math.random() * 10) % 3) + 1;
            int playerCheck2 = (int) (Math.floor(Math.random() * 10) % 3) + 1;
            System.out.println("playerCheck:" + playerCheck1);
            diceRollCount++;
            
            switch (playerCheck1) {
            
                case NO_PlAY:
                    System.out.println("The player stay in the same position that is:" + playerPosition1);
                    break;
                    
                case LADDER:
                    playerPosition1 = playerPosition1 + ROLL_THE_DICE1;
                    if (playerPosition1 <= WIN) {
                        playerPosition1 = playerPosition1 + ROLL_THE_DICE1;
                        System.out.println("The player moves ahead by the:" + ROLL_THE_DICE1);
                    }
                    break;
                    
                case SNAKE:
                    playerPosition1 = playerPosition1 - ROLL_THE_DICE1;
                    if (playerPosition1 < 0) {
                        System.out.println("The player got bitten by snake and player restart from " + START_POSITION);
                    }
                    break;
                    
                default:
                    System.out.println("Something went wrong");
            }
            
            switch (playerCheck2) {
            
                case NO_PlAY:
                    System.out.println("The player stay in the same position that is:" + playerPosition1);
                    break;
                    
                case LADDER:
                    playerPosition2 = playerPosition2 + ROLL_THE_DICE2;
                    if (playerPosition2 <= WIN) {
                        playerPosition2 = playerPosition2 + ROLL_THE_DICE2;
                        System.out.println("The player moves ahead by the:" + ROLL_THE_DICE2);
                    }
                    break;
                    
                case SNAKE:
                    playerPosition2 = playerPosition2 - ROLL_THE_DICE1;
                    if (playerPosition2 < 0) {
                        System.out.println("The player got bitten by snake and player restart from " + START_POSITION);
                    }
                    break;
                    
                default:
                    System.out.println("Something went wrong");
            }
        }
        System.out.println("Final position of player1 is " + playerPosition1);
        System.out.println("Final position of player2 is " + playerPosition2);
        System.out.println( "Total number of time dice was played to win the game is " +diceRollCount);
        
        if(playerPosition1 > playerPosition2){
            System.out.println("Player1 win the game");
        }
        else
        {
            System.out.println("Player2 win the game");
        }

    }

}
