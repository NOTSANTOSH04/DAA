import java.util.Random;

public class bubble {
    void bubble(int a[]){
        int i,j,temp;
        int n = a.length;
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
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
        bubble bs = new bubble();
        long startTime = System.currentTimeMillis();
        bs.insert(a);
        long endTime = System.currentTimeMillis();
        bs.printarr(a);
        System.out.println("\nTime taken: " + (endTime - startTime) + " milliseconds");
    }
}
