import java.util.Random;

public class first {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        
        customShuffle(arr, 100);
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
    public static void customShuffle(int[] arr, int shuffleStrength) {
        Random rnd = new Random();
        int len = arr.length;
        
        for (int i = 0; i < shuffleStrength; i++) {
            int index1 = rnd.nextInt(len);
            int index2 = rnd.nextInt(len);
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
    }
}
