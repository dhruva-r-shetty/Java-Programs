class  ternaops
{
	public static void main(String[] args) 
	{
		int a=2004, b=3000, c=1000;

		int res1= a>b ? a:b; //greatest of two numbers
		int res2= a<b ? a:b; //smallest of two numbers
		int res3= a>b ? (a>c ? a:c) : (b>c ? b:c); //largest of three numbers
		int res4= a<b ? (a<c ? a:c) : (b<c ? b:c); //smallest of three numbers
		int res5= a>b ? (b>c ? b:(a>c ? c:a)) : (a>c ? a:(b>c ? c:b)); //2nd largest of three numbers
		String res6= a%400 == 0 ? "Leap year" : (a%4 == 0 ? "Leap Year" : "Non-Leap Year"); //Leap Year or not
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3); 
		System.out.println(res4);
		System.out.println(res5);
		System.out.println(res6);
	}
}
