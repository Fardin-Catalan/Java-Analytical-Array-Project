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
        int[] new_arr=new int[old.length];
        for(int i=0;i<old.length;i++){
            new_arr[i]=old[i];
        }
        System.out.println("Reversed using a new array:");
        for(int i=new_arr.length-1;i>=0;i--){
            System.out.print(new_arr[i]+" ");
        }
        for(int i=0;i<=old.length/2;i++){
            int temp=old[n-i-1];
            old[n-i-1]=old[i];
            old[i]=temp;
        }
        System.out.println();
        System.out.println("Reversed the original array:");
        for(int i=0;i<old.length;i++){
            System.out.print(old[i]+" ");
        }
    }
}
