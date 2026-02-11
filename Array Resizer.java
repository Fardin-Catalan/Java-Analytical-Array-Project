import java.util.Scanner;
public class mahi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of an array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a number:");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=arr.length-1;i++){
             int count=1;
             boolean found=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    found=true;
                    break;
                }
            }
            if(found){
                continue;
            }
                for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                }
                System.out.println(arr[i]+" frequency:"+count+" times");
        }
    }
}
