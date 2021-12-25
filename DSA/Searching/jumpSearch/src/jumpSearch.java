public class jumpSearch {
    public int jSearch(int[] array, int target,) {
        int blockSize = (int) Math.sqrt(array.length);
        int start = 0;
        int next = blockSize;
        while (array[next - 1] < target) {
            start = next;
            if (start >= array.length) {
                break;
            }
            next = blockSize;
            if (next > array.length) {
                next = array.length;
            }

        }
        for (int i = start; i < next; i++) {
            if (array[i] == target)
                return i;


        }
        return -1;
    }
}
