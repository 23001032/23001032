//Nemadandila Vhugala, 23001032


import java.util.Arrays;

public class COM2224test {
    public static int findProductIndex(int[] productIDs, int targetID) {
        int left = 0;
        int right = productIDs.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (productIDs[mid] == targetID) {
                return mid;
            }

            // Check if the left half is sorted
            if (productIDs[left] <= productIDs[mid]) {
                if (targetID >= productIDs[left] && targetID < productIDs[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Right half must be sorted
            else {
                if (targetID > productIDs[mid] && targetID <= productIDs[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1; // Product ID not found
    }
      

    public static void main(String[] args) {
        int[] rotatedProductIDs = {104, 105, 106, 107, 101, 102, 103};
        int targetID = 1; 
        int result = findProductIndex(rotatedProductIDs, targetID); 
        System.out.println("Index of product ID " + targetID + ": " + result); 

    }
}