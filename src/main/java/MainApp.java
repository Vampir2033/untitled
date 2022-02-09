import java.math.BigDecimal;
import java.util.Arrays;

public class MainApp {
    public static void Sort(int[] A, int p, int r){
        if(p < r){
            int q = new BigDecimal(p+r)
                    .divide(new BigDecimal(2), BigDecimal.ROUND_HALF_DOWN).intValue();
            Sort(A, p, q);
            Sort(A, q+1, r);
            Merge(A, p, q, r);
        }
    }

    private static void Merge(int[] A, int p, int q, int r){
        int[] buf = Arrays.copyOfRange(A, p-1, r);
        int firstIt = 0;
        int secondIt = q - p + 1;
        for (int i = p - 1; i < r; i++) {
            boolean firstInRange = firstIt < r - q;
            boolean secondInRange = secondIt < buf.length;
            if (firstInRange && secondInRange) {
                A[i] = buf[secondIt] < buf[firstIt] ?
                        buf[secondIt++] : buf[firstIt++];
            } else if (!firstInRange) {
                A[i] = buf[secondIt++];
            } else {
                A[i] = buf[firstIt++];
            }
        }
    }
}
