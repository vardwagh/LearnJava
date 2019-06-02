package interfaceMultipleInheritance;

public class Circle extends Diameter implements Area,Circumference
{

	@Override
	public float circum(float r) {
		// TODO Auto-generated method stub
		
		return 2*3.14f*r;
	}

	@Override
	public float area(float r) {
		// TODO Auto-generated method stub
		return 3.14f*r*r;
	}

	@Override
	float diameter(float r) {
		// TODO Auto-generated method stub
		return 2*r;
	}

}
