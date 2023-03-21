import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(5);
        numList.add(4);
        numList.add(25);
        numList.add(2);
        numList.add(87);
        numList.add(22);
        numList.add(15);
        System.out.println(numList);
        Collections.sort(numList);
        System.out.println(numList);
        System.out.println(binarySearch(numList, 25));
    } 
        public static int binarySearch(ArrayList < Integer > numList,int target){
            int tempMedianIndex;
            int startIndex = 0;
            int endIndex = numList.size() -1;
            while (endIndex-startIndex >=0) {
                tempMedianIndex = (startIndex+endIndex)/2;
                if(target == numList.get(tempMedianIndex)){
                    return tempMedianIndex;
                }
                if (target >= numList.get(tempMedianIndex)) {
                    startIndex = tempMedianIndex++;
                } else {
                    endIndex = tempMedianIndex--;
                }

            }

          return -1;
        }


}