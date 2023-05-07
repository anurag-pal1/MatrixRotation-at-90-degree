import java.util.Scanner;
public class arrayrotation {
    public static void RotateMatrix(int arr[][])
    {
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<m;i++)
        {
            int l=0;
            int r=n-1;
            while(l<r)
            {
                int temp=arr[i][l];
                arr[i][l]=arr[i][r];
                arr[i][r]=temp;
                l++;
                r--;
            }
        }
        System.out.println("Rotated Matrix is: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,c;
        System.out.println("Enter row and column of matrix: ");
        r=sc.nextInt();
        c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
       RotateMatrix(arr); 
    }
}
//Time complexity==O(m*n)
//if row==column i.e.m==n then
// Time Complexity-->O(n2)
//Space Complexity==O(1)