
public class Triangle {
	public static void main(String[] args ) {
        int levels = 8;
        triangle(levels);
    }
    public static void triangle(int n) {
        for (int i = 1; i < n +1; i++) {
            for (int j = n; j >= 1; j--) {
                if (j > i ) {
                    System.out.print(" ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

}
