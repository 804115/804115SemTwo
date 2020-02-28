
/**
 * Write a description of class MergeSorter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MergeSorter extends Sorter
{
    public MergeSorter() {
        super();
    }

    public void sort(int[] a, int n) {
        if (n < 2) {
            return;
        } //  Base Case
        int mid = n / 2;
        int[] l = allocateTempArray(mid);
        int[] r = allocateTempArray(n - mid);
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        sort(l, mid);
        sort(r, n - mid);
        
        merge(a, l, r, mid, n - mid);
    }
    
    public void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (less(i, left) && less(j, right)) {
            if (lessEqual(l[i], r[j])) {
                moveValue(a, k++, l[i++]);
            }else {
                moveValue(a, k++, r[j++]);
            }
        }
        while (less(i, left)) { 
            moveValue(a, k++, l[i++]);
        }
        while (less(j, right)) {
            moveValue(a, k++, r[j++]);
        }
    }
}
