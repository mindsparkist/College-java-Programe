public class binarySearch {
    public int binarySearchrec(int[] array, int target) {
        return binarySearchrec(array, target, 0, array.length - 1);

    }

    private int binarySearchrec(int[] array, int target, int left, int right) {
        if (right < left) {
            return -1;
        }
        int middle = (left + right) / 2;
        if (array[middle] == target) {
            return middle;
        }
        if (target < array[middle]) {
            return binarySearchrec(array, target, left, middle - 1);
        }
        return binarySearchrec(array, target, middle + 1, right);

    }

}
