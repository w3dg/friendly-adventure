class Quiz {
  public static void main(String[] args) {
    System.out.println("h" + "a" + 'h' + 'a');
    System.out.println("h" + "a" + 'h' + 'a');
    System.out.println(1 + 2 + "3" + 4 + 5); // ( 1 + 2 ) converted to 3 and then concatenated to "3" as "33"
    // then every other thing is converted to strings -> 3345
    System.out.println(5 + "" + 6); // 56
    // System.out.println(5 + '' + 6 );
  }
}