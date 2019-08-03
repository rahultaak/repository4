package pkg1;

import java.util.Scanner;

public class Class1 {
	
	


public int sum(int a,int b)
{

	int c;
	c=a+b;
	return c;
}

public int sub(int a,int b)
{
	int c;
	c=a-b;
	return c;
	
}
public int mul(int a,int b)
{
	int c;
	c=a*b;
	return c;
	
	
}

public void div(int a,int b)
{
int c;
c=a/b;
System.out.println("result of final expression is "+c);
}

public static void main(String[] args) {
	
	System.out.println("enter the value of a and b");
	Scanner s=new Scanner(System.in);
	Class1 r=new Class1();
	int v1=s.nextInt();
	int v2=s.nextInt();
	int v3=s.nextInt();
	int v4=s.nextInt();
	int v5=s.nextInt();
	int v6=s.nextInt();
	
	int sum=r.sum(v1, v2);
	int sub=r.sub(sum, v3);
	int sum2=r.sum(sub, v4);
	int mul2=r.mul(sum2, v5);
	r.div(mul2, v6);
	
	
	
	
}
}