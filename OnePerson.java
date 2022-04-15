import java.util.Random;

public class OnePerson {
    

    public OnePerson(int id, int gender, int time){
        Arrive(id, gender);
        UseFacilities(id, gender, time);
        Depart(id, gender);
    }
    
    private void Arrive(int id, int gender) {
        Random rand = new Random();
        
    }
    
    private void UseFacilities(int id, int gender, int time) {
        
        System.out.println("USE THE POTTY ID: " + id + " GENDER: " + gender + " TIME: " + time);
    }

    
    private void Depart(int id, int gender) {
        
    
    }


    

}
