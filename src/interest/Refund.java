package interest;

public class Refund {
	
	private double rate ;
	private double loan ;
	private int time ;
	public Refund (String strRate, String strLoan, String strTime) {
		this.rate = Double.valueOf(strRate);
		this.loan = Double.valueOf(strLoan);
		this.time = Integer.valueOf(strTime);
	}
	
	public double Interrest () {
		double f = 0 ;
		if (rate > 0 || loan > 0 || time > 0) {
			rate = rate/12.0;
			int month = time*12;
			f = loan*rate*Math.pow((1.0+rate), month)/(Math.pow(1.0+rate, month)-1);

		} else {

		}
		
		return f ;
	}
	
}
