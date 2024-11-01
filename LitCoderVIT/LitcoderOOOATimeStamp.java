import java.util.*;
public class LitcoderOOOATimeStamp {
    public static class TimeTravelersArchive{
        // String key;
        // String value;
        // int timestamp;
        HashMap<String,String> hm = new HashMap<>();
        HashMap<String, Integer> timestamps = new HashMap<>();
        // ArrayList<Integer> timestamps = new ArrayList<>();
        public void Store(String key,String value,Integer timestamp){
            
            hm.put((key+timestamp.toString()),value);
            timestamps.put(key,timestamp);
            // this.key = key;
            // this.value = value;
            // this.timestamp = timestamp;
        }
        public String Retrieve(String key,Integer timestamp){
            String result = hm.get(key+(timestamp.toString()));
            if(result==null){
                Integer updatedTimestamp = timestamps.get(key);
                if(updatedTimestamp<timestamp){
                    result = hm.get(key+(updatedTimestamp.toString()));
                }else{
                    return "empty";
                }
                
                // Integer val = --timestamp;
                // if(val < 0){
                //     return "empty";
                // }
                // result = hm.get(key+((val).toString()));
            }
            return result;
        }

        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TimeTravelersArchive archive = new TimeTravelersArchive();
        archive.Store("language","Latin",10);
        archive.Store("language","Old_English",50);
        archive.Store("language","Middle_English",90);
        archive.Store("language2","Middle_English",90);
        archive.Store("language1","Latin",190);
        archive.Store("language3","Latin",5);
        archive.Store("language1","Middle_English",20);
       String result1 =  archive.Retrieve("language", 2);
       System.out.println("result1: "+result1);
       String result2 =  archive.Retrieve("language1", 200);
       System.out.println("result2: "+result2);
       String result3 =  archive.Retrieve("language3", 60);
       System.out.println("result3: "+result3);
       String result4 =  archive.Retrieve("language", 90);
       System.out.println("result4: "+result4);
        sc.close();

    }
}
