package Inheritance;

public class Author {
  int authorno;
  String name;

  Author() {
    authorno = 0;
    name = "";
  }

  Author(String _name, int _authorno) {
    authorno = _authorno;
    name = _name;
  }

  void show() {
    System.out.println("Author No: " + authorno);
    System.out.println("Author Name: " + name);
  }
}
