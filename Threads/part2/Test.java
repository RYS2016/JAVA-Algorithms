public class Test {

	public static void main(String[] args) {
		SharedResults test= new SharedResults();
		LongTask t1 = new LongTask(test, 1, 100, 0);
		t1.start();
		LongTask t2 = new LongTask(test, 101, 200, 1);
		t2.start();
		LongTask t3 = new LongTask(test, 201, 300, 2);
		t3.start();
		LongTask t4 = new LongTask(test, 301, 400, 3);
		t4.start();
		LongTask t5 = new LongTask(test, 401, 500, 4);
		t5.start();
		LongTask t6 = new LongTask(test, 501, 600, 5);
		t6.start();
		LongTask t7 = new LongTask(test, 601, 700, 6);
		t7.start();
		LongTask t8 = new LongTask(test, 701, 800, 7);
		t8.start();
		LongTask t9 = new LongTask(test, 801, 900, 8);
		t9.start();
		LongTask t10 = new LongTask(test, 901, 1000, 9);
		t10.start();
		LongTask t11 = new LongTask(test, 1001, 1100, 10);
		t11.start();
		LongTask t12 = new LongTask(test, 1101, 1200, 11);
		t12.start();
		LongTask t13 = new LongTask(test, 1201, 1300, 12);
		t13.start();
		LongTask t14 = new LongTask(test, 1301, 1400, 13);
		t14.start();
		LongTask t15 = new LongTask(test, 1401, 1500, 14);
		t15.start();
		LongTask t16 = new LongTask(test, 1501, 1600, 15);
		t16.start();
		LongTask t17 = new LongTask(test, 1601, 1700, 16);
		t17.start();
		LongTask t18 = new LongTask(test, 1701, 1800, 17);
		t18.start();
		LongTask t19 = new LongTask(test, 1801, 1900, 18);
		t19.start();
		LongTask t20 = new LongTask(test, 1901, 2000, 19);
		t20.start();
		LongTask t21 = new LongTask(test, 2001, 2100, 20);
		t21.start();
		LongTask t22 = new LongTask(test, 2101, 2200, 21);
		t22.start();
		LongTask t23 = new LongTask(test, 2201, 2300, 22);
		t23.start();
		LongTask t24 = new LongTask(test, 2301, 2400, 23);
		t24.start();
		LongTask t25 = new LongTask(test, 2401, 2500, 24);
		t25.start();
		LongTask t26 = new LongTask(test, 2501, 2600, 25);
		t26.start();
	
		
	try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			t6.join();
			t7.join();
			t8.join();
			t9.join();
			t10.join();
			t11.join();
			t12.join();
			t13.join();
			t14.join();
			t15.join();
			t16.join();
			t17.join();
			t18.join();
			t19.join();
			t20.join();
			t21.join();
			t22.join();
			t23.join();
			t24.join();
			t25.join();
			t26.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Result = " + (test.getResult()));	
	}

}