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
    public static void main(String[] args) {
        int a[]={12,11,13,5,6};
        select ss = new select();
        ss.select(a);
        ss.printarr(a);
    }
}
