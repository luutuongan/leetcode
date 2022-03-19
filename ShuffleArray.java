package leetcode.easy;

public class ShuffleArray {
    static int[] shuffleArray(int[] a) {
        int n = a.length / 2;
        int[] s = new int[2 * n];
        int j = 0;
        for (int i = 0; i < 2 * n; i = i + 2 ) {
            s[i] = a[j];
            s[i+1] = a[j + n];
            j++;
        }
        return s;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int[] s = (shuffleArray(a));
        for (int i = 0; i < s.length; i++)
            System.out.println(s[i]);
    }
}
