public class insert {
  void insert(int a[]){
    int i,j,temp;
    int n = a.length;
    for(i=1;i<n;i++){
        temp = a[i];
        j=i-1;
        while(j>=0 && temp<=a[j]){
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=temp;

    }
  }
    void printarr(int a[]){
            int n =a.length;
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
    }
     public static void main(String args[]){
        Random rand = new Random();
        int a[] = new int[50];
        for(int i=0; i<a.length; i++){
            a[i] = rand.nextInt(50);
        }
        insert is = new insert();
        long startTime = System.currentTimeMillis();
        is.insert(a);
        long endTime = System.currentTimeMillis();
        is.printarr(a);
        System.out.println("\nTime taken: " + (endTime - startTime) + " milliseconds");
    }
    }
    
}
