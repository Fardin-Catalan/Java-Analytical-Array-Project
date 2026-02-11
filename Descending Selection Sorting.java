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
        for(int i=0;i<old.length-1;i++){
            for(int j=i+1;j<old.length;j++){
                if(old[j]>old[i]){
                    int temp=old[i];
                    old[i]=old[j];
                    old[j]=temp;
                }
            }
        }
        for(int i=0;i<old.length;i++){
            System.out.print(old[i]+" ");
        }
    }
}
