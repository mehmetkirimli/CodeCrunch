package src.memory;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeakTest
{
  private static final int element = 10000000; // 10 milyon eleman

  public static void runMemoryTest()
  {
    System.out.println("## RAM Testi başlıyor ...");

    List<int[]> memoryList = new ArrayList<>();

    long startTime = System.nanoTime();

    try
    {
      for (int i=0;i<element;i++)
      {
        memoryList.add(new int[1000]); // Her öğe 1000 elemanlı bir dizi
        if(i % 1_000_000 == 0)
        {
          System.out.println(i + " öğe eklendi. ");
        }
      }
    }
    catch (OutOfMemoryError e)
    {
      System.err.println("Bellek Taştı , Deney çalıştı ");
      System.err.println(e.getMessage());
    }

    long endTime = System.nanoTime();
    System.out.println("RAM testi tamamlandı. Süre : " + (endTime-startTime)/1_000_000 + " milisaniye");

  }

}
