import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random =new Random();
            String[] choices = {"Rock","Paper","Scissors"};
            char playAgain='Y';
            do { 
               System.out.println("====Rock-Paper-Scissors Game====");
               System.out.println("1. Rock");
               System.out.println("2.Paper");
               System.out.println("3.Scissors");
               System.out.print("Enter your Choice (1-3): ");
               int userChoice = sc.nextInt();
               if(userChoice<1 || userChoice >3){
                System.out.println("Invalid Choice!");
                continue;
               } 
               int computerChoice=random.nextInt(3)+1;
               System.out.println("\nYou chose: "+choices[userChoice-1]);
               System.out.println("Computer chose: "+choices[computerChoice-1]);
               if (userChoice==computerChoice){
                System.out.println("It's a Draw!");
               }else if((userChoice==1 && computerChoice==3)||(userChoice==2 && computerChoice==1)||(userChoice==3 && computerChoice==2)){
                System.out.println("Congratulations! You Win!");
               }else{
                System.out.println("Computer Wins!");
               }
               System.out.print("\nDo you want to play again?(Y/N):");
               playAgain=sc.next().charAt(0);
               System.out.println();
            } while (playAgain =='Y'||playAgain =='y');
            System.out.println("Thank you for playing!");
            sc.close();
    }
}
