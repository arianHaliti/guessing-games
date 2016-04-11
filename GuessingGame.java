import java.util.Scanner;

/**
 *
 * @author dwen
 */


public class GuessingGame {


	

//The main routine
//----------------------------------------------------------------
	public static void main(String args[])
	{
	

	
	System.out.println("########################################");
	System.out.println("#Welcome to the guessing game          #");
	System.out.println("#Please choose the game dificulty      #");
	System.out.println("########################################");
	System.out.println("#1. Hard - 7 tryes                     #");
	System.out.println("#2. Medium - 10 tryes                  #");
	System.out.println("#3. Easy - 20 tryes                    #");
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
	
	int tryes;
	int playersNumber;
	int computersNumber;
	
	switch(game){
	case 1:
		tryes = 6;
		computersNumber = ((int) (100 * Math.random()+1));
		
		System.out.println("You have selected game dificulty hard. If you want to cancel the game pres 0");
		
		while(tryes >= 1){
			
			Scanner inputGame = new Scanner(System.in);
			System.out.print("You have "+tryes+" left, select a number: ");
			try{
			playersNumber = inputGame.nextInt();
			
			if(playersNumber == 0) return;
			else if(playersNumber == computersNumber){System.out.println("You won! The number was " +computersNumber); return;}
			else if(playersNumber < computersNumber){tryes -= 1; System.out.println("Too low");}
			else if(playersNumber > computersNumber){tryes -= 1; System.out.println("Too heigh");}
			
			}catch(Exception error){
			try{
			
			playersNumber = inputGame.nextInt();
			
			}catch(Exception errorw){
				System.out.println("Error, please type a number!");;
			}
				tryes -= 1;
			}
			
			}
			
			
		System.out.println("You have run out of tryes, the number was: "+computersNumber);
		
		break;
		
	case 2:
		tryes = 10;
		computersNumber = ((int) (100 * Math.random()+1));
		
		System.out.println("You have selected game dificulty medium. If you want to cancel the game pres 0");
		
		while(tryes >= 1){
			
			Scanner inputGame = new Scanner(System.in);
			System.out.print("You have "+tryes+" left, select a number: ");
			try{
			playersNumber = inputGame.nextInt();
			
			if(playersNumber == 0) return;
			else if(playersNumber == computersNumber){System.out.println("You won! The number was " +computersNumber); return;}
			else if(playersNumber < computersNumber){tryes -= 1; System.out.println("Too low");}
			else if(playersNumber > computersNumber){tryes -= 1; System.out.println("Too heigh");}
			
			}catch(Exception error){
			try{
			
			playersNumber = inputGame.nextInt();
			
			}catch(Exception errorw){
				System.out.println("Error, please type a number!");;
			}
				tryes -= 1;
			}
			
			}
			
			
		System.out.println("You have run out of tryes, the number was: "+computersNumber);
		
		break;
		
	case 3:
		tryes = 20;
		computersNumber = ((int) (100 * Math.random()+1));
		
		System.out.println("You have selected game dificulty easy. If you want to cancel the game pres 0");
		
		while(tryes >= 1){
			
			Scanner inputGame = new Scanner(System.in);
			System.out.print("You have "+tryes+" left, select a number: ");
			try{
			playersNumber = inputGame.nextInt();
			
			if(playersNumber == 0) return;
			else if(playersNumber == computersNumber){System.out.println("You won! The number was " +computersNumber); return;}
			else if(playersNumber < computersNumber){tryes -= 1; System.out.println("Too low");}
			else if(playersNumber > computersNumber){tryes -= 1; System.out.println("Too heigh");}
			else if(playersNumber == 0) return;
			
			
			}catch(Exception error){
			try{
			
			playersNumber = inputGame.nextInt();
			
			}catch(Exception errorw){
				System.out.println("Error, please type a number!");;
			}
				tryes -= 1;
			}
			
			}
			
			
		System.out.println("You have run out of tryes, the number was: "+computersNumber);
		
		break;
	default:
		System.out.println("Select a game form 1-3");
		break;
	}

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
			System.out.print("Choose a new game dificulty by typing 1, 2 or 3 or type quit(q) to quit: ");
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
				else System.out.println("Select a game dificulty from 1-3 or quit.");
					
			   }catch(Exception error){
				System.out.println("Select a game dificulty from 1-3 or quit.");
			
			                          }
		   }
	}
//-----------------------------------------------------------------
	
	
}
