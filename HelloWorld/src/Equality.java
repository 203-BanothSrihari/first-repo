class Equal
{
int i=10;
}
public class Equality 
{
		public static void main(String[] args)
	{
		String s1="hello";
		String s2="welcome";
		System.out.println("s1 == s2 :"+ (s1==s2));
		System.out.println("s1 != s2 :"+ (s1 != s2));
		
		Equal obj1 =new Equal();
		Equal obj2 =new Equal();
		
		System.out.println("obj1 == obj2 :"+ (obj1==obj2));
		System.out.println("obj1 != obj2 :"+ (obj1 != obj2));
		

	}

}
