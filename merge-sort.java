import java.util.Arrays;

class MergeSort {
    public static void main(String[] args) {
        int[] nums = { 38, 27, 43, 3, 9, 82, 10 };
        MergeSortClass obj1 = new MergeSortClass();
        int[] num = obj1.splitArray(nums, 0, nums.length);
        System.out.println(Arrays.toString(num));
    }
}

class MergeSortClass {

    public int[] splitArray(int[] A, int L, int R) {
        int center = ((L + R) / 2);
        int[] leftArray = new int[center]; // Create appropriate sized array
        int[] rightArray = new int[A.length - center];
        // System.out.println("-------------------------\n");
        // System.out.printf("Param A: =%s, L=%d, R=%d center = %d\n",
        // Arrays.toString(A), L, R, center);

        if (L < R && center != 0) {

            // Copy elements into split arrays
            for (int i = 0; i < leftArray.length; i++)
                leftArray[i] = A[i];

            for (int i = 0; i < rightArray.length; i++)
                rightArray[i] = A[center + i];

            splitArray(leftArray, 0, leftArray.length);
            splitArray(rightArray, 0, rightArray.length);
            A = mergeArray(leftArray, rightArray, A);
        } // end of if statement
        return A;
    }// End of splitArray

    public int[] mergeArray(int[] lArray, int[] rArray, int[] A) {
        // System.out.println("\n----Merging-----");
        int lIndex = 0, rIndex = 0;
        for (int i = 0; i < A.length; i++) {

            if (lArray.length == lIndex) {

                A[i] = rArray[rIndex]; // Case 1 when no elements left in left array
                rIndex++;
            } else if (rArray.length == rIndex) {
                A[i] = lArray[lIndex]; // Case 2: When no elements left in right away
                lIndex++;
            } else if (lArray[lIndex] < rArray[rIndex]) {
                A[i] = lArray[lIndex]; // Case 3: Left Array has smaller element
                lIndex++;
            } else {
                A[i] = rArray[rIndex]; // Case 4: Right Array has smaller element
                rIndex++;
            }
        }
        return A;
    }// End of mergeArray
}// End mergeSortClass

class MergeSorts {

    /*
     * public int[] mergeArray(int[] larr, int[] rarr, int[] A) { int lIndex = 0,
     * rIndex = 0;
     * 
     * for (int i = 0; i < A.length; i++) {
     * 
     * if (larr.length == lIndex) { A[i] = rarr[rIndex]; rIndex++; }
     * 
     * else if (rarr.length == rIndex) { A[i] = larr[lIndex]; lIndex++; } else if
     * (larr[lIndex] < rarr[rIndex]) { A[i] = larr[lIndex]; lIndex++; } else { A[i]
     * = rarr[rIndex]; rIndex++; } } return A; }// end of mergeArray
     */
}
