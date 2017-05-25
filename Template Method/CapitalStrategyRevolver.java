
public class CapitalStrategyRevolver extends CapitalStrategy {
	
	public double capital(Loan loan){
		return loan.outstandingRiskAmout()*duration(loan)*riskFactorFor(loan))
				+ (loan.unusedRiskAmount()*duration(loan)*unusedRiskFactor(loan));
	}

}
