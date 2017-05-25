
public abstract class CapitalStrategy extends Loan {
	
	public double capital(Loan loan){
		return capital;
	}
		
	public double duration(Loan loan){
		return duration;
	}
	
	protected double riskFactorFor(Loan loan){
		return riskFactorFor;
	}
	
	public double getCommitment(){
		return commit;
	}
	
	public double getUnusedPercentage(){
		return percentage;
	}
	
	protected double capitalTemplate(Loan loan){
		return duration(loan) * riskFactorFor(loan)
				* capital(loan);
	}
	
	
	
	

}
