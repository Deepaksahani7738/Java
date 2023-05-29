import java.util.Scanner;

class main{
	public static void main(String[] args){
		System.out.println("hello world");
		
		System.out.println("Enter the number: ");
		Scanner data=new Scanner(System.in);
		int a=data.nextInt();
		if(a%2==0)
			{
			System.out.println(a+" is even number");
			}
		else
		{
			if(a%2!=0)
				{
				System.out.println(a+" is odd number ");
				}
		}
		System.out.println("Successfuly");
			for (int i=0; i<100; i++){
			
			if(i%2==0)
				{
				System.out.println(i+" is an even number");
				}
			else
				{
			System.out.println(i+" is an odd number");
				}
			
			}
			
		}
}