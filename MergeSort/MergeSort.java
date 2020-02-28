
/**
 * Write a description of class MergeSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MergeSort
{
    private int[] array = new int[8];
    public void main(){
        loadArray(array);
        mergeSort(array, array.length);
    }
    
    public void loadArray(int[] a){
        for (int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random() * 10) + 1;
        }
    }
    
    public static void mergeSort(int[] a, int n){
        if (n < 2) {
            return;
        } //  Base Case
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        
        merge(a, l, r, mid, n - mid);
    }
    
    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }else {
                a[k++] = r[j++];
            }
        }
        while (i < left) { 
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

}

