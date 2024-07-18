import java.util.Scanner;

class Guesser{
    int guessNum;
    int guessNum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Gusser kinndly guess the number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}
class Player{
    int guessNum;
    int guessNum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Player kinndly guess the number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}
class umpier{
    int numberFromGuesser;
    int numberFromPlayer1;
    int numberFromPlayer2;
    int numberFromPlayer3;

    void collectNumFromGuesser(){
        Guesser g = new Guesser();
        numberFromGuesser = g.guessNum();
    }
    void collectNumFromPlayer(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numberFromPlayer1 = p1.guessNum();
        numberFromPlayer2 = p2.guessNum();
        numberFromPlayer3 = p3.guessNum();
    }
    void compare(){
        if(numberFromGuesser==numberFromPlayer1){
            if(numberFromGuesser==numberFromPlayer2 &&numberFromGuesser==numberFromPlayer3){
                System.out.println("All the Player won the Game");
            }
            else if(numberFromGuesser==numberFromPlayer2){
                System.out.println("Palyer 1 and Player 2 won the Game");
            }
            else if(numberFromGuesser==numberFromPlayer3){
                System.out.println("Palyer 1 and Player 3 won the Game");
            }
            else{
                System.out.println("Player 1 won the Game");
            }          
        }
        else if(numberFromGuesser==numberFromPlayer2){
            if(numberFromGuesser==numberFromPlayer3){
                System.out.println("Palyer 2 and Player 3 won the Game");
            }
            else{
            System.out.println("Player 2 won the Game");
            } 
        }
        else if(numberFromGuesser==numberFromPlayer3){
            System.out.println("Player 3 won the Game");
        }
        else{
            System.out.println("Game lost Try Again !");
        }
    }
}
public class Launchgame {
    public static void main(String[] args) {
        umpier u = new umpier();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }
}
