package cn.qdu.edu.RentBusiness;


public class Car extends Moto{
	private String type;
	
	public int rentFee(int day){
		if(type.equals("����")){
			setFeePer(500);
		}else if(type.equals("����")){
			setFeePer(600);
		}else if(type.equals("·��")){
			setFeePer(800);
		}
		return getFeePer()*day;
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
