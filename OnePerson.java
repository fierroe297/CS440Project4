import java.util.concurrent.locks.ReentrantLock;

import javax.lang.model.util.ElementScanner14;

public class OnePerson {

    private static ReentrantLock mutex = new ReentrantLock();
    

    public OnePerson(int id, int gender, int time){
        Arrive(id, gender);
        UseFacilities(id, gender, time);
        Depart(id, gender);
    }
    
    static String Arrive(int id, int gender) {
        String tempSexString = " ";
        try{
            mutex.lock();
            if(gender == 0){
                tempSexString = "M";
            } 
            if(gender == 1){
                tempSexString = "F";
            }
        }finally{
            mutex.unlock();
        }
        return tempSexString;
        
    }
    
    int UseFacilities(int id, int gender, int time) {
        int totalTime = 0;



        return totalTime;

    }

    
    boolean Depart(int id, int gender) {
        
        return true;
    
    }


    

}
