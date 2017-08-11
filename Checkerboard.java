class Checkerboard {
  public static void main(String[] args) {
    for (int i = 0; i < 8; i += 1) {
      for (int j = 0; j < 8; j += 1) {
        if ((i + j) % 2 == 0) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }

      System.out.print("\n");
    }
  }
}
