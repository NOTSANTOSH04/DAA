public class select {
    void select(int a[]){
        int i,j,temp,small;
        int n =a.length;
        for(i=0;i<n-1;i++){
            small=i;
            for(j=i+1;j<n;j++){
                if(a[j]<a[small]){
                    small=j;
                }
            }
            temp=a[i];
            a[i]=a[small];
            a[small]=temp;
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
        select ss = new select();
        long startTime = System.currentTimeMillis();
        ss.insert(a);
        long endTime = System.currentTimeMillis();
        ss.printarr(a);
        System.out.println("\nTime taken: " + (endTime - startTime) + " milliseconds");
    }
}
