//Complete this code or write your own from scratch
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> agenda = new HashMap<>();
        
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            Integer phone = in.nextInt();
            agenda.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(agenda.get(s) != null){
                System.out.println(s+"=" + agenda.get(s).toString());
            }
            else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
