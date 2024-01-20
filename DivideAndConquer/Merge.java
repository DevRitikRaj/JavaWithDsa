package DivideAndConquer;

public class Merge {

    public static void Sort(int arr[], int si, int ei){

        if(si>=ei){
            return;
        }

        int mid=si+(ei-si)/2; //Also can written as (si+ei)/2;
        Sort(arr, si, mid);  
        Sort(arr, mid+1, ei); 

        
        merge(arr, si, mid, ei);

    }

    public static void merge(int arr[], int si,int mid, int ei){

        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while (i<=mid && j<=ei) {

            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;               

            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;    
            
        }


        // lastover element of 1st Part

        while (i<=mid) {
            temp[k++]=arr[i++];
            
        }
          // 2nd Part
          while (j<=ei) {
            temp[k++]=arr[j++];
            
          }

          for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];

          }

    }

    public static void Printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String [] args){
        int arr[]={2,3,4,1,6,5};
        Sort(arr, 0, arr.length-1);
        Printarr(arr);
            

    }
    
}
