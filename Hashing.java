// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 7, 5, 1, 2, 7};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int minVal=0;
        int minFreq=Integer.MAX_VALUE;
        int maxVal=0;
        int maxFreq=Integer.MIN_VALUE;
        for(HashMap.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()>maxFreq){
                maxFreq=entry.getValue();
                maxVal = entry.getKey();
            }
            if(entry.getValue()<minFreq){
                minFreq = entry.getValue();
                minVal = entry.getKey();
            }
        }
        System.out.println("max Freq :" + maxFreq+" of value : "+maxVal);
        System.out.println("min Freq :" + minFreq+" of value : "+minVal);
    }
}
