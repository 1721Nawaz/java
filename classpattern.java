import java.util.Scanner;
public class pattern
{
    public static void main(String[] args)
    {
        int rows,columns,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of rows:");
        rows=sc.nextInt();
        System.out.print("enter the number of columns:");
        columns=sc.nextInt();
        for(i=1;i<=rows;i++)
        {
            for(j=1;j<=columns;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}