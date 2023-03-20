import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(5);
        numList.add(4);
        numList.add(25);
        numList.add(2);
        numList.add(14);
        numList.add(87);
        numList.add(56);
        System.out.println(numList);
        Collections.sort(numList);
        System.out.println(numList);


        public static int binarySearch (ArrayList < Integer > numList,int target){
            int tempMedian = 0;
            int adder = 0;
            int startIndex = 0;
            int endIndex = numList.size() -1;
            for (int length = numList.size(); length > 0;) {
                if ((length - tempMedian) % 2 == 0) {
                    tempMedian = (numList.get(numList.size() / 2) + numList.get(numList.size()) / 2 - 1) / 2;
                } else {
                    tempMedian = numList.get(numList.size() / 2);
                }
                if(target == tempMedian){
                    return tempMedian;
                }
                if (target >= tempMedian) {
                    startIndex = tempMedian;
                } else {
                    numList.removeRange(tempMedian, numList.size());
                }
                if (length == 1 && numList.get(target) == target) {
                    System.out.println(target);
                } else if (length == 1) {
                    System.out.println(target);
                }
            }
        }


    }
}