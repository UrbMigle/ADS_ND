//Pretty fast
public class ADS_After_Optimization {

    public static void main(String[] args) {
        int n = 1000000;
        int lost = 13;
        int [] lostPositions = new int [n/5];

        int [] templostPositions = {0, 1, 5, 9, 15, 21, 25, 29, 35, 39, 43, 55, 59, 63};

        for(int i = 0; i < 14; i++)
        {
            lostPositions[i] = templostPositions[i];
        }
        for (int i = 14; (lostPositions[i-5] + 34) <= n; i++) {
            lostPositions[i] = lostPositions[i - 5] + 34;
            lost++;
        }
        System.out.println(n-lost);
    }

}
