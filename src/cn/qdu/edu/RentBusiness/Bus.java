package cn.qdu.edu.RentBusiness;

public class Bus extends Moto {
	private String seatNum;
	
	public int rentFee(int day){
		if(seatNum.equals("16×ø")){
			setFeePer(1000);
		}else if(seatNum.equals("32×ø")){
			setFeePer(2000);
		}
		return getFeePer()*day;
		
	}

	public String getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}

	
	

}
