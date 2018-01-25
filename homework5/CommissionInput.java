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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CommissionInput extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CommissionInput dialog = new CommissionInput();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CommissionInput() {
		setBounds(100, 100, 540, 476);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblId = new JLabel("id:");
			lblId.setBounds(93, 93, 72, 18);
			contentPanel.add(lblId);
		}
		{
			JLabel lblFirstname = new JLabel("firstName:");
			lblFirstname.setBounds(93, 139, 107, 18);
			contentPanel.add(lblFirstname);
		}
		{
			JLabel lblNewLabel = new JLabel("lastName:");
			lblNewLabel.setBounds(93, 185, 72, 18);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblGrosssales = new JLabel("grossSales:");
			lblGrosssales.setBounds(93, 227, 88, 18);
			contentPanel.add(lblGrosssales);
		}
		{
			JLabel lblCommisionrate = new JLabel("commisionRate:");
			lblCommisionrate.setBounds(93, 268, 127, 25);
			contentPanel.add(lblCommisionrate);
		}
		{
			textField = new JTextField();
			textField.setBounds(222, 90, 162, 25);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(222, 136, 162, 25);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(222, 182, 162, 25);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			textField_3 = new JTextField();
			textField_3.setBounds(222, 224, 162, 25);
			contentPanel.add(textField_3);
			textField_3.setColumns(10);
		}
		{
			textField_4 = new JTextField();
			textField_4.setBounds(222, 268, 162, 25);
			contentPanel.add(textField_4);
			textField_4.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						onSubmitBtn(e);
					}

				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	protected void onSubmitBtn(MouseEvent e) {
		// TODO Auto-generated method stub
		if(StringUtil.isStr(textField_1.getText())&&StringUtil.isStr(textField_2.getText())
				&&StringUtil.isNumber(textField_3.getText())
				&&StringUtil.isInteger(textField.getText())&&Double.parseDouble(textField_4.getText())<1
				&&StringUtil.isDouble(textField_4.getText())){
			Employee new1 = new CommisionEmployee(textField_1.getText(),textField_2.getText(),textField.getText(),
					Double.parseDouble(textField_3.getText()),Double.parseDouble(textField_4.getText()));
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
				error += "请输入正数grossSale"+"\n";
			if(!StringUtil.isNumber(textField_4.getText())||Double.parseDouble(textField_4.getText())>=1)
				error += "请输入0-1的浮点数commissionRate"+"\n";
				
			JOptionPane.showConfirmDialog(null, error,"fail",JOptionPane.ERROR_MESSAGE);
		}
	}

}
