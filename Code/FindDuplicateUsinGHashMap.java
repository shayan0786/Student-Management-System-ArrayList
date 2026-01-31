import java.util.HashMap;
import java.util.Scanner;

public class FindDuplicateUsinGHashMap {
    public static boolean isDuplicate(int[] currency){
        HashMap<Integer,Integer> locker = new HashMap<>();
        for(int curr:currency){
            if(locker.containsKey(curr)){
                return true;
            }
            locker.put(curr,1);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] currency = new int[n];
        for(int i = 0;i<currency.length;i++){
            currency[i] = sc.nextInt();
        }
        boolean hasDuplicate = isDuplicate(currency);
        System.out.println(hasDuplicate);
    }  
}
