package com.rollingstone.scope;

public class LifeTimeOfAJavaVariable {

  public static void main(String args[]) {
    int globalLifeTimeVariable; // This lives till the end of the program

    int scopeErrorDemo = 0;
    for (globalLifeTimeVariable = 0; globalLifeTimeVariable < 3; globalLifeTimeVariable++) {
      int diesAndBornAgainEachTimeTheLoopExecutes = -1;

      // int scopeErrorDemo = 0;

      // diesAndBornAgainEachTimeTheLoopExecutes is initialized each time block is entered
      System.out.println(
          "diesAndBornAgainEachTimeTheLoopExecutes iz: " + diesAndBornAgainEachTimeTheLoopExecutes);
      // this always prints -1
      diesAndBornAgainEachTimeTheLoopExecutes = 100;
      System.out.println("diesAndBornAgainEachTimeTheLoopExecutes is now: "
          + diesAndBornAgainEachTimeTheLoopExecutes);
    }
  }
}
