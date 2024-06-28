package learning;

import org.junit.Test;

public class LearningTest {

    @Test
    public void whileTime() {
        int count = 0;

        while ((count = plus(count)) != 5) {
            System.out.println("time : " + System.nanoTime());
        }
    }

    private int plus(int count) {
        count = count + 1;
        return count;
    }
}
