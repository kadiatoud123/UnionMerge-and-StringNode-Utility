import java.util.Arrays;

public class Problem5 {
    public static int[] union(int[] a1, int[] a2){
        int[]merge= new int[a1.length+a2.length];
        Sort.quickSort(a1);
        Sort.quickSort(a2);
        int i=0;
        int j=0;
        int arrIndex= 0;
        
        if (a1==null || a2==null){
            throw new IllegalArgumentException();
        }
        while (i<a1.length && j<a2.length){
            if (a1[i]<a2[j]){
                if (arrIndex == 0 || merge[arrIndex - 1] != a1[i]){
                    merge[arrIndex]= a1[i];
                    arrIndex++;
                }
                i++;
                
            } else if(a2[j]<a1[i]){
                if (arrIndex == 0 || merge[arrIndex - 1] != a2[j]){
                    merge[arrIndex]= a2[j]; 
                    arrIndex++;
                    
                }
                
                j++;   
            } else { 
                if (arrIndex == 0 || merge[arrIndex - 1] != a1[i]) { 
                    merge[arrIndex++] = a1[i];
                }
                i++;
                j++;
            }
            
        }
        while (i < a1.length) {
            merge[arrIndex++] = a1[i++];
        }

        // Copy remaining elements of a2, if any
        while (j < a2.length) {
            merge[arrIndex++] = a2[j++];
        }                                                       
        return merge;
    }
    public static void main(String[] args) {
        int[] a1 = {10, 5, 7, 5, 9, 4};
        int[] a2 = {7, 5, 15, 7, 7, 9, 10};
        int[] result1 = union(a1, a2);
        System.out.println("result1: " + Arrays.toString(result1));

        int[] a3 = {0, 2, -4, 6, 10, 8};
        int[] a4 = {12, 0, -4, 8};
        int[] result2 = union(a3, a4);
        System.out.println("result2: " + Arrays.toString(result2));
        
    }
    
}
