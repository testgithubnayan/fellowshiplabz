
public class SnakeAndLadder {
	
    public static final int NO_PlAY = 1;
    public static final int LADDER = 2;
    public static final int SNAKE = 3;
    public static final int START_POSITION = 0;
    public static final int WIN = 100;

	public static void main(String[] args) {
		
	int playerPosition = 0;
        while (playerPosition <= WIN) {
        	
            int ROLL_THE_DICE = (int) (Math.floor(Math.random() * 10) % 6) + 1;
            System.out.println("After rolling the dice we get:" + ROLL_THE_DICE);
            
            int playerCheck = (int) (Math.floor(Math.random() * 10) % 3) + 1;
            System.out.println("playerCheck:" + playerCheck);

            switch (playerCheck) {
            
                case NO_PlAY:
                    System.out.println("The player stay in the same position that is:" + playerPosition);
                    break;
                    
                case LADDER:
                    playerPosition = playerPosition + ROLL_THE_DICE;
                    if (playerPosition <= WIN) {
                        System.out.println("The player moves ahead by the:" + ROLL_THE_DICE);
                    }
                    break;
                    
                case SNAKE:
                    playerPosition = playerPosition - ROLL_THE_DICE;
                    if (playerPosition < 0) {
                        System.out.println("The player got bitten by snake and player restart from " + START_POSITION);
                    }
                    break;
                    
                default:
                    System.out.println("Something went wrong");
            }
            System.out.println("The player position after rolling the dice is " + playerPosition);
        }
    }
}
