
public class programme1java {

	public static void main(String[] args) {
		Calculator calc= new Calculator();
		double res= calc.calculate(10.0, 11.3, "addition");
		System.out.println(res);
		 res= calc.calculate(10.0, 11.3, "substraction");
			System.out.println(res);
		 res= calc.calculate(10.0, 11.3, "multiplication");
				System.out.println(res);
		 res= calc.calculate(10.0, 11.3, "division");
				System.out.println(res);
					
			
	}

}
class Calculator{
	double calculate(double a,double b, String opt) {
		double result = 0.0;
		switch(opt) {
		case "addition":{
			result=a+b;
			break;
		}
		case "substraction":{
			result=a-b;
			break;
		}
		case "multiplication":{
			result=a*b;
			break;
		}
		case "division":{
			result=a/b;
			break;
		}
		}
		return result;
	}
}
