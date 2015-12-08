package javaloader;

import clojure.java.api.Clojure;
import clojure.lang.IFn;
import clojure.lang.Symbol;

public class Main {

  public static void runClojure(String [] args) {
    Symbol mainVar = (Symbol)Clojure.read("javaloader.core/main");
    IFn require    = Clojure.var("clojure.core", "require");
    require.invoke(Symbol.create(mainVar.getNamespace()));
    Clojure.var(mainVar.getNamespace(), mainVar.getName()).invoke(args);
  }

  public static void main(String[] args) {
    if(args.length == 1) {
      switch(args[0]) {
      case "java":
        System.out.println("Hello from Java!");
        break;
      case "clojure":
        runClojure(args);
        break;
      default:
        System.out.println("Provide an argument of either 'clojure' or 'java'");
      }
    } else {
      System.out.println("Provide an argument of either 'clojure' or 'java'");
    }
  }
}
