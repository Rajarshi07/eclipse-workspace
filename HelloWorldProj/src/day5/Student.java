package day5;

public abstract class Student {
	String name,result;
	int testScore[];
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public int[] getTestScore() {
		return testScore;
	}
	public void setTestScore(int[] testScore) {
		this.testScore = testScore;
	}
	public Student(String name, int[] testScore) {
		super();
		this.name = name;
		this.testScore = testScore;
	}
	public abstract String generateResult();
}
