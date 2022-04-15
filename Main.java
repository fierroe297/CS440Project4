import java.util.*;
import java.util.Random;


public class Main {


    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in); 
            System.out.println("\nEnter '1', '2', or '3' for the following options:");
            System.out.println("\n(1)    5 : DELAY(10) : 5 : DELAY(10) : 5 : DELAY(10) : 5");
            System.out.println("(2)    10: DELAY(10) : 10");
            System.out.println("(3)    20");
            int opt = input.nextInt();
            
            
            if(opt == 1){
                int count = 0;
               for(int i = 0; i <= 19; i++){
                count++;
                Random rand = new Random();
                Random rand2 = new Random();
                int time = rand2.nextInt((8 - 3)+1) + 3;
                int gender = rand.nextInt(2);
                
                OnePerson person = new OnePerson(count, gender, time);
                System.out.println(count);
                
               } 
            }
            if(opt == 2){

            }
            if(opt == 3){
                int count = 0;
                for(int i = 0; i <= 19; i++){
                 count++;
                 Random rand = new Random();
                 Random rand2 = new Random();
                 int time = rand2.nextInt((8 - 3)+1) + 3;
                 int gender = rand.nextInt(2);
                 
                 OnePerson person = new OnePerson(count, gender, time);
                 int[][] arr = new int[20][];
                 
                 System.out.println(count);

                 
                }


            }
        
    }

    
}
