class ConvertIntegerToBinaryString {
  public static void main(String[] args) {
    for (int i = 0; i < 256; i += 1) {
      System.out.format("%3d\t%8s\n", i, toBinaryString(i));
    }
  }

  private static String toBinaryString(int d) {
    if (d == 0) {
      return "0";
    }

    StringBuilder binaryString = new StringBuilder();

    for (int i = d; i > 0; i /= 2) {
      binaryString.insert(0, i % 2);
    }

    return binaryString.toString();
  }
}
