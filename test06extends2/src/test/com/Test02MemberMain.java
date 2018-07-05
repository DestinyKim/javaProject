package test.com;

public class Test02MemberMain {

	public static void main(String[] args) {
		System.out.println("Memeber...");

		Test02MemberDAO dao = new Test02MemberDAOimpl();
		System.out.println(dao);

	}

}
