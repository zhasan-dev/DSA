import java.util.*;
public class jaggedswaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            boolean sorted = true;
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int pass = 0; pass < n; pass++) {
                int dummy = 1;
                while (dummy < n - 1) {
                    if (arr[dummy] > arr[dummy - 1] && arr[dummy] > arr[dummy + 1]) {
                        int dum = arr[dummy];
                        arr[dummy] = arr[dummy + 1];
                        arr[dummy + 1] = dum;
                    }
                    dummy++;
                }
            }

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    sorted = false;
                    break;
                }
            }

            System.out.println(sorted ? "YES" : "NO");
        }
        sc.close();

    }
}
