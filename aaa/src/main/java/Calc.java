
public clas Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public double somma (double...addendi)
	{
		double s=0;
		for(double addendo : addendi)
			s = s + addendo;
		return s; 
	}
}
