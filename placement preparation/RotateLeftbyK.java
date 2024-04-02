import java.io.*;

class RotateLeftbyK {
    static void Rotate(int arr[], int k, int n) {
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + n - k) % n] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    static void PrintTheArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the number of elements in the array:");
        int N = Integer.parseInt(reader.readLine());
        int arr[] = new int[N];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println("Enter the number of positions to rotate left:");
        int k = Integer.parseInt(reader.readLine());

        Rotate(arr, k, N);
        System.out.println("Array after left rotation by " + k + " positions:");
        PrintTheArray(arr, N);
    }
}
