package 스레드;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadGraphic1 extends JFrame{

	//static이라고 붙으면 객체 생성하지 않아도 cpu가 바로 호출해서 사용할 수 있음.(ex.main)
	//멤버변수가 있으면 static메서드에서 바로 사용 불가능. 무조건 new로 객체생성 후 접근가능
	//전역변수에도 static을 붙여주면 객체생성하지 않아도 static메서드 안에서 접근 가능
	//Ram에 상주하고 있음. 언제든지 cpu가 접근해서 사용 가능
	//그래서 static을 많이 사용하면 안 된다.(메모리 많이 차지함)
	
//	public void start() {
//		
//	}
//	public static void main(String[] args) {
//		ThreadGraphic1 s = new ThreadGraphic1();
//		s.start(); //메인에 안쓰고 line13 일반 메서드에서 실행하는 걸로 넘기는 것이 static안이 아니니 메모리 소비도 적고 더 좋은코드!!!
//	}
//=>이것을 ↓이렇게 생성자로 바꾸면 더더 좋은 코드!!
	
	JLabel count, image, timer; //메서드 밖에서 count.settext를 쓰기위해 전역변수로 바꿔줌
	
	public ThreadGraphic1() { //jframe을 상속받았고, 자동호출되는 생성자
		setSize(1300, 350);
		setTitle("나의 스레드 프로그램");
		//생성자안에는 윈도우빌드 에디터 안 됨...
		count = new JLabel("카운트 들어가는 부분"); //여기서 JLabel이라고 선언한것을 지워줌
		image = new JLabel();
		timer = new JLabel("타이머 들어가는 부분"); //test용 글자 지워도 됨
		add(count, BorderLayout.WEST);		
		add(image);		
		add(timer, BorderLayout.SOUTH);		
		Font font = new Font("궁서", Font.BOLD, 40);
		Font font2 = new Font("궁서", Font.BOLD, 30);
		count.setFont(font);
		timer.setFont(font2);
		
		Count2 thread1 = new Count2(); //동시처리Main3.java에 있던 것 붙여넣음
		Image2 thread2 = new Image2();
		Timer2 thread3 = new Timer2();
		thread1.start();
		thread2.start();
		thread3.start(); //메인까지 4개 돌아감
		
		setVisible(true);
	}
	
	//클래스간 변수를 공유할 목적으로 클래스 내에 클래스를 끼워넣을 수 있다.
	//내부클래스(inner class). 클래스안에 클래스를 끼워넣음
	//내부로 끼워진 클래스는 독립적으로 다른 곳에서 사용될 수 없다.
	public class Count2 extends Thread { 
		@Override //지워도됨. 표지판 같은 역할
		public void run() {
			for (int i = 1000; i >= 0; i = i - 2) { //i--(증감연산자)
				//System.out.println("count>>" + i); //콘솔에 찍히게 말고
				//↓
				count.setText("count>>" + i); //라벨에 찍히게 끼우기
				//1회 실행 후 재우기
				try {
					Thread.sleep(500); //밀리세컨드. (1/1000초)=1초/500=0.5초
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
		}
	}
	
	public class Image2 extends Thread {
		@Override
		public void run() {
			String[] list = { "1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "6.jpg", "7.jpg", "8.jpg", "9.jpg", "10.jpg" };
			for (int i = 0; i < list.length; i++) {
				//image.setText(list[i]);
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				try {
					Thread.sleep(5000); //밀리세컨드. (1/5000초)=5초
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
		}
	}
	
	public class Timer2 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				Date date = new Date(); //java.util로 import
				timer.setText(date + ""); //string만 넣을 수 있어서 date만 쓰면 타입에러. ""를 결합해서 String으로!
				try {
					Thread.sleep(1000); //밀리세컨드. (1/5000초)=5초
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
		}
	}

	public static void main(String[] args) {
		ThreadGraphic1 s = new ThreadGraphic1();
	}
	
		
}
