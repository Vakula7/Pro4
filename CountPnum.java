

import java.util.Scanner;

public class CountPnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int flag=0,count=0;
		for(int p=n1;p<=n2;p++)
		{    
	    if(p>2)
		{
			for(int i=2;i<=p;i++)
			{
				
				if((p%i)==0)
				{
					flag++;
				}
				
			}
			if(flag==1)
			{
				count++;
				
			}
			flag=0;
				
		}	
		}
		
     System.out.println(count);
	}

}
