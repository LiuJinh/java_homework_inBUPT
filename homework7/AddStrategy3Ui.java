package homework7;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.Point;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import java.util.Map.Entry;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class AddStrategy3Ui extends JInternalFrame {
	private JTable table = new JTable();
	private JTable table_1 = new JTable();
	
	private ArrayList<IPricingStrategy> mStrategies = new ArrayList<IPricingStrategy> ();
	private JTextField textField;
	private JTextField textField_1;
	
	private JComboBox comboBox = new JComboBox();
	private JComboBox comboBox_1 = new JComboBox();

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public AddStrategy3Ui() {
		setBounds(100, 100, 651, 851);
		
		JLabel label = new JLabel("\u9009\u62E9\u7B80\u5355\u7B56\u7565");
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton button = new JButton("\u786E\u8BA4\u6DFB\u52A0");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				onAddStrategy();
			}
		});
		
		
		JLabel label_1 = new JLabel("\u76EE\u524D\u5DF2\u9009\u62E9");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JButton button_1 = new JButton("\u786E\u8BA4\u5220\u9664");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				onDeleteStrategy();
			}
		});
		
		JButton button_2 = new JButton("\u63D0\u4EA4");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				onSubmitBtn();
			}
		});
		
		JLabel label_2 = new JLabel("\u7B56\u7565\u7F16\u53F7\uFF1A");
		
		JLabel label_3 = new JLabel("\u7B56\u7565\u540D\u79F0");
		
		JLabel label_4 = new JLabel("\u7B56\u7565\u653F\u7B56\uFF1A");
		
		JLabel label_5 = new JLabel("\u9002\u7528\u56FE\u4E66\u7C7B\u578B\uFF1A");
		
		JLabel label_6 = new JLabel("\u7EC4\u5408\u653F\u7B56\u6709\u4E0B\u8868\uFF1A");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		comboBox.addItem("组合策略");
		
		comboBox_1.addItem("非教材类计算机图书");
		comboBox_1.addItem("教材类图书");
		comboBox_1.addItem("连环画类图书");
		comboBox_1.addItem("养生类图书");
		comboBox_1.addItem("其他");
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(203)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_6)
							.addContainerGap())
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(label_5)
								.addContainerGap())
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_4)
									.addContainerGap())
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(label_2)
										.addComponent(label_3))
									.addGap(52)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
										.addComponent(comboBox_1, 0, 211, Short.MAX_VALUE)
										.addComponent(textField, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
										.addComponent(comboBox, 0, 211, Short.MAX_VALUE))
									.addGap(94))))))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(521, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(296, Short.MAX_VALUE)
					.addComponent(button)
					.addGap(246))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_1)
					.addContainerGap(546, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(298, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button_2)
						.addComponent(button_1))
					.addGap(244))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_5)
							.addGap(18)
							.addComponent(label_6))
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button)
					.addGap(8)
					.addComponent(label_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_1)
					.addGap(18)
					.addComponent(button_2)
					.addContainerGap(137, Short.MAX_VALUE))
		);
		
		
		table_1.setFont(new Font("宋体", Font.PLAIN, 20));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u7B56\u7565\u7F16\u53F7", "\u7B56\u7565\u540D\u79F0", "\u7B56\u7565\u7C7B\u578B", "\u9002\u7528\u56FE\u4E66\u7C7B\u578B", "\u6298\u6263\u767E\u5206\u6BD4/\u6BCF\u672C\u4F18\u60E0\u989D\u5EA6"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_1.getColumnModel().getColumn(0).setPreferredWidth(114);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(119);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(128);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(147);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(226);
		scrollPane_1.setViewportView(table_1);
		
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u7B56\u7565\u7F16\u53F7", "\u7B56\u7565\u540D\u79F0", "\u7B56\u7565\u7C7B\u578B", "\u9002\u5408\u56FE\u4E66\u7C7B\u578B", "\u6298\u6263\u767E\u5206\u6BD4/\u6BCF\u672C\u4F18\u60E0\u989D\u5EA6"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(120);
		table.getColumnModel().getColumn(1).setPreferredWidth(125);
		table.getColumnModel().getColumn(2).setPreferredWidth(136);
		table.getColumnModel().getColumn(3).setPreferredWidth(149);
		table.getColumnModel().getColumn(4).setPreferredWidth(262);
		table.setFont(new Font("宋体", Font.PLAIN, 20));
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);
		
		table.setRowHeight(22);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS); 
		
		table_1.setRowHeight(22);
		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS); 

		initTable1();
		initTable2();
	}

	protected void onSubmitBtn() {
		// TODO Auto-generated method stub
		if(!textField.getText().equals("")&&!textField_1.getText().equals("")){
			if(mStrategies.size()!=0){
				if(MainUi.controller.strateCatalog.allStrategies.get(textField.getText())==null){
					MainUi.controller.addCompositeStrategy(textField.getText(), textField_1.getText(), comboBox.getSelectedItem().toString(), comboBox_1.getSelectedIndex(), mStrategies);
					JOptionPane.showConfirmDialog(null, "添加成功");
					
					textField.setText("");
					textField_1.setText("");
					mStrategies.clear();
					initTable2();
				}				
				else
					JOptionPane.showConfirmDialog(null, "该策略编号已存在，请重新输入编号");
			}
			else{
				JOptionPane.showConfirmDialog(null, "请添加简单策略");
			}
		}
		else
			JOptionPane.showConfirmDialog(null, "请输入正确信息");
	}

	private void initTable2() {
		// TODO Auto-generated method stub
		DefaultTableModel dtm = (DefaultTableModel)table_1.getModel();
		dtm.setRowCount(0);		
		for(int i=0;i<mStrategies.size();i++){
			Vector v1 = new Vector();
			v1.add(mStrategies.get(i).getId());
			v1.add(mStrategies.get(i).getName());
			v1.add(mStrategies.get(i).getType());
			v1.add(mStrategies.get(i).bookTypeToString());
			v1.add(mStrategies.get(i).profitToString());
			dtm.addRow(v1);
		}
	}

	private void initTable1() {
		// TODO Auto-generated method stub
		DefaultTableModel dtm = (DefaultTableModel)table.getModel();
		dtm.setRowCount(0);	
		for(Entry<String,IPricingStrategy> entry:MainUi.controller.strateCatalog.allStrategies.entrySet()){		 
			
			if(entry.getValue().getType()!="组合策略") //增加
				
			{
				Vector v1 = new Vector();
				v1.add(entry.getKey());
				v1.add(entry.getValue().getName());
				v1.add(entry.getValue().getType());
				v1.add(entry.getValue().bookTypeToString());
				v1.add(entry.getValue().profitToString());
				dtm.addRow(v1);
				System.out.println(entry.getValue().bookTypeToString());
			}
		}
	}

	protected void onDeleteStrategy() {
		// TODO Auto-generated method stub	
		if(table_1.getSelectedRow()>=0){
			int row = table_1.getSelectedRow();
			mStrategies.remove(row);
			initTable2();
		}					
	}

	protected void onAddStrategy() {
		// TODO Auto-generated method stub
		if(table.getSelectedRow()>=0){
			DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
			int row = table.getSelectedRow();
			System.out.println(row);
			String temp = tableModel.getValueAt(row, 0).toString();
			System.out.println(temp);
			IPricingStrategy newStrategy = MainUi.controller.strateCatalog.allStrategies.get(temp);
			mStrategies.add(newStrategy);
			
			DefaultTableModel dtm = (DefaultTableModel)table_1.getModel();
			Vector v1 = new Vector();
			v1.add(newStrategy.getId());
			v1.add(newStrategy.getName());
			v1.add(newStrategy.getType());
			v1.add(newStrategy.bookTypeToString());
			v1.add(newStrategy.profitToString());
			dtm.addRow(v1);
		}
	}
}
