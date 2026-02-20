// Class to handle array operations
class ArrayOps {
    int[] arr;

    ArrayOps(int[] a) {
        arr = a;
    }

    void reverse() {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    void display() {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}

// Main class
public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        ArrayOps obj = new ArrayOps(a);

        System.out.print("Original array: ");
        obj.display();

        obj.reverse();

        System.out.print("Reversed array: ");
        obj.display();
    }
}
