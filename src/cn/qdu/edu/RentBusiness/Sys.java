package cn.qdu.edu.RentBusiness;

import java.util.Scanner;

public class Sys {

	public void rentMoto() {
	    //Bus & Car Type
		String[] carType = { "宝马", "奔驰", "奥迪" };
		int[] busType = { 10, 32 };
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("******欢迎进入租车系统*******");
		System.out.println("请输入您要租车的天数：");
		int day = input.nextInt();
		System.out.println("1、car or 2、bus or 3、Exit");
		int selOne = input.nextInt();
//		int num=1;
		int selCar;
		int selBus;
		if (selOne == 1) {
			do{
			int[] feeArray;
			System.out.println("type： 1、bmw 2、benc 3、audi 4、Exit");
			selCar = input.nextInt();
//			num++;
			Moto moto = new Car();//"鲁 B88888"
			((Car) moto).setType(carType[selCar - 1]);
			// 计算租金
			double totalFee = moto.rentFee(day);
			// 输出结果
			System.out.println(carType[selCar - 1]+"\t"+"共租"+day+"天\t" + "总价格:"+totalFee);
			}while(selCar!=4);{
			System.out.println("Exit,Thank you!");
			}
		} else if(selOne==2){
			do{
			System.out.println("seatCount 1、 < 16 2、 > 16 3、Exit");
			selBus = input.nextInt();
			Moto moto = new Bus();//"鲁 A88888"
		    ((Bus) moto).setSeatCount(busType[selBus - 1]);
			// 计算租金
			double totalFee = moto.rentFee(day);
			// 输出结果
			System.out.println(busType[selBus - 1]+"\t"+"共租"+day+"天\t" + "总价格:"+totalFee);
			}while(selBus!=3);{
			System.out.println("Exit,Thank you!");
			}
		}else if(selOne==3){
			System.out.println("Exit,Thank you!");
		}
	}

	public static void main(String[] args) {
		new Sys().rentMoto();
	}
}
