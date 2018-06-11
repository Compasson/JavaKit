
import java.util.function.DoubleFunction;

public class Program {
	
	public static void burn()
	{
		System.out.println("Âñ¸ ñãîðåëî");
	}
	
	public static final int STEPS = 1000000;
	
	public static double integral(
			//MathFunction f,
			DoubleFunction<Double> f,
			double a, double b, int steps)
	{
		double summa = 0d;
		double h = (b-a)/steps;
		for(int i=0; i < steps; i++)
		{
			double x = a+h*i+h/2;
			// y = f(x)
			//double y = f.func(x); 
			double y = f.apply(x);
					
					//Math.sin(x);
			summa += y*h;
		}
		return summa;
		
	}

	public static void main(String[] args) {
		
		/*double r1 = integral(
				
				new MathFunction() {
					public double func(double x) {
						return Math.sin(x*x);
					}
				},
				0, Math.PI/2, STEPS);*/
			//MathFunction myF = x-> Math.sin(x*x); 
			//double r1 = integral(myF,0, Math.PI/2, STEPS);
			double r1 = integral( x -> Math.sin(x*x),
					0, Math.PI/2, STEPS);
			
			System.out.println(r1);
		
		Switcher sw = new Switcher();
		Lamp lamp = new Lamp();
		TVSet tv = new TVSet();
		
		AirCondition ac = new AirCondition();
		
		sw.addElectricityListener(lamp);
		sw.addElectricityListener(tv);
		
		String message = "ÃÎÐÈÒ!";
		
		
		sw.addElectricityListener(
			new ElectricityListener() {
				public void electricityOn() {
					System.out.println(message);
				}
			});
		//ElectricityListener l = () -> System.out.println("FIRE!");
		
		sw.addElectricityListener( () -> System.out.println(message));
		
		
		//sw.addElectricityListener( ()-> ac.cool() );
		sw.addElectricityListener( ac::cool );
		sw.addElectricityListener( Program::burn );
		
		
		sw.switchOn();

	}

}
