import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array:");
        int n=sc.nextInt();
        int[] old=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a number:");
            old[i]=sc.nextInt();
        }
        System.out.println("Input array:");
        for(int k=0;k<old.length;k++){
            System.out.print(old[k]+" ");
        }
        int i=0,m=old.length;
        while(i<old.length){
            int temp=old[i];
            for(int j=i+1;j<old.length;j++){
                if(temp==old[j]){
                    old[j]=0;
                }
            }
            i++;
        }
            int l = 0;
           for(int y = 0; y < old.length; y++){
               if(old[y] != 0){
                  l++;
               }
           }

        int[] new_arr=new int[m];
        int c=0;
            for(int a=0;a<old.length;a++){
                if(old[a]!=0){
                    new_arr[c]=old[a];
                    c++;
                }
            }
        System.out.println();
        System.out.println("New array:");
        for(int b=0;b<new_arr.length;b++){
            System.out.print(new_arr[b]+" ");
        }
    }
}
