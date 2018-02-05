package offer;

/**
 * Created by huali on 2018/2/4.
 */
public class Partition {

    public int Partition_1(int[] array, int low, int high) {
        int flag = array[low];

        while (low < high) {
            while (low < high && array[high] >= flag) {
                high--;
            }
            swap(array, low, high);
            while (low < high && array[low] <= flag) {
                low++;
            }
            swap(array, low, high);
        }
        //partition

        return low;
    }

    public void swap(int[] array, int start, int end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }
}