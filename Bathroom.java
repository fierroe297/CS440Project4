public class Bathroom {

    

    public Bathroom(int i, int j, String sex){
        firstStall(i, sex);
        secondStall(j, sex);

    }

    public static int firstStall(int i, String sex){
        int temp;
        if(sex == "M"){
            temp = 0;
        }
        else{
            temp = 1;
        }
        
        return temp;

    }

    public static int secondStall(int j, String sex){
        int temp;
        if(sex == "M"){
            temp = 0;
        }
        else{
            temp = 1;
        }
        
        return temp;

    }
    
}
