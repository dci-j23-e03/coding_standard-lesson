package org.example.printerpackage;

public class Printer {

  // naming of constants (static final)
  private static final String PRINTER_MODEL = "Whatever PX100";
  private final String name;

  public Printer(String name) {
    this.name = name;
  }

  public static void print(String message) {
    // braces are optional because we have single statement in the if block
    // but GCS recommends to use them anyway
    // K&R brace style, Egyptian brackets
    if (!message.isEmpty()) {  // no line break before the opening brace, but there is one after
      System.out.println(message);
    } // line brake needed before closing brace
  }

  public static void justANewMethod() {
  }

  @Override
  public String toString() {
    return "Printer: " + name;
  }

}
