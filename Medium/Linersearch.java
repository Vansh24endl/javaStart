class Linersearch
{
  static int search(int a[], int n, int x)
  {
    for(int i = 0; i < n; i++)
      {
        if(a[i] == x)
          return i;
      }
  }
  public static void main(String args[])
  {
    int[] a = {3,5,1,6,7,8};
    int n = a.length;

    int x = 1;

    int index = search(a, n, x);

    if(index == -1)
      System.out.println("Element is not present in array");
    else
      System.out.println("Element is present in array");  
  }
}
