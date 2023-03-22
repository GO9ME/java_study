package test;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// Taxi 세팅
		Taxi taxi = new Taxi(new Point(7,5),100);
		taxi.setTaxifare(1900);
		taxi.run(1);
		
		// Truck 세팅
		Truck truck = new Truck(new Point(10,12),80);
		truck.setWeight(2000);
		truck.run(2);
		
		// 배열리스트 생성
		ArrayList<Car> arr = new ArrayList<Car>();
		arr.add(taxi);
		arr.add(truck);
		
		//출력 부분
		Car.printTitle();
		for ( Car c : arr) {
			c.print();
		}
	}

}
