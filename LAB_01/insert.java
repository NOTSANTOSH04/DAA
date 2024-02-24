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
        int a[]={12,11,13,5,6};
        insert is = new insert();
        is.insert(a);
        is.printarr(a);
    }
    
}
