package test.com;

public class Test07Main {

	public static void main(String[] args) {
		System.out.println("Test07Main...");
		Test05Phone phone = new Test05Phone("aaa",9,"bbb");
		phone.modelName = "xxx";
		phone.price = 3000;
		phone.os = "yyy";
		Test07Object obj = new Test07Object(phone);
		//obj.동작();
		System.out.println(obj.test05Phone.modelName);
		System.out.println(obj.test05Phone.price);
		System.out.println(obj.test05Phone.os);
		
	}

}
