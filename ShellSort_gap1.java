package Q1;
//Justin Sciortino 40247931
import java.util.List;
public class ShellSort_gap1 {
    public static <T extends Comparable<T>> boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }
    public static <T extends Comparable<T>>void exch(List<T> a, int i, int j) {
        T temporary = a.get(i);
        a.set(i, a.get(j));
        a.set(j, temporary);
    }
    public static <T extends Comparable<T>> void sort(List<T> a) {
        int N = a.size();
        int h = 1;

        while (h < N / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a.get(j), a.get(j - h)); j -= h) {
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }
}
