import java.util.Scanner;
public class Linear_search{
    public static void main(String[] args) {
        int i,n,item,c=0;
        int[] arr;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the elements");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        item=sc.nextInt();
        for(i=0;i<arr.length;i++){
            if(arr[i]==item){
                System.out.println("Item found in index "+i);
                c++;
                break;
            }
        }
        if(c==0)
            System.out.println("Item doesn't exist");
    }
}
