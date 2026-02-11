import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array:");
        int n=sc.nextInt();
        int[] old=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter a number:");
            old[i]=sc.nextInt();
        }
        System.out.println("The elements of the array are:");
        for(int j=0;j<n;j++){
            System.out.println(j+" :"+old[j]);
        }
        System.out.print("Enter another number:");
        int new_num=sc.nextInt();
        int[] new_arr=new int[old.length+1];
        for(int i=0;i<n;i++){
            new_arr[i]=old[i];
        }
        new_arr[n]=new_num;
        System.out.println("After resizing the array:");
        for(int i=0;i<new_arr.length;i++){
            System.out.print(new_arr[i]+" ");
        }
    }
}
