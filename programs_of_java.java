import java.util.Scanner;

//write  a program to reverse number !

class main{
	
	public static void main(String [] args ){
	
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	int rem=0;
	int rev=0;
	
	while(n>0){
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;	
		}
		System.out.println(rev);
	}
}

//write a program to count number !

class main{
	
	public static void main(String [] args ){
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int count=0;
	
	while(n!=0){
		
		count++;
		n=n/10;
		}
		System.out.println(count);
	}
}

//write a program to fibonaccie series !

class main{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int f=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		for (int i=0;i<=f;i++){
			a=b;
			b=c;
			c=(a+b);
			System.out.println(c);
		}	
	}
}

// write  a program to check prime number or not !

class main{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=sc.nextInt();
		int count=0;
		for (int i=1;i<=a;i++){
			if(a%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.println("it is prime number");
		}
		else{
			System.out.println("it is not prime number");
		}
		
	}
	
}





