package cn.qdu.edu.RentBusiness;

import java.util.Scanner;

public class Sys {
	private int totalFee;
	Moto[] motos;

	public void rentShow() {

		String[] carType = { "宝马", "奔驰", "路虎" };
		String[] busType = { "16坐", "32坐" };
		Scanner input = new Scanner(System.in);

		System.out.println("------欢迎进入租车系统-----");
		System.out.println("请选择您要租车的天数：");
		int day = input.nextInt();

		System.out.println("请输入租车的数量：");
		int num = input.nextInt();

		motos = new Moto[num];

		for (int i = 0; i < motos.length; i++) {
			System.out.println("请输入第" + (i + 1) + "辆车的车型：");
			System.out.println("请选择您要租车的类型(1.Car 2.Bus 3.Exit)：");
			int selType = input.nextInt();

			if (selType == 1) {
				System.out.println("请选择您要租车的品牌(1.宝马 2.奔驰 3.路虎)：");
				int selCar = input.nextInt();
				motos[i] = new Car();
				((Car) motos[i]).setType(carType[selCar - 1]);
				// System.out.println(carType[selCar - 1] + "\t" + day + "\t"
				// + getTotalFee());
			} else if (selType == 2) {
				System.out.println("请选择您要租车的品牌(1.16坐 2.32坐 )：");
				int selBus = input.nextInt();
				motos[i] = new Bus();
				((Bus) motos[i]).setSeatNum(busType[selBus - 1]);
				// System.out.println(busType[selBus - 1] + "\t" + day + "\t"
				// + getTotalFee());
			} else {
				System.out.println("输入错误!");
			}
		}
		calTotal(day);
	}

	public void calTotal(int day) {
		int total = 0;
		System.out.println("车型\t" + "天数\t" + "单价\t" + "总价");
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
		System.out.println("-------------所有车总价格为：" + total);

	}

	public int getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}

}
