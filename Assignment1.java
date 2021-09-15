//Roll no: 23345
package proj1;
import java.util.*;
class Complex{
	int x,y;
	Complex(){
	
	}
	 Complex(int a,int b) {
		x=a;
		y=b;
	}
	void showdata()
	{
		System.out.println("real part="+x+"  imaginary part="+y);
	}
	Complex sum(Complex c2)
	{
		Complex c3=new Complex();
		c3.x=x+c2.x;
		c3.y=y+c2.y;
		return c3;
	}
	Complex diff(Complex c2)
	{
		Complex c3=new Complex();
		c3.x=x-c2.x;
		c3.y=y-c2.y;
		return c3;
	}
	Complex multi(Complex c2)
	{
		Complex c3=new Complex();
		c3.x=x*c2.x-y*c2.y;
		c3.y=y*c2.x+x*c2.y;
		return c3;
	}
}

public class Assignment1 {
	static public void main(String[] args) {
		int a,b,c,d;
		Complex c3=new Complex();
		System.out.println("Enter real and imaginary part of 1st complex no. c1");
	
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		Complex c1=new Complex(a,b);
		System.out.println("Enter real and imaginary part of 2nd complex no. c2");
		c=sc.nextInt();
		d=sc.nextInt();
		System.out.println("For compex no. c1");
		c1.showdata();
		Complex c2=new Complex(c,d);
		System.out.println("For compex no. c2");
		c2.showdata();
		c3=c1.sum(c2);
		System.out.println("After sum");
		c3.showdata();
		c3=c1.diff(c2);
		System.out.println("After difference");
		c3.showdata();
		c3=c1.multi(c2);
		System.out.println("After multiplication");
		c3.showdata();
		
		
	}

}
