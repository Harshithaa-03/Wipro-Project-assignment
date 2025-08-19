import java.util.*;
public class ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] num=new int[5];
		System.out.println("Enter 5 numbers" );
		for(int i=0;i<5;i++)
		{
			num[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<5;i++)
		{
			if(num[i]<10)
			{
				num[i]*=2;
			}
			sum+=num[i];
		}
		double average=(double)sum/5;
		System.out.println("Average:" + average );

	}

}
