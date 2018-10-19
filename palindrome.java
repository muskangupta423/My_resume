import java.util.*;
import java.lan.*;
class pal
{
	public static void main(String...s)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0;
		int temp=num;
		while(temp!=0)
		{
			int rem=temp%10;
			temp=temp/10;
			rev=rev*10+rem;
		}
		if(num==rev)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}


