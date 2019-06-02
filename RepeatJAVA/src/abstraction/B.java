package abstraction;

public class B extends A
{

	@Override
	void msg() {
		// TODO Auto-generated method stub
		System.out.println("msg");
		
	}

	@Override
	int hello(String a) {
		// TODO Auto-generated method stub
		System.out.println("hello "+a);
		return 0;
	}

}
