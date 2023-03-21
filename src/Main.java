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
        binarySearch(numList, 2);
    } 
        public static int binarySearch(ArrayList < Integer > numList,int target){
            double tempMedian = 0;
          int tempMedianIndex;
            int startIndex = 0;
            int endIndex = numList.size() -1;
            for (int length = numList.size(); length > 0;) {
                if ((length - tempMedian) % 2 == 0) {
                    tempMedian = (numList.get(endIndex/2+startIndex/2) + numList.get(endIndex/2+startIndex/2-1) / 2);
                    tempMedianIndex = (endIndex+startIndex)/2;
                } else {
                    tempMedian = numList.get((endIndex+startIndex) / 2);
                  tempMedianIndex = (endIndex+startIndex) / 2;
                }
                if(target == tempMedian){
                  System.out.println(tempMedianIndex);
                    return tempMedianIndex;
                }
                if (target >= tempMedian) {
                    startIndex = tempMedianIndex + 1;
                    length = endIndex-startIndex+1;
                } else {
                    endIndex = tempMedianIndex;
                  length = endIndex-startIndex+1;

                }
                if (startIndex == endIndex && numList.get(startIndex) == target) {
                  System.out.println(startIndex);  
                  return startIndex;
                } else if (startIndex == endIndex) {
                    System.out.println(-1);
                  return -1;
                }
            }
          return -1;
        }


}