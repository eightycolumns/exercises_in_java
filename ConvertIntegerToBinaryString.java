class ConvertIntegerToBinaryString {
  public static void main(String[] args) {
    try {
      for (int i = 0; i < 256; i += 1) {
        System.out.format("%3d\t%8s\n", i, toBinaryString(i));
      }
    } catch (IllegalArgumentException e) {
      System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
    }
  }

  private static String toBinaryString(int d) {
    if (d < 0) {
      throw new IllegalArgumentException(
        "toBinaryString() expects nonnegative integer"
      );
    }

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
