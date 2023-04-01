public class ForTests {
    public static void main(String[] args) {
        int[][] zd2 = new int[1][31];
        for (int z = 0; z < 31; z++) {
            zd2[0][z] = z + 1;
            System.out.println("Month: 5, day:" + zd2[0][z]);
        }
    }
}
