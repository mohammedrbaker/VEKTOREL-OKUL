package tr.com.mohammed.part3.object;

public class Islem {
	
	public static void main(String[] args) {
		Object object = new Person();
		Object object2 = new String ("Merhaba");
		goster(object, object2);
		
		//System.out.println(object2);
	}

	private static void goster(Object object,Object object2 ) {
		Person person = (Person) object;
		
		System.out.println(person.i);
		System.out.println("Merhaba "+ person.s);
				
	}

}
