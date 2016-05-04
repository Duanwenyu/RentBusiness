package cn.qdu.edu.RentBusiness;

public class Car extends Moto {

	private String type;// ±¦Âí¡¢±¼³Û¡¢°ÂµÏ

//	public Car(String MotoNo) {
//		super(MotoNo);
//	}

	@Override
	public double rentFee(int day) {
		// need day & type
		if (type.equals("±¦Âí")) {
			setFee(500);
		} else if (type.equals("±¼³Û")) {
			setFee(600);
		} else {
			setFee(400);
		}
		return super.rentFee(day);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
