class AurobindoGodLevel {

  public String toString() {
    return " THIS IS MY WAY";
  }

  public static void main(String[] args) {
    AurobindoGodLevel ob = new AurobindoGodLevel();

    String s = "happy";
    String t = new String("sad");
    System.out.println(s);
    System.out.println(t);
    System.out.println(ob); // internally calls ob.toString()
    // so the overridden method above not the top
    // level scoped

  }

}

// notes

// tobeornottobe.replace('o', 'a'); -> tabearnattabe this is a separate object
// tobeornottobe remains same tho

// if s = tabenottobe here s is a reference variable to the string type which
// stores memory object , this just changes the memory address

// every program written until now is a subclass of java.lang.Object