package cn.qdu.edu.RentBusiness;

public abstract class Moto {
	private String motoNum;
	private int feePer;
	
	//¼ÆËã×â½ð
	public int rentFee(int day){
		return feePer*day;
	}

	public String getMotoNum() {
		return motoNum;
	}

	public int getFeePer() {
		return feePer;
	}

	public void setMotoNum(String motoNum) {
		this.motoNum = motoNum;
	}

	public void setFeePer(int feePer) {
		this.feePer = feePer;
	}

	
	
	
}
