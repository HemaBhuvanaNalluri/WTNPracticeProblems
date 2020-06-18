package Classes_Objects;

import java.util.*;

class box
{
    int vol,length,breadth,height;
    box(int l,int b,int h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    int volume()
    {
        vol=length*breadth*height;
        return vol;
    }
}
public class Program1
{
	public static void main(String[] args)
	{
	   
	    Scanner sc=new Scanner(System.in);
	    int le=sc.nextInt();
	    int br=sc.nextInt();
	    int he=sc.nextInt();
	     box b=new box(le,br,he);
	    int x=b.volume();
	    System.out.println("Volume="+x);
	    sc.close();
	}
}