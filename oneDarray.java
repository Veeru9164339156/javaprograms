import java.util.Scanner;
class oneDarray
{
    public static void main(String[] args) 
    {
        int a[];
        a=new int[5];
        int i;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<= a.length-1; i++)
        {
            System.out.println("enter an element");
            a[i]= sc.nextInt();
        }
        for( i=0; i<=a.length-1; i++) 
        {
            System.out.println(a[i]);
        }
    }
}
