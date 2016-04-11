import java.util.Scanner;

public class GuessingGame {
	

//The main routine
//----------------------------------------------------------------
	public static void main(String args[])
	{
		
	System.out.println("########################################");
	System.out.println("#Welcome to the guessing game          #");
	System.out.println("#Please choose the game difficulty      #");
	System.out.println("########################################");
	System.out.println("#1. Hard - 7 tries                     #");
	System.out.println("#2. Medium - 10 tries                  #");
	System.out.println("#3. Easy - 15 tries                    #");
	System.out.println("########################################");
	
	//Start the game.
	startGame();
	
	}
//----------------------------------------------------------------
	

//###Play the game### Subroutine #1
//----------------------------------------------------------------
static void playGame(int selectGame)
	{
	
	int game = selectGame;
	int tries = 0;
	int playersNumber;
	int computersNumber = 0;
	
	switch(game){
	case 1:
		System.out.println("You have selected game difficulty hard. If you want to cancel the game pres 0");
		tries = 7;
		computersNumber = ((int) (100 * Math.random()+1));
		break;
	case 2:
		System.out.println("You have selected game difficulty medium. If you want to cancel the game pres 0");
		tries = 10;
		computersNumber = ((int) (100 * Math.random()+1));
		break;
	case 3:
		System.out.println("You have selected game difficulty easy. If you want to cancel the game pres 0");
		tries = 15;
		computersNumber = ((int) (100 * Math.random()+1));
		break;
	
	}
	
	while(tries >= 1){
		
		Scanner inputGame = new Scanner(System.in);
		
		System.out.print("You have "+tries+" left, select a number: ");
		
		try{
		playersNumber = inputGame.nextInt();
		
		if(playersNumber == 0) return;
		else if(playersNumber == computersNumber){System.out.println("You won! The number was " +computersNumber); return;}
		else if(playersNumber < computersNumber){tries -= 1; System.out.println("Too low");}
		else if(playersNumber > computersNumber){tries -= 1; System.out.println("Too high");}
		
		}catch(Exception error){
			System.out.println("Error, please type a number!");;
			tries -= 1;
		}
	
		}
		
	System.out.println("You have run out of tries, the number was: "+computersNumber);
	
}	
	
//----------------------------------------------------------------


//###Start the game### Subroutine #2
//-----------------------------------------------------------------
		static void startGame()
		{
			String game = ""; 
			int gameINT; 
			
			while(true)
			{
				
			Scanner input = new Scanner(System.in); 
			System.out.print("Choose a new game difficulty by typing 1, 2 or 3 or type quit(q) to quit: ");
			game = input.next();
			game = game.toLowerCase();
			
			if(game.equals("quit") || game.equals("q")){
				System.out.println("Thanks for playing");
				break;
			}
			try{
				gameINT = Integer.parseInt(game);
				if((gameINT >=1) && (gameINT <=3))
					playGame(gameINT);
				else System.out.println("Select a game difficulty from 1-3 or quit.");
					
			   }catch(Exception error){
				System.out.println("Select a game difficulty from 1-3 or quit.");
			
			                          }
		   }
	}
//-----------------------------------------------------------------
	
	
}
