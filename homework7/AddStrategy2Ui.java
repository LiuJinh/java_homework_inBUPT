package homework7;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddStrategy2Ui extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	private JComboBox comboBox = new JComboBox();	
	private JComboBox comboBox_1 = new JComboBox();

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public AddStrategy2Ui() {
		setBounds(100, 100, 760, 627);
		
		JLabel lblNewLabel = new JLabel("\u7B56\u7565\u7F16\u53F7\uFF1A");
		
		JLabel label = new JLabel("\u7B56\u7565\u540D\u79F0\uFF1A");
		
		JLabel lblNewLabel_1 = new JLabel("\u7B56\u7565\u653F\u7B56\uFF1A");
		
		JLabel label_1 = new JLabel("\u9002\u7528\u56FE\u4E66\u7C7B\u578B\uFF1A");
		
		JLabel label_2 = new JLabel("\u6BCF\u672C\u4F18\u60E0\u653F\u7B56\uFF1A");
		
		JLabel label_3 = new JLabel("");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JButton button = new JButton("\u63D0\u4EA4");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				onAddBtn();
			}
		});
		
		comboBox.addItem("绝对值折扣策略");
		
		comboBox_1.addItem("非教材类计算机图书");
		comboBox_1.addItem("教材类图书");
		comboBox_1.addItem("连环画类图书");
		comboBox_1.addItem("养生类图书");
		comboBox_1.addItem("其他");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(213)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addGap(39)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(213)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addGap(39)
							.addComponent(textField_1))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(213)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addGap(39)
							.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(99)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(42)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addGap(20)
							.addComponent(comboBox_1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(213)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addGap(20)
							.addComponent(textField_2)))
					.addGap(192))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(363, Short.MAX_VALUE)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addGap(295))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(151)
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(148)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(38)
							.addComponent(label))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(35)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(35)
							.addComponent(lblNewLabel_1))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(32)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(label_1))
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(36)
							.addComponent(label_2))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(33)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(151)
					.addComponent(button)
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);

	}

	protected void onAddBtn() {
		// TODO Auto-generated method stub
		if(!textField.getText().equals("")&&!textField_1.getText().equals("")&&!textField_2.getText().equals("")){
			if(StringUtil.isNumber(textField_2.getText())){
				if(MainUi.controller.strateCatalog.allStrategies.get(textField.getText())==null){
					MainUi.controller.addSimpleStrategy(textField.getText(), textField_1.getText(), comboBox.getSelectedItem().toString(), comboBox_1.getSelectedIndex(), Double.parseDouble(textField_2.getText()));
					JOptionPane.showConfirmDialog(null, "添加成功");
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");	
				}
				else
					JOptionPane.showConfirmDialog(null, "该策略编号已存在，请重新输入编号");
				
			}
			else{
				JOptionPane.showConfirmDialog(null, "请输入正确绝对值策略");
			}
		}
		else
			JOptionPane.showConfirmDialog(null, "请输入正确信息");

	}
}
