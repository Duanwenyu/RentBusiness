package cn.qdu.edu.RentBusiness;

import java.util.Scanner;

public class Sys {
	private int totalFee;
	Moto[] motos;

	public void rentShow() {

		String[] carType = { "����", "����", "·��" };
		String[] busType = { "16��", "32��" };
		Scanner input = new Scanner(System.in);

		System.out.println("------��ӭ�����⳵ϵͳ-----");
		System.out.println("��ѡ����Ҫ�⳵��������");
		int day = input.nextInt();

		System.out.println("�������⳵��������");
		int num = input.nextInt();

		motos = new Moto[num];

		for (int i = 0; i < motos.length; i++) {
			System.out.println("�������" + (i + 1) + "�����ĳ��ͣ�");
			System.out.println("��ѡ����Ҫ�⳵������(1.Car 2.Bus 3.Exit)��");
			int selType = input.nextInt();

			if (selType == 1) {
				System.out.println("��ѡ����Ҫ�⳵��Ʒ��(1.���� 2.���� 3.·��)��");
				int selCar = input.nextInt();
				motos[i] = new Car();
				((Car) motos[i]).setType(carType[selCar - 1]);
				// System.out.println(carType[selCar - 1] + "\t" + day + "\t"
				// + getTotalFee());
			} else if (selType == 2) {
				System.out.println("��ѡ����Ҫ�⳵��Ʒ��(1.16�� 2.32�� )��");
				int selBus = input.nextInt();
				motos[i] = new Bus();
				((Bus) motos[i]).setSeatNum(busType[selBus - 1]);
				// System.out.println(busType[selBus - 1] + "\t" + day + "\t"
				// + getTotalFee());
			} else {
				System.out.println("�������!");
			}
		}
		calTotal(day);
	}

	public void calTotal(int day) {
		int total = 0;
		System.out.println("����\t" + "����\t" + "����\t" + "�ܼ�");
		for (int i = 0; i < motos.length; i++) {
			total = total + motos[i].rentFee(day);
			if (motos[i] instanceof Car) {
				System.out.println(((Car) motos[i]).getType() + "\t" + day
						+ "\t" + motos[i].getFeePer() + "\t"
						+ motos[i].rentFee(day));
			} else {
				System.out.println(((Bus) motos[i]).getSeatNum() + "\t" + day
						+ "\t" + motos[i].getFeePer() + "\t"
						+ motos[i].rentFee(day));
			}
		}
		System.out.println("-------------���г��ܼ۸�Ϊ��" + total);

	}

	public int getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}

}
