
public class Array {
    private int[] arr;
    private int count = 0;
    private int temp = 0;

    public Array(int length) {
        arr = new int[length];
    }

    public void insert(int inserted_value) {
        if (arr.length == count) {
            int[] newArray = new int[count * 2];
            System.arraycopy(arr, 0, newArray, 0, count);
            arr = newArray;
        }
        arr[count++] = inserted_value;
    }

    public void removeAt(int indexNumber) {
        if (indexNumber >= count & indexNumber > -1)
            throw new IllegalArgumentException();
        for (int i = indexNumber; i < count; i++)
            arr[i] = arr[i + 1];
        count = count - 1;
    }

    public void indexOf(int indexNumber) {
        int search = -1;
        if (indexNumber <= count & indexNumber > -1) {
            search = arr[indexNumber];
        }
        System.out.println(search);
    }

    public int findMax() {

        for (int i = 0; i < count; i++) {
            if (temp < arr[i]) {
                temp = arr[i];
            }
        }
        return temp;
    }

    public void intersect(Array ourArray, int[] NumberArray) {

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < NumberArray.length; j++) {
                if (arr[i] == NumberArray[j]) {
                    System.out.println(arr[i]);
                }
            }
        }

    }

    public void reverse() {
        for (int i = (count - 1); i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }

    public void insertAt(int itemToBeInserted, int indexToBeInserted) {
        if (indexToBeInserted <= count & indexToBeInserted > -1) {
            arr[indexToBeInserted] = itemToBeInserted;
        } else {
            throw new IllegalArgumentException();
        }

    }

    public void print() {
        for (int i = 0; i < count; i++) System.out.println(arr[i]);
    }

}
