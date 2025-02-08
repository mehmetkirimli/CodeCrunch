package src;

import src.cpu.CpuHeavyTask;
import src.memory.MemoryLeakTest;

public class Main
{
  public static void main(String[] args)
  {
    System.out.println("\t\t\t\t -> Application CodeCrunch Benchmarking : Performance Lab is starting..");

    //CpuHeavyTask.runCpuTest(45);
    //CpuHeavyTask.runOptimizedCpuTest(45);

    MemoryLeakTest.runMemoryTest();

  }

}
