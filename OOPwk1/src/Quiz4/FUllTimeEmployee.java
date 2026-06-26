package Quiz4;

public class FUllTimeEmployee extends Employee implements IEvaluable {
	public double performanceScore;
	public int yearsOfService;

	public FUllTimeEmployee(int id, String name, double baseSalary,double performanceScore,int yearsOfService) {
		super(id, name, baseSalary);
	this.yearsOfService=yearsOfService;
	this.performanceScore=performanceScore;
	}

	@Override
	public double calculateBonus() {
		if(performanceScore>=70&& yearsOfService>=2) {
		return baseSalary*0.10*(performanceScore/100);
		}else return 0;
	}

	@Override
	public boolean isEligible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void disPlayInfo() {
		System.out.println("id   : " + id);
		System.out.println("name : " + name);
		System.out.println("performance  : " + performanceScore);
		System.out.println(" years: " + yearsOfService);
	
		
	}

}
