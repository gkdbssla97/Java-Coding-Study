package array;

public class ArrayTest2 {
    public static void main(String[] args) {
        double[] arr = new double[5];

        int size = 0;
        for(int i = 0; i < 3; i++) {
            arr[i] = (double) (i + 1) * 10.0;
            size++;
        }
        double total = 0.0;
        for(int i = 0 ;i < size; i++) {
            arr[i] = (double) (i + 1) * 10.0;
            total += arr[i];
        }
        System.out.println("total = " + total);
    }
}
