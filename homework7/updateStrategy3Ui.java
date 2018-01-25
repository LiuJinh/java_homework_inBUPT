package homework7;

import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Map.Entry;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.Font;

public class updateStrategy3Ui extends JInternalFrame {
	private JTable table;
	private JTextField textField;
	private JTable table_1;
	private JTable table_2;
	
	private JLabel label_1 = new JLabel("\u65E0");
	private JComboBox comboBox = new JComboBox();

	private ArrayList<IPricingStrategy> mStrategies = null;
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public updateStrategy3Ui() {
		setBounds(100, 100, 837, 751);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel label = new JLabel("\u9009\u62E9\u7EC4\u5408\u7B56\u7565\u66F4\u6539\u7684\u7F16\u53F7\uFF1A");	
		
		JLabel label_2 = new JLabel("\u66F4\u6539\u7B56\u7565\u540D\u79F0\uFF1A");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel label_3 = new JLabel("\u66F4\u6539\u9002\u7528\u56FE\u4E66\u7C7B\u578B\uFF1A");
		
		JLabel label_4 = new JLabel("\u66F4\u6539\u7EC4\u6210\u7684\u7B80\u5355\u7B56\u7565");
		
		JLabel label_5 = new JLabel("\u9009\u62E9\uFF1A");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JLabel label_6 = new JLabel("\u5DF2\u9009\u62E9\uFF1A");
		
		comboBox.addItem("非教材类计算机图书");
		comboBox.addItem("教材类图书");
		comboBox.addItem("连环画类图书");
		comboBox.addItem("养生类图书");
		comboBox.addItem("其他");
		
		JScrollPane scrollPane_2 = new JScrollPane();
		
		JButton button = new JButton("\u786E\u8BA4\u6DFB\u52A0");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				onAddStrategy();
			}
		});
		
		JButton button_1 = new JButton("\u786E\u8BA4\u5220\u9664");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				onDeleteStrategy();
			}
		});
		
		JButton button_2 = new JButton("\u786E\u8BA4\u4FEE\u6539");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				onSubmitBtn();
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(259)
							.addComponent(label))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
							.addGap(84)
							.addComponent(label_3)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(169, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_4)
					.addContainerGap(700, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_5)
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(21)
							.addComponent(label_6))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(122)
					.addComponent(button)
					.addPreferredGap(ComponentPlacement.RELATED, 345, Short.MAX_VALUE)
					.addComponent(button_1)
					.addGap(161))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(368)
					.addComponent(button_2)
					.addContainerGap(373, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(label_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(label_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_5)
						.addComponent(label_6))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button)
						.addComponent(button_1))
					.addGap(4)
					.addComponent(button_2)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		
		table_2 = new JTable();
		table_2.setFont(new Font("宋体", Font.PLAIN, 20));
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u7B56\u7565\u7F16\u53F7", "\u7B56\u7565\u7C7B\u578B", "\u767E\u5206\u6BD4/\u5355\u672C\u4F18\u60E0"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_2.getColumnModel().getColumn(0).setPreferredWidth(115);
		table_2.getColumnModel().getColumn(1).setPreferredWidth(125);
		table_2.getColumnModel().getColumn(2).setPreferredWidth(172);
		scrollPane_2.setViewportView(table_2);
		
		table_1 = new JTable();
		table_1.setFont(new Font("宋体", Font.PLAIN, 20));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u7B56\u7565\u7F16\u53F7", "\u7B56\u7565\u7C7B\u578B", "\u767E\u5206\u6BD4/\u5355\u672C\u4F18\u60E0"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_1.getColumnModel().getColumn(0).setPreferredWidth(86);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(123);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(168);
		scrollPane_1.setViewportView(table_1);
		
		table = new JTable();
		table.setFont(new Font("宋体", Font.PLAIN, 20));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				onChoseBook(e);
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u7B56\u7565\u7F16\u53F7", "\u7B56\u7565\u540D\u79F0", "\u7B56\u7565\u7C7B\u578B", "\u9002\u5408\u56FE\u4E66\u7C7B\u578B", "\u6784\u6210\u7B80\u5355\u7B56\u7565"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, true, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(124);
		table.getColumnModel().getColumn(1).setPreferredWidth(121);
		table.getColumnModel().getColumn(2).setPreferredWidth(126);
		table.getColumnModel().getColumn(3).setPreferredWidth(122);
		table.getColumnModel().getColumn(4).setPreferredWidth(252);
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);

		table_1.setRowHeight(22);
		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 
		table_2.setRowHeight(22);
		table_2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 
		table.setRowHeight(22);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 
		
		initTable1();
	}
	
	private void initTable3() {
		// TODO Auto-generated method stub
		DefaultTableModel dtm = (DefaultTableModel)table_2.getModel();
		dtm.setRowCount(0);		
		for(int i=0;i<mStrategies.size();i++){
			Vector v1 = new Vector();
			v1.add(mStrategies.get(i).getId());
			v1.add(mStrategies.get(i).getType());
			v1.add(mStrategies.get(i).profitToString());
			dtm.addRow(v1);
		}
	}

	private void initTable2() {
		// TODO Auto-generated method stub
		DefaultTableModel dtm = (DefaultTableModel)table_1.getModel();
		dtm.setRowCount(0);	
		for(Entry<String,IPricingStrategy> entry:MainUi.controller.strateCatalog.allStrategies.entrySet()){		 
			
			if(entry.getValue().getType()!="组合策略") //增加
				
			{
				Vector v1 = new Vector();
				v1.add(entry.getKey());
				v1.add(entry.getValue().getType());
				v1.add(entry.getValue().profitToString());
				dtm.addRow(v1);
			}
		}
	}

	private void initTable1() {
		// TODO Auto-generated method stub
		DefaultTableModel dtm = (DefaultTableModel)table.getModel();
		dtm.setRowCount(0);
	
		for(Entry<String,IPricingStrategy> entry:MainUi.controller.strateCatalog.allStrategies.entrySet()){		
			if(entry.getValue().getType() == "组合策略"){
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
	
	protected void onSubmitBtn() {
		// TODO Auto-generated method stub
		if(table.getSelectedRow()>=0&&!textField.getText().equals("")&&mStrategies!=null&&mStrategies.size()!=0){
			CopositeStrategy newStrategy = new CopositeStrategy(label_1.getText(),textField.getText(),comboBox.getSelectedIndex(),mStrategies);
			MainUi.controller.updateStrategy(label_1.getText(), newStrategy);
			JOptionPane.showConfirmDialog(null, "修改成功");
			int row = table.getSelectedRow();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			System.out.println(textField.getText());
			model.setValueAt(textField.getText(), row, 1);
			model.setValueAt(comboBox.getSelectedIndex(), row, 3);
			model.setValueAt(newStrategy.profitToString(), row, 4);
			textField.setText("");
			initTable3();
		}
		else if(table.getSelectedRow()<0){
			JOptionPane.showConfirmDialog(null, "请选择要修改的策略");
		}
		
		else if(textField.getText().equals(""))
			JOptionPane.showConfirmDialog(null, "请输入修改后的策略名称");
		else
			JOptionPane.showConfirmDialog(null, "请至少选择一种简单策略");
	}

	protected void onChoseBook(MouseEvent arg0) {
		// TODO Auto-generated method stub
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		Point mousepoint;                     
        mousepoint =arg0.getPoint();
		int row = table.rowAtPoint(mousepoint);
		String id = (String)tableModel.getValueAt(row, 0).toString();
		System.out.println(id);
		label_1.setText(id);
		mStrategies = ((CopositeStrategy)MainUi.controller.strateCatalog.allStrategies.get(id)).strategies;
		initTable2();
		initTable3();
	}

	protected void onDeleteStrategy() {
		// TODO Auto-generated method stub		
		int row = table_2.getSelectedRow();
		mStrategies.remove(row);
		initTable3();			
	}

	protected void onAddStrategy() {
		// TODO Auto-generated method stub
		DefaultTableModel tableModel = (DefaultTableModel) table_1.getModel();
		int row = table_1.getSelectedRow();
		System.out.println(row);
		String temp = tableModel.getValueAt(row, 0).toString();
		System.out.println(temp);
		IPricingStrategy newStrategy = MainUi.controller.strateCatalog.allStrategies.get(temp);
		mStrategies.add(newStrategy);
		
		DefaultTableModel dtm = (DefaultTableModel)table_2.getModel();
		Vector v1 = new Vector();
		v1.add(newStrategy.getId());
		v1.add(newStrategy.getType());
		v1.add(newStrategy.profitToString());
		dtm.addRow(v1);
	}
}
