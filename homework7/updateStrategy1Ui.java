package homework7;

import java.awt.EventQueue;
import java.awt.Point;
import java.util.Vector;
import java.util.Map.Entry;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class updateStrategy1Ui extends JInternalFrame {
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox comboBox = new JComboBox();
	private JLabel lblNewLabel = new JLabel("\u65E0");

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public updateStrategy1Ui() {
		setBounds(100, 100, 860, 629);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel label = new JLabel("\u9009\u62E9\u66F4\u65B0\u7684\u767E\u5206\u6BD4\u4F18\u60E0\u7B56\u7565\u7F16\u53F7\u4E3A\uFF1A");
				
		JLabel label_1 = new JLabel("\u66F4\u6539\u7B56\u7565\u540D\u79F0\uFF1A");
		
		JLabel label_2 = new JLabel("\u66F4\u6539\u9002\u7528\u56FE\u4E66\u7C7B\u578B\uFF1A");
		
		JLabel label_3 = new JLabel("\u66F4\u6539\u6298\u6263\u767E\u5206\u6BD4\uFF1A");
		
		textField = new JTextField();
		textField.setColumns(10);		
		
		comboBox.addItem("非教材类计算机图书");
		comboBox.addItem("教材类图书");
		comboBox.addItem("连环画类图书");
		comboBox.addItem("养生类图书");
		comboBox.addItem("其他");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton button = new JButton("\u786E\u8BA4\u4FEE\u6539");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				onSubmitBtn();
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 845, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(button)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(143)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(label_2)
												.addComponent(label_3)))
										.addComponent(label_1))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textField, GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
										.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
										.addComponent(comboBox, 0, 266, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGap(313))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(176)
							.addComponent(label)
							.addGap(137)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(lblNewLabel))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(36)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_3)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_2)))
					.addPreferredGap(ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
					.addComponent(button)
					.addGap(38))
		);
		
		table = new JTable();
		table.setFont(new Font("宋体", Font.PLAIN, 20));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				onChoseBook(arg0);
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u7B56\u7565\u7F16\u53F7", "\u7B56\u7565\u540D\u79F0", "\u7B56\u7565\u7C7B\u578B", "\u9002\u7528\u56FE\u4E66\u7C7B\u578B", "\u6298\u6263\u767E\u5206\u6BD4/\u6BCF\u672C\u4F18\u60E0\u653F\u7B56"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(123);
		table.getColumnModel().getColumn(1).setPreferredWidth(126);
		table.getColumnModel().getColumn(2).setPreferredWidth(134);
		table.getColumnModel().getColumn(3).setPreferredWidth(107);
		table.getColumnModel().getColumn(4).setPreferredWidth(238);
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);
		
		table.setRowHeight(25);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 

		initTable();
	}

	protected void onSubmitBtn() {
		// TODO Auto-generated method stub
		if(table.getSelectedRow()>=0&&!textField.getText().equals("")&&StringUtil.isInteger(textField_1.getText())&&Integer.parseInt(textField_1.getText())<100&&Integer.parseInt(textField_1.getText())>0){
			PercentageStrategy newStrategy = new PercentageStrategy(lblNewLabel.getText(),textField.getText(),comboBox.getSelectedIndex(),Integer.parseInt(textField_1.getText()));
			MainUi.controller.updateStrategy(lblNewLabel.getText(), newStrategy);
			JOptionPane.showConfirmDialog(null, "修改成功");
			int row = table.getSelectedRow();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			System.out.println(textField.getText());
			model.setValueAt(textField.getText(), row, 1);
			model.setValueAt(comboBox.getSelectedIndex(), row, 3);
			model.setValueAt(textField_1.getText(), row, 4);
			textField.setText("");
			textField_1.setText("");
		}
		else if(table.getSelectedRow()<0){
			JOptionPane.showConfirmDialog(null, "请选择要修改的策略");
		}
		
		else if(textField.getText().equals(""))
			JOptionPane.showConfirmDialog(null, "请输入修改后的策略名称");
		else
			JOptionPane.showConfirmDialog(null, "请输入合适的百分比0-100整数");
	}

	protected void onChoseBook(MouseEvent arg0) {
		// TODO Auto-generated method stub
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		Point mousepoint;                     
        mousepoint =arg0.getPoint();
		int row = table.rowAtPoint(mousepoint);
		String id = (String)tableModel.getValueAt(row, 0).toString();
		System.out.println(id);
		lblNewLabel.setText(id);
	}

	private void initTable() {
		// TODO Auto-generated method stub
		DefaultTableModel dtm = (DefaultTableModel)table.getModel();
		dtm.setRowCount(0);
	
		for(Entry<String,IPricingStrategy> entry:MainUi.controller.strateCatalog.allStrategies.entrySet()){		
			if(entry.getValue().getType() == "百分比优惠策略"){
				Vector v1 = new Vector();
				v1.add(entry.getKey());
				v1.add(entry.getValue().getName());
				v1.add(entry.getValue().getType());
				v1.add(entry.getValue().bookTypeToString());
				v1.add(entry.getValue().profitToString());
				dtm.addRow(v1);
			}			
		}
	}
}
