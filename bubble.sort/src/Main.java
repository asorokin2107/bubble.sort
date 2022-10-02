import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] massive = {11, 14, 4, 22, 21};

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < massive.length - 1; i++) {
                if (massive[i] > massive[i+1]) {
                    isSorted = false;

                    buf = massive[i];
                    massive[i] = massive[i+1];
                    massive[i+1] = buf;

                }

            }
        }
        System.out.println(Arrays.toString(massive));
    }
}
