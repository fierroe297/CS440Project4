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
                
               } 
            }
            if(opt == 2){

            }
            if(opt == 3){
                int count = 0;
                int num1 = 0;
                int num2 = 0;
                int num3 = 0;
                int[][] arr = new int[20][4];
                for(int i = 0; i <= 19; i++){
                 count++;
                 Random rand = new Random();
                 Random rand2 = new Random();
                 int UsedTime = rand2.nextInt((8 - 3)+1) + 3;
                 int gender = rand.nextInt(2);
                     
                    for(int b = 0; b <= 3; b++){
                        if(b == 0){
                            arr[i][b] = 0;
                        }
                        if(b == 1){
                            arr[i][b] = count; 
                        }
                        if(b == 2){
                            arr[i][b] = gender;
                        }
                        if(b == 3){
                            arr[i][b] = UsedTime;
                        }
                        
                    }
                 
                
                }
                
                 for(int a = 0; a <= 19; a++){
                    for(int b = 0; b<= 3; b++){
                        System.out.print(arr[a][b] + " ");
                        
                        if(b == 1){
                            arr[a][b] = num1;
                        }
                        if(b == 2){
                            arr[a][b] = num2;
                        }
                        if(b == 3){
                            arr[a][b] = num3;
                        }

                    }
                    System.out.println();
                    
                    OnePerson person = new OnePerson(num1, num2, num3);
                    Bathroom bathroom = new Bathroom(num1, num2, person.Arrive(num1, num2));
                    

                    int temp1 = num1;
                    int temp2 = num2;
                    int temp3 = num3;


                }
            


            }
        
    }

    
}
