package day5;

public class PG extends Student {

	public PG(String name,  int testScore[]) {
		super(name, testScore);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String generateResult() {
		// TODO Auto-generated method stub
		double avgScore=0;
		for(int i=0;i<testScore.length;i++) {
			avgScore+=testScore[i];
		}
		avgScore/=testScore.length;
		if(avgScore>=70)result="PASS";
		else result="FAIL";
		return result;
	}

}
