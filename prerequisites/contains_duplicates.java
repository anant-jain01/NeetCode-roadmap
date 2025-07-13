package prerequisites;

import java.util.Arrays;
import java.util.Scanner;

public class contains_duplicates {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Number of terms:");
    int n=sc.nextInt();
    int[] arr=new int[n];
    for (int i = 0; i < arr.length; i++) {
      System.out.println("term:");
      arr[i]=sc.nextInt();
    }
    System.out.println(hasDuplicate(arr));
  }


  //WAY -1


  // public static boolean hasDuplicate(int[] arr){
  //   Arrays.sort(arr);
  //   for (int i = 0; i < arr.length-1; i++) {
  //     if(arr[i]==arr[i+1]) return false;
  //   }
  //   return true;
  // }

  //WAY 2

  
  public static boolean hasDuplicate(int[] arr){
    Set<Integer> seen=new HashSet<>();
    for (int i : arr) {
      if(!seen.add(i))return true;
    }
    return false;
  }
}
