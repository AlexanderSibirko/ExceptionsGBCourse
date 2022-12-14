public class Homework13 {
    public static void main(String[] args) {
        int[] arr1 = { 5, 4, 3, 2, 1 };
        int[] arr2 = { 1, 2, 3, 4, 5, 6 };

        subArrays(arr1, arr2);
    }

    public static int[] subArrays(int[] numArr1, int[] numArr2) {
        if (numArr1.length != numArr2.length) {
            throw new RuntimeException("Arrays aren't same size");
        }
        int[] result = new int[numArr1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = numArr1[i] - numArr2[i];
        }
        return result;
    }

}
