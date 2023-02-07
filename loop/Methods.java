package loop;

public class Methods {

 int boxRectangle(int length, int width){
	int rec;
	rec=length*width;
	return rec;
}
	public static void main(String[] args)
	{
		Methods md=new Methods();
		
   int rec= md.boxRectangle(10,20);
   System.out.println(rec);
   System.out.println(mai());
  
	}
		static String mai()
		{
			System.out.println("hii");
			String name= "Bye";
			return name;
		}
}