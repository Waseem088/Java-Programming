import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		String arr[]= {"Java", "C", "C++", "Python", "Java"};
		
		//Approach1
/*		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Found dublicate element: "+ arr[i]);
					flag=true;
				}
			}
		}
		
		if(flag==false)
		{
		System.out.println("Dublicate element not found");
		} */
		
		//Approach2 - Using HashSet -  is a collection in java in which we can store only the unique elements, it will not allow to add duplicates elements
		
		HashSet<String> langs=new HashSet();
		
	/*	System.out.println(langs.add("Java"));
		System.out.println(langs.add("Python"));
		System.out.println(langs.add("Java")); */
		
		boolean flag=false;
		for(String l:arr)
		{
		//	System.out.println(langs.add(l));
			if(langs.add(l)==false)
			{
				System.out.println("Found Dublicate Element: "+l);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Not found Dublicate Elements");
		}

		
	}

}
