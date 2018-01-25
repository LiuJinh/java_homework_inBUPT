package homework7;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddStrategy1Ui extends JInternalFrame {
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
	public AddStrategy1Ui() {
		setBounds(100, 100, 734, 638);
		
		JLabel label = new JLabel("\u7B56\u7565\u7F16\u53F7\uFF1A");
		
		JLabel label_1 = new JLabel("\u7B56\u7565\u540D\u79F0");
		
		JLabel label_2 = new JLabel("\u7B56\u7565\u653F\u7B56");
		
		JLabel label_3 = new JLabel("\u9002\u7528\u56FE\u4E66\u7C7B\u578B\uFF1A");
		
		JLabel label_4 = new JLabel("\u6298\u6263\u767E\u5206\u6BD4\uFF1A");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		
		comboBox.addItem("百分比折扣策略");
		
		comboBox_1.addItem("非教材类计算机图书");
		comboBox_1.addItem("教材类图书");
		comboBox_1.addItem("连环画类图书");
		comboBox_1.addItem("养生类图书");
		comboBox_1.addItem("其他");
		
		JButton button = new JButton("\u63D0\u4EA4");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				onAddBtn();
			}
		});
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(223)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label)
								.addComponent(label_1)
								.addComponent(label_2))
							.addGap(45)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(textField_1)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label_3)
								.addComponent(label_4))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
								.addComponent(button)
								.addComponent(comboBox_1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addContainerGap(168, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(142)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
					.addComponent(button)
					.addGap(85))
		);
		getContentPane().setLayout(groupLayout);

		
	}

	protected void onAddBtn() {
		// TODO Auto-generated method stub
		if(!textField.getText().equals("")&&!textField_1.getText().equals("")&&!textField_2.getText().equals("")){
			if(StringUtil.isInteger(textField_2.getText())&&Integer.parseInt(textField_2.getText())<100&&Integer.parseInt(textField_2.getText())>0){
				if(MainUi.controller.strateCatalog.allStrategies.get(textField.getText())==null){
					MainUi.controller.addSimpleStrategy(textField.getText(), textField_1.getText(), comboBox.getSelectedItem().toString(), comboBox_1.getSelectedIndex(), Integer.parseInt(textField_2.getText()));
					JOptionPane.showConfirmDialog(null, "添加成功");
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
				}
				else
					JOptionPane.showConfirmDialog(null, "该策略编号已存在，请重新输入编号");
			}
			else{
				JOptionPane.showConfirmDialog(null, "请输入合适百分比策略0-100整数");
			}
		}
		else
			JOptionPane.showConfirmDialog(null, "请输入正确信息");
	}
}
