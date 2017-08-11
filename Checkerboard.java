class Checkerboard {
  public static void main(String[] args) {
    for (int i = 0; i < 8; i += 1) {
      for (int j = 0; j < 8; j += 1) {
        if (is_even(i + j)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }

      System.out.print("\n");
    }
  }

  private static boolean is_even(int d) {
    return d % 2 == 0;
  }
}
