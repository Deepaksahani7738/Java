import java.util.Scanner;

//single code character //double code string

 class main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
			System.out.println("Enter the numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			
				if(a>b && a>c){
				
				System.out.println(a+" is a greater");
				
				}	else if(b>a && b>c){
				System.out.println(b+" is a greater");
			
			}	else {
				System.out.println(c+" is greater");
			
		}
			
	}

}

class main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
			System.out.println("Enter the numbers");
			int a=sc.nextInt();
			
			switch(a){
				
				case 1:
				System.out.println("Monday");
				break;
				
				case 2:
				System.out.println("Tuesday");
				break;
				
				case 3:
				System.out.println("Wednesday");
				break;
				
				case 4:
				System.out.println("Thursday");
				break;
				
				default:
				System.out.println("invalid data");
				
				
		}		
	
	}

}

class main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
			System.out.println("Enter the character");
			int a=sc.next().charAt(0);
			
			switch(a){
				
				case 'a':
				
				case 'e':
			
				case 'i':
		
				case 'o':
			
				case 'u':
			
				case 'A':
			
				case 'E':
		
				case 'I':
			
				case 'O':
				
				case 'U':
				System.out.println(" it is vowel");
				
				break;
				
				default:
				System.out.println("invalid data");			
				
			
		}
	}

}