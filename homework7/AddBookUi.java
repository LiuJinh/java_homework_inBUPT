package homework7;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class AddBookUi extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	private JComboBox comboBox = new JComboBox();
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public AddBookUi() {
		setClosable(true);
		setBounds(100, 100, 636, 537);
		
		JLabel lblNewLabel = new JLabel("isbn:");
		
		JLabel lblNewLabel_1 = new JLabel("\u4E66\u540D:");
		
		JLabel lblNewLabel_2 = new JLabel("\u5355\u4EF7:");
		
		JLabel lblNewLabel_3 = new JLabel("\u4E66\u7C7B:");
		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 18));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_2.setColumns(10);
		
		
		comboBox.setFont(new Font("宋体", Font.PLAIN, 20));
		
		comboBox.addItem("非教材类计算机图书");
		comboBox.addItem("教材类图书");
		comboBox.addItem("连环画类图书");
		comboBox.addItem("养生类图书");
		comboBox.addItem("其他");
		
		JButton button = new JButton("\u91CD\u7F6E");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				onResetPerform();
			}
		});
		
		JButton button_1 = new JButton("\u786E\u8BA4");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onSubmitPerform();
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(118)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(42)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(42)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(42)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(42)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addGap(103)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(111)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(lblNewLabel))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(lblNewLabel_1))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(lblNewLabel_2))
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(lblNewLabel_3))
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(65)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button)
						.addComponent(button_1)))
		);
		getContentPane().setLayout(groupLayout);

	}

	protected void onSubmitPerform() {
		// TODO Auto-generated method stub
		String bookIsbn = this.textField.getText();
		String bookName = this.textField_1.getText();
		double bookPrice = 0;
		
		if(StringUtil.isStr(this.textField.getText())&&StringUtil.isStr(this.textField_1.getText())&&
				StringUtil.isNumber(this.textField_2.getText()))
		{
			int bookType = comboBox.getSelectedIndex();
			bookPrice = Double.parseDouble(this.textField_2.getText());
			
			MainUi.controller.addBook(bookIsbn,bookName,bookPrice,bookType);
			JOptionPane.showConfirmDialog(null, "图书添加成功");
			onResetPerform();
			return;
		}
		
		String error = "";
		if(StringUtil.isNumber(this.textField_2.getText())){
			bookPrice = Double.parseDouble(this.textField_2.getText());
		}
		else{
			error+="price请输入正数"+"\n";
			
		}
		
		if(!StringUtil.isStr(this.textField.getText())){
			error+="请输入isbn\n";
		}
		
		if(!StringUtil.isStr(this.textField_1.getText())){
			error+="请输入书名\n";
		}
		
		if(!error.equals(""))
			JOptionPane.showConfirmDialog(null, error);
	}

	protected void onResetPerform() {
		// TODO Auto-generated method stub
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
	}
}
