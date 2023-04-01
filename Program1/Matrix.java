import java.util.Scanner;
public class Matrix
	{
		public static void main(String args[])
			{
				Scanner s=new Scanner(System.in);
				System.out.println("\nEnter number of rows: ");
				int m=s.nextInt();
				System.out.println("\nEnter number of Cols: ");
				int n=s.nextInt();

				int[][] arr1=new int[m][n];
				int[][] arr2=new int[m][n];
				int[][] arr3=new int[m][n];

				System.out.println("\nEnter Elements of 1st matrix: \n");
				for(int i=0;i<n;i++)
					{
						for(int j=0;j<m;j++)
							{
								arr1[i][j]=s.nextInt();
							}
					}

				System.out.println("\nEnter Elements of 2nd matrix: \n");
				for(int k=0;k<n;k++)
					{
						for(int l=0;l<m;l++)
							{
								arr2[k][l]=s.nextInt();
							}
					}

				for(int i=0;i<n;i++)
					{
						for(int j=0;j<m;j++)
							{
								arr3[i][j]=arr1[i][j]+arr2[i][j];
							}
					}

				System.out.println("\nAdded Matrix: \n");
				for(int k=0;k<n;k++)
					{
						for(int l=0;l<m;l++)
							{
								System.out.print(arr3[k][l]+"\t");
							}
						System.out.print("\n");
					}
				}
			}

