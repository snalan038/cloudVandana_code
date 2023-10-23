import java.util.*;

class shuffle
{
  public static void main(String args[])
  {
    int[] solutionArray = { 1, 2, 3, 4, 5, 6, 7 };

    newArray(solutionArray);
    for (int i = 0; i < solutionArray.length; i++)
    {
      System.out.print(solutionArray[i] + " ");
    }
    System.out.println();
  }

  static void newArray(int[] arr)
  {
    Random r = new Random();
    for (int i = 1; i < arr.length; i++)
    {
      int index = r.nextInt(i);
      int a = arr[index];
      arr[index] = arr[i];
      arr[i] = a;
    }
  }
}