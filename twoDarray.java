import java.util.Scanner;
class TwoDarray
{
    public static void main(String[] args) 
    {
        int a[][];
        a=new int[3][4];
        int i,j;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<= a.length-1; i++)
        {
            for(j=0;j<=a[i].length-1; j++)
            {
            System.out.println("enter an element");
            a[i][j]= sc.nextInt();
            }
			System.out.println(a[i][j]);
    }
}
}
