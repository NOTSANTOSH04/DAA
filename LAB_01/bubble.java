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
        int a[]={12,11,13,5,6};
        bubble bs = new bubble();
        bs.bubble(a);
        bs.printarr(a);
    }
}
