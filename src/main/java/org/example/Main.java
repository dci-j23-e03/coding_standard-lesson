package org.example;

// no wildcards, need to use full import statements

import org.example.printerpackage.Printer;

// Javadoc comment starts with /**

/**
 *
 */
public class Main {

  public static void main(String[] args) {
    Printer superPrinter = new Printer("Super printer");

    // not acceptable
    superPrinter.print("Hello World!");
    // acceptable
    Printer.print("Hello beautiful world!");

    // line breaking, two acceptable ways
    StringBuilder sb = new StringBuilder();
    sb.append("Hello").append(" again").append(" from").append(" main").append(" method")
        .append(" of").append(" Main").append(" class.");

    sb.append("Hello")
        .append(" again")
        .append(" from")
        .append(" main")
        .append(" method")
        .append(" of")
        .append(" Main")
        .append(" class.");
  }

  // allowed to have inner classes
  class SomeOtherClass {

  }
// this is just some comment to test line width, so nothing important is being put int this line,
// just some random thoughts, lines should have width of 100 characters
}

// shouldn't use multiple top level classes in a single file
class SomeClass {

}