public class ExpSearch {
    public int ExpSearchImp(int[] array, int target) {
        int bound = 1;
        while (bound < array.length && array[bound] < target) {
            bound *= 2;


        }
        int left = bound / 2;
        int right = Math.min(bound, array.length - 1);
        return binarySearchRec(array, target, left, right);
        // This Method Must Be Copied
    }
}
