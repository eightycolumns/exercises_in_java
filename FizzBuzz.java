class FizzBuzz {
  public static void main(String[] args) {
    for (int i = 1; i < 101; i += 1) {
      String s = "";

      if (i % 3 == 0) s += "Fizz";
      if (i % 5 == 0) s += "Buzz";

      System.out.println(s.isEmpty() ? i : s);
    }
  }
}
