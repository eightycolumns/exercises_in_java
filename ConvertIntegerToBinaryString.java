class ConvertIntegerToBinaryString {
  public static void main(String[] args) {
    for (int i = 0; i < 256; i += 1) {
      StringBuilder binaryString;

      if (i == 0) {
        binaryString = new StringBuilder("0");
      } else {
        binaryString = new StringBuilder();

        for (int j = i; j > 0; j /= 2) {
          binaryString.insert(0, j % 2);
        }
      }

      System.out.format("%3d\t%8s\n", i, binaryString);
    }
  }
}
