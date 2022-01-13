package array;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}};
        System.out.println(arr.length); // 행의 길이
        System.out.println(arr[0].length);

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++)
                System.out.println(arr[i][j]);
        } char al = 'a';
        char[][] ch = new char[13][2];
        for(int i = 0; i < ch.length; i++) {
            for(int j = 0; j < ch[i].length; j++)
                ch[i][j] = al++;
        }
        System.out.println(ch.length);
        for(int i = 0; i < ch.length; i++)
            for(int j = 0; j < ch[i].length; j++)
                System.out.println(ch[i][j]);
    }
}
