package basics.conditions;

public class methods {

 int boxRectangle(int length, int width){
	int rec;
	rec=length*width;
	return rec;
}
	public static void main(String[] args)
	{
		methods md=new methods();
		// TODO Auto-generated method stub
   int rec= md.boxRectangle(10,20);
   System.out.println(rec);
   System.out.println(mai());
  
	}
		static String mai()
		{
			System.out.println("hii");
			String name="Bye";
			return name;
		}
}