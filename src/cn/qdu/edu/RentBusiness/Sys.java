package cn.qdu.edu.RentBusiness;

import java.util.Scanner;

public class Sys {

	public void rentMoto() {
	    //Bus & Car Type
		String[] carType = { "����", "����", "�µ�" };
		int[] busType = { 10, 32 };
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("******��ӭ�����⳵ϵͳ*******");
		System.out.println("��������Ҫ�⳵��������");
		int day = input.nextInt();
		System.out.println("1��car or 2��bus or 3��Exit");
		int selOne = input.nextInt();
//		int num=1;
		int selCar;
		int selBus;
		if (selOne == 1) {
			do{
			int[] feeArray;
			System.out.println("type�� 1��bmw 2��benc 3��audi 4��Exit");
			selCar = input.nextInt();
//			num++;
			Moto moto = new Car();//"³ B88888"
			((Car) moto).setType(carType[selCar - 1]);
			// �������
			double totalFee = moto.rentFee(day);
			// ������
			System.out.println(carType[selCar - 1]+"\t"+"����"+day+"��\t" + "�ܼ۸�:"+totalFee);
			}while(selCar!=4);{
			System.out.println("Exit,Thank you!");
			}
		} else if(selOne==2){
			do{
			System.out.println("seatCount 1�� < 16 2�� > 16 3��Exit");
			selBus = input.nextInt();
			Moto moto = new Bus();//"³ A88888"
		    ((Bus) moto).setSeatCount(busType[selBus - 1]);
			// �������
			double totalFee = moto.rentFee(day);
			// ������
			System.out.println(busType[selBus - 1]+"\t"+"����"+day+"��\t" + "�ܼ۸�:"+totalFee);
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
