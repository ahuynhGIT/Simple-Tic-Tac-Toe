import java.util.Scanner; //imports the Scanner utility

public class P1 //all code must have a class
{
  
  public static char[][] initBoard(char[][] board) //creates the board
  {
    board[0][0] = '1';
    board[0][1] = '2';
    board[0][2] = '3';
    board[1][0] = '4';
    board[1][1] = '5';
    board[1][2] = '6';
    board[2][0] = '7';
    board[2][1] = '8';
    board[2][2] = '9';
    return board;
  }
  
  public static void drawBoard(char[][] board) //draws the board
  {
    for(int i=0; i<board.length; i++)
    {
      for(int j=0; j<board[i].length; j++)
      {
        System.out.printf(" "+board[i][j]);
      }
      System.out.println();
    }
  }
  
  public static int getPlayerChoice(char player) //player chooses where to place token
  {
    Scanner input = new Scanner(System.in); //initialize new scanner object called "input"
    int move = 0; //initialize an integer "move" = 0
    int temp; //initialize an integer "temp"
    System.out.println("Player " + player + ", enter a number 1-9 to place your token."); //prompts user for a number
    boolean trueint = input.hasNextInt(); //sees whether or not the user input an integer value
    if(trueint) //if true
    {
      temp = input.nextInt(); //the integer "temp" is set = the user input
      if(temp < 1 || temp > 9) //if temp is outside of 1-9
      {
        System.out.println("Sorry, apparently you don't know how to count, so the program will now close. Thank you!"); //then this error message will print
        System.exit(1); //quits the program
      }
      else //if false
      {
        if (temp >= 1 || temp <= 9) //if within the range
        {
          move=temp; //integer move is set = temp
        }
      }
    }
    else //if not an integer
    {
      System.out.println("Sorry, that is clearly not a number, please try again and enter a number 1-9."); //prints this error message
    }
    return move; //returns the integer move
  }
  
  
  
  
  public static void setMove(int move, char[][] board, char player) //player sets his/her token the validity of the spot is checked
  {
    switch (move) //switch statement based on parameter move
    {
      case 1:
        if(board[0][0] == 'X' || board[0][0] == 'O') //if the character "X" or "O" is already in place
      {
        System.out.println("Sorry, that spot already has a token on it! Please choose again."); //then this error message will print
        break;
      }
        else //if not, the token is placed on the board
        {
          board[0][0] = player;
          break;
        }
      case 2: 
        if(board[0][1] == 'X' || board[0][1] == 'O')
      {
        System.out.println("Sorry, that spot already has a token on it! Please choose again.");
        break;
      }
        else
        {
          board[0][1] = player;
          break;
        }
      case 3:
        if(board[0][2] == 'X' || board[0][2] == 'O')
      {
        System.out.println("Sorry, that spot already has a token on it! Please choose again.");
        break;
      }
        else
        {
          board[0][2] = player;
          break;
        }
      case 4: 
        if(board[1][0] == 'X' || board[1][0] == 'O')
      {
        System.out.println("Sorry, that spot already has a token on it! Please choose again.");
        break;
      }
        else
        {
          board[1][0] = player;
          break;
        }
      case 5: 
        if(board[1][1] == 'X' || board[1][1] == 'O')
      {
        System.out.println("Sorry, that spot already has a token on it! Please choose again.");
        break;
      }
        else
        {
          board[1][1] = player;
          break;
        }
      case 6: 
        if(board[1][2] == 'X' || board[1][2] == 'O')
      {
        System.out.println("Sorry, that spot already has a token on it! Please choose again.");
        break;
      }
        else
        {
          board[1][2] = player;
          break;
        }
      case 7: 
        if(board[2][0] == 'X' || board[2][0] == 'O')
      {
        System.out.println("Sorry, that spot already has a token on it! Please choose again.");
        break;
      }
        else
        {
          board[2][0] = player;
          break;
        }
      case 8: 
        if(board[2][1] == 'X' || board[2][1] == 'O')
      {
        System.out.println("Sorry, that spot already has a token on it! Please choose again.");
        break;
      }
        else
        {
          board[2][1] = player;
          break;
        }
      case 9: 
        if(board[2][2] == 'X' || board[2][2] == 'O')
      {
        System.out.println("Sorry, that spot already has a token on it! Please choose again.");
        break;
      }
        else
        {
          board[2][2] = player;
          break;
        }
    }
  }
  
  public static boolean checkWin(char[][] board, char player) //checks if there is a winner or a draw
  {
    boolean win = false; //initializes the boolean "win" as false
    if(board[0][0] == player && board[0][1] == player && board[0][2] == player) //if the player has his/her token in a row of 3, then there is a winner
    {
      System.out.println(""+player+ " wins!");
      win = true;
    }
    else if(board[0][0] == player && board[1][0] == player && board[2][0] == player)
    {
      System.out.println(""+player+ " wins!");
      win = true;
    }
    else if(board[0][0] == player && board[1][1] == player && board[2][2] == player)
    {
      System.out.println(""+player+ " wins!");
      win = true;
    }
    else if(board[0][1] == player && board[1][1] == player && board[2][1] == player)
    {
      System.out.println(""+player+ " wins!");
      win = true;
    }
    else if(board[0][2] == player && board[1][2] == player && board[2][2] == player)
    {
      System.out.println(""+player+ " wins!");
      win = true;
    }
    else if(board[1][0] == player && board[1][1] == player && board[1][2] == player)
    {
      System.out.println(""+player+ " wins!");
      win = true;
    }
    else if(board[2][0] == player && board[2][1] == player && board[2][2] == player)
    {
      System.out.println(""+player+ " wins!");
      win = true;
    }
    else if(board[2][0] == player && board[1][1] == player && board[0][2] == player)
    {
      System.out.println(""+player+ " wins!");
      win = true;
    }
    else //if neither player has 3 in a row, it is a draw
    {
      int counter = 0;
      for(int i=0; i<board.length; i++)
      {
        for(int j=0; j<board[i].length; j++)
        {
          if(board[i][j] == 'O' || board[i][j] == 'X')
          {
            counter++;
          }
        }
      }
      if(counter == 9)
      {
        System.out.println("It's a draw!");
        win = true;
      }
    }
    return win; //return the boolean "win"
  }
  
  public static void main(String[] args) //main method 
  {
    char[][] board = new char[3][3]; //2d array of type char is initialized as a 3x3 matrix
    initBoard(board); //calls the initBoard method
    drawBoard(board); //calls the drawBoard method
    int move; //initializes the integer "move"
    int counter = 1; //initializes the integer "counter" as = 1
    char player = 'O'; //initializes the character "player" as 'O'
    boolean win = false; //initializes the boolean win as false
    do //do this loop while there is no winner
    {
      move = getPlayerChoice(player);  //return the value the user entered to place an X or O
      setMove(move, board, player);  //put move on the board
      drawBoard(board);     //draw the board on the screen
      win = checkWin(board,player);  // see if someone won tic tac toe
      if(win == true) //if there is a winner
      {
        System.out.println("Game Over ---- Thanks for Playing"); //this winning message is printed
      }
      else if(player=='O') //if not, switch to the other player
      {
        player = 'X';
      }
      else if(player=='X')
      {
        player = 'O';
      }
      counter++; //increments the counter
    }
    while(win == false);
  }
}  
