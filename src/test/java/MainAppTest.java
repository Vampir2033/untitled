import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainAppTest {

    @Test
    void sort() {
//        int A1[] = {5,2,4,6,1,3,2,6};
//        int B1[] = A1.clone();
//        MainApp.Sort(B1, 1, B1.length);
//        assertArrayEquals(Arrays.stream(A1).sorted().toArray(), B1);

        int A2[] = {5,2,4,6,1,7,3,2,6};
        int B2[] = A2.clone();
        MainApp.Sort(B2, 1, B2.length);
        assertArrayEquals(Arrays.stream(A2).sorted().toArray(), B2);
    }
}