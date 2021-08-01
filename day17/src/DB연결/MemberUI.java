package DB연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(95, 158, 160));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 30));
		lblNewLabel.setBounds(37, 54, 139, 43);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 35));
		t1.setBounds(189, 54, 228, 43);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 35));
		t2.setColumns(10);
		t2.setBounds(189, 126, 228, 43);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 30));
		lblNewLabel_1.setBounds(37, 126, 139, 43);
		f.getContentPane().add(lblNewLabel_1);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.BOLD, 35));
		t3.setColumns(10);
		t3.setBounds(189, 198, 228, 43);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 30));
		lblNewLabel_2.setBounds(37, 198, 139, 43);
		f.getContentPane().add(lblNewLabel_2);
		
		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.BOLD, 35));
		t4.setColumns(10);
		t4.setBounds(189, 275, 228, 43);
		f.getContentPane().add(t4);
		
		JLabel lblNewLabel_3 = new JLabel("전화번호");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 30));
		lblNewLabel_3.setBounds(37, 275, 139, 43);
		f.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("가입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// t1~t4에 입력된 값을 가지고 와야 함.
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				// member 테이블에 저장 하려고 함.
				// => 해결책, 우리가 원하는 기능을 가진 메소드를 가지고 있는
				// 부품을 찾아 램에 가져다 놓으면 됨.
				MemberDB db = new MemberDB();
				try {
					int result = db.create(id, pw, name, tel); //1
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "회원가입 성공");
					} else {
						JOptionPane.showMessageDialog(f, "회원가입 실패");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				// 입력한 거 지워버리자!
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 30));
		btnNewButton.setBounds(46, 354, 105, 78);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("탈퇴");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//★★id를 입력받아야함
				String id = JOptionPane.showInputDialog("탈퇴할 id 입력");
				//db처리해야함.
				MemberDB db = new MemberDB();
				try {
					int result = db.delete(id);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "탈퇴 성공");
					} else {
						JOptionPane.showMessageDialog(f, "없는 아이디입니다.");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 30));
		btnNewButton_1.setBounds(197, 354, 105, 78);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("수정");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("수정할 아이디 입력");
				String tel = JOptionPane.showInputDialog("수정할 전화번호 입력");
				MemberDB db = new MemberDB();
				try {
					int result = db.update(id, tel);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "수정 성공");
					} else {
						JOptionPane.showMessageDialog(f, "수정 실패");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 30));
		btnNewButton_2.setBounds(343, 354, 105, 78);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
	}

}
