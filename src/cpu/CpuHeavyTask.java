package src.cpu;

import java.util.HashMap;
import java.util.Map;

/*
    Hedef : İşlemciyi yoğun bir şekilde kullanan görev oluşturmak
 */
public class CpuHeavyTask
{
  private static final Map<Integer,Long> memo = new HashMap<>();
  public static long fibonacci(int n)
  {
    if(n<=0) { return 0; }
    if(n==1) { return 1; }
    return  fibonacci(n-1) + fibonacci(n-2);
  }
  public static long fibonacciOptimized(int number)
  {
    if(number<=1) { return number; }
    if(memo.containsKey(number))
    {
      return memo.get(number);
    }
    long result = fibonacciOptimized(number-1)+fibonacciOptimized(number-2);
    memo.put(number,result);
    return result;
  }

  /*
      ## Mevcut Fibonacci hesaplamamız çok yavaş çünkü tekrarlı işlemler yapıyor.
      ## Bunun yerine dinamik programlama (memoization) kullanırsak,
        ##   hesaplamayı aşırı hızlandırabiliriz.
   */


  public static void runCpuTest(int number)
  {
    System.out.println("#### CPU testi başlıyor ...");

    long startTime = System.nanoTime(); //

    long result = fibonacci((number));

    long endTime = System.nanoTime();
    long duration = endTime - startTime;
    System.out.println("Fibonacci ( " + number + " ) = " + result);
    System.out.println("Hesaplama Süresi => " + duration + " nanoSeconds");

  }

  public static void runOptimizedCpuTest(int number)
  {
    System.out.println("#### OPTIMIZED CPU testi başlıyor ...");

    long startTime = System.nanoTime(); //

    long result = fibonacciOptimized((number));

    long endTime = System.nanoTime();
    long duration = endTime - startTime;
    System.out.println("Fibonacci ( " + number + " ) = " + result);
    System.out.println("Hesaplama Süresi => " + duration + " nanoSeconds");

  }

}
