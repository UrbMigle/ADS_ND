//Very slow
import java.util.LinkedList;

public class ADS_Before_Optimization {
    static int[] allVal;
    static LinkedList currValue = new LinkedList();
    static int lost = 2;

    public static void main(String[] args) {
        int n = 369;
        if (n == 0)
        {
            System.out.println(0);
            System.exit(0);
        }
        if (n == 1)
        {
            System.out.println(0);
            System.exit(0);
        }
        allVal = new int[n + 1];
        allVal[0] = 0;
        allVal[1] = 0;
        allVal[2] = 1;
        int a = 0;
        for (int i = 3; i <= n; i++) {
            for (int j = 0; j < (i) / 2; j++) {
                int first = j;
                int sec = i - j - 2;
                countVal(first, sec);
                sec++;
            }
            addToAllVal(i);
        }
        System.out.println(n-lost);
    }

    public static void countVal(int left, int right)
    {
        if (left == 0)
            currValue.add(allVal[right]);
        else
            currValue.add(allVal[left] ^ allVal[right]);
    }

    public static void addToAllVal(int index)
    {
        allVal[index] = countMEX();
        if (countMEX() == 0)
            lost++;
        currValue.clear();
    }

    public static int countMEX()
    {
        int i = 0;
        for (; currValue.contains(i); i++);
            return i;
    }
}
