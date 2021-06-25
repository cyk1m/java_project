package 문제풀이;
// 버튼은 맨 마지막에 만든다. 그래야 입력화면이 먼저 구현 된 뒤 입력값을 버튼을 통해 쓸 수 있기 때문.
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽문제 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(102, 205, 170));
		f.setSize(473, 495);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel.setBounds(47, 42, 146, 39);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_1.setBounds(47, 153, 146, 30);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("국어 점수");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_2.setBounds(47, 277, 146, 18);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("수학 점수");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_3.setBounds(47, 315, 146, 30);
		f.getContentPane().add(lblNewLabel_3);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 228, 196));
		t1.setBounds(229, 52, 206, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(new Color(255, 192, 203));
		t2.setColumns(10);
		t2.setBounds(229, 159, 206, 21);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setBackground(new Color(173, 216, 230));
		t3.setColumns(10);
		t3.setBounds(229, 277, 206, 21);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setBackground(new Color(173, 216, 230));
		t4.setColumns(10);
		t4.setBounds(229, 321, 206, 21);
		f.getContentPane().add(t4);
		
		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을 때 자동으로 이 함수가 실행
				// 버튼을 클릭했을 때 처리내용을 넣으면 됨.
				String s1 = t1.getText(); // 아메리카노
				String s2 = "아메리카노";
				String s3 = "홍차";
				String s4 = "주스";					
				
				if (s1.equals(s2) || s1.equals(s3) || s1.equals(s4)) {
					JOptionPane.showMessageDialog(f, "카페로 가자.");
				} else {
					JOptionPane.showMessageDialog(f, "알아서 마셔.");
				}
			}
		});
		btnNewButton.setBounds(47, 91, 388, 34);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("나의 내년나이는?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String age = t2.getText();
				int age2 = Integer.parseInt(age);
				JOptionPane.showMessageDialog(f, age2 + 1);				
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 14));
		btnNewButton_1.setBounds(47, 213, 388, 30);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("두 과목 점수의 평균은?");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String kor = t3.getText();
				String math = t4.getText();
				int kor2 = Integer.parseInt(kor);
				int math2 = Integer.parseInt(math);
				double avg = (kor2 + math2) / 2.0;
				JOptionPane.showMessageDialog(f, avg);						
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 14));
		btnNewButton_2.setBounds(47, 375, 388, 30);
		f.getContentPane().add(btnNewButton_2);
		
		
		f.getContentPane().add(t1);
		
		
		
		f.setVisible(true);

	}
}
