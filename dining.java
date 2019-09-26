import java.util.Scanner;
public class dining
{
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter no of philosphers\n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int fork[]=new int[n];
		int i;int phil[]=new int[n];
		for(i=0;i<n;i++)
		{
			fork[i]=1;
			phil[i]=0;
		}
		int ch,p,j=0;
		while(j<3)
		{
			System.out.println("enter philosopher number\n");
			p=sc.nextInt();
			System.out.println("1.Eat\n2.Release\n3.exit\n");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1: if(phil[p]==1)
					System.out.println("ALREADY EATING\n");
					else if(fork[p]==1 && fork[(p+1)%n]==1)
					{
						fork[p]=0;
						fork[(p+1)%n]=0;
						phil[p]=1;
						System.out.println("EATING");
					}
					else
						System.out.println("FORKS BUSY");
						break;
				case 2:		System.out.println("Enter philospher number\n");
						p=sc.nextInt();
						if(phil[p]==0)
						System.out.println("ALREADY THINKING");
						else
						{
						fork[p]=1;
						fork[(p+1)%n]=1;
						phil[p]=0;
						System.out.println("STOPPED EATING");
						break;
				//case 3:System.exit(0);		
			}
			j++;
		}
	}
}
}
							