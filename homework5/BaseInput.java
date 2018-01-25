package homework5;

import util.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BaseInput extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the dialog.
	 */
	public BaseInput() {
		
		setModal(true);
		setBounds(100, 100, 526, 474);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("id:");
			lblNewLabel.setBounds(98, 89, 106, 18);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("firstName:");
			lblNewLabel_1.setBounds(98, 135, 106, 18);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("lastName:");
			lblNewLabel_2.setBounds(98, 178, 106, 18);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("baseSalary:");
			lblNewLabel_3.setBounds(98, 221, 106, 18);
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("grossSales:");
			lblNewLabel_4.setBounds(98, 268, 106, 18);
			contentPanel.add(lblNewLabel_4);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("commissionRate:");
			lblNewLabel_5.setBounds(98, 315, 120, 18);
			contentPanel.add(lblNewLabel_5);
		}
		{
			textField = new JTextField();
			textField.setBounds(235, 86, 157, 24);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(235, 132, 157, 24);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(235, 175, 157, 24);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			textField_3 = new JTextField();
			textField_3.setBounds(235, 221, 157, 24);
			contentPanel.add(textField_3);
			textField_3.setColumns(10);
		}
		{
			textField_4 = new JTextField();
			textField_4.setBounds(235, 265, 157, 24);
			contentPanel.add(textField_4);
			textField_4.setColumns(10);
		}
		{
			textField_5 = new JTextField();
			textField_5.setBounds(235, 312, 157, 24);
			contentPanel.add(textField_5);
			textField_5.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						onSubmitBtn(e);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	protected void onSubmitBtn(ActionEvent e) {
		// TODO Auto-generated method stub
		if(StringUtil.isStr(textField_1.getText())&&StringUtil.isStr(textField_2.getText())
				&&StringUtil.isNumber(textField_3.getText())&&StringUtil.isNumber(textField_4.getText())
				&&StringUtil.isInteger(textField.getText())&&Double.parseDouble(textField_5.getText())<1
				&&StringUtil.isDouble(textField_5.getText())){
			Employee new1 = new BasePlusCommisionEmployee(textField_1.getText(),textField_2.getText(),textField.getText(),
					Double.parseDouble(textField_4.getText()),Double.parseDouble(textField_5.getText()),Double.parseDouble(textField_3.getText()));
			Employee new2 = MainWindow.mFa.addEmployee(new1);
			
			if(new2 == null){
				JOptionPane.showConfirmDialog(null, "已存在该用户","fail",JOptionPane.ERROR_MESSAGE);
			}
			else{
				JOptionPane.showConfirmDialog(null, "添加成功","success",JOptionPane.ERROR_MESSAGE);
			}
			textField.setText("");
			textField_1.setText("");
			textField_2.setText("");
			textField_3.setText("");
			textField_4.setText("");
			textField_5.setText("");
		}		
		else{
			String error = "";
			if(!StringUtil.isStr(textField.getText())||!StringUtil.isInteger(textField.getText()))
				error += "请输入纯数字id"+"\n";
			if(!StringUtil.isStr(textField_1.getText())){
				error += "请输入正确的firstName"+"\n";
			}
			if(!StringUtil.isStr(textField_2.getText()))
				error += "请输入正确的lastName"+"\n";	
			if(!StringUtil.isNumber(textField_3.getText()))
				error += "请输入正数baseSalary"+"\n";
			if(!StringUtil.isNumber(textField_4.getText()))
				error += "请输入正数grossSales"+"\n";
			if(!StringUtil.isNumber(textField_5.getText())||!(Double.parseDouble(textField_5.getText())<1))
				error += "请输入0-1的浮点数commisionRate"+"\n";
				
			JOptionPane.showConfirmDialog(null, error,"fail",JOptionPane.ERROR_MESSAGE);
		}
	}

}
