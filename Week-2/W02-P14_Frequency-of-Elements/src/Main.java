import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        findFrequencyOfElements(arr);
    }

    public static void findFrequencyOfElements(int[] arr) {

        boolean[] isVisited = new boolean[arr.length];
        Arrays.fill(isVisited, false);

        for (int i = 0; i < arr.length; i++) {

            if (isVisited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isVisited[j] = true;
                    count++;
                }
            }

            System.out.println(arr[i] + " is repeated " + count + " times.");

        }
    }
}