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
        int[] listToSort = {7,8,5,4,9,2};
        int[] listToSort2 ={8,6,5,12,34,4,3,2,2};
        insertionSort(listToSort2);
        selectionSort(listToSort);
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

        public static void selectionSort(int[] arr){

            for(int i = 0; i < arr.length-1; i++){
                int minIndex = i;
                for(int j = i+1; j < arr.length;j++){
                    if(arr[j] < arr[minIndex]){
                        minIndex = j;
                    }
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
            for(int k : arr){
                System.out.print(k+" ");
            }

        }
        private static void insertionSort(int[] arr){
        int len = arr.length;
        for(int i = 1; i < len; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] >key){
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1] = key;

        }
            for(int k : arr){
                System.out.print(k+" ");
            }
            System.out.println();
        }




}