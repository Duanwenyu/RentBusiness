package cn.qdu.edu.RentBusiness;


public class Car extends Moto{
	private String type;
	
	public int rentFee(int day){
		if(type.equals("±¦Âí")){
			setFeePer(500);
		}else if(type.equals("±¼³Û")){
			setFeePer(600);
		}else if(type.equals("Â·»¢")){
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
