package Q2;
//Justin Sciortino 40247931
import java.util.ArrayList;
import java.util.List;
//Bottom-up mergesort
public class MergeSort {
    private static List<Integer> aux;
    public static <T extends Comparable<T>> boolean less(T v, T w){
        return v.compareTo(w)<0;
    }
    public static void merge(List<Integer> a, int lo, int mid, int hi){
        int i = lo, j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            aux.set(k, a.get(k));
        }

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a.set(k, aux.get(j++));
            } else if (j > hi) {
                a.set(k, aux.get(i++));
            } else if (less(aux.get(j), aux.get(i))) {
                a.set(k, aux.get(j++));
            } else {
                a.set(k, aux.get(i++));
            }
        }
    }
    public static void sort(List<Integer> a){
        int N = a.size();
        aux = new ArrayList<>(a);
        for(int sz = 1; sz < N; sz = sz+sz){
            for(int lo = 0; lo < N-sz; lo += sz+sz){
                int hi = Math.min(lo+sz+sz-1, N-1);
                merge(a,lo, lo+sz-1, hi);
            }
        }
    }
}
