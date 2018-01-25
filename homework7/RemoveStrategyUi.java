package homework7;

import java.awt.EventQueue;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Vector;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Point;

public class RemoveStrategyUi extends JInternalFrame {
	private JTable table = new JTable();;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public RemoveStrategyUi() {
		setBounds(100, 100, 823, 825);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel = new JLabel("\u7F16\u53F7\uFF1A");
		
		textField = new JTextField();
		textField.setText("");
		textField.setColumns(10);
		
		JButton button = new JButton("\u786E\u5B9A\u5220\u9664");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				onRemoveBtn();
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(107)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
							.addGap(73)
							.addComponent(button)
							.addGap(91))
						.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addContainerGap())
		);
		
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				selectItem(arg0);
			}
		});
		table.setFont(new Font("宋体", Font.PLAIN, 22));
		table.setModel(new DefaultTableModel(
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
		table.getColumnModel().getColumn(0).setPreferredWidth(125);
		table.getColumnModel().getColumn(1).setPreferredWidth(135);
		table.getColumnModel().getColumn(2).setPreferredWidth(145);
		table.getColumnModel().getColumn(3).setPreferredWidth(166);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(4).setPreferredWidth(238);
		
		table.setRowHeight(25);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);
			
		this.initTable();
	}

	protected void selectItem(MouseEvent arg0) {
		// TODO Auto-generated method stub
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		Point mousepoint;                     
        mousepoint =arg0.getPoint();
		int row = table.rowAtPoint(mousepoint);
		String id = (String)tableModel.getValueAt(row, 0).toString();
		textField.setText(id);
		
	}

	protected void onRemoveBtn() {
		// TODO Auto-generated method stub
		if(textField.getText().equals("")){
			JOptionPane.showConfirmDialog(null, "请输入编号");
		}
		else{
			String bookId = textField.getText();
			IPricingStrategy isFind = MainUi.controller.strateCatalog.allStrategies.get(bookId);
			if(isFind == null){
				JOptionPane.showConfirmDialog(null, "查无此书策略");
			}
			else
			{
				boolean isCom = MainUi.controller.deleteStrategy(bookId);
				if(isCom){
					JOptionPane.showConfirmDialog(null, "存在组合策略，一并删除成功");
				}			
				JOptionPane.showConfirmDialog(null, "删除成功");
			}
			this.initTable();	
		}
			
	}

	private void initTable() {
		// TODO Auto-generated method stub
		
		DefaultTableModel dtm = (DefaultTableModel)table.getModel();
		dtm.setRowCount(0);
	
		for(Entry<String,IPricingStrategy> entry:MainUi.controller.strateCatalog.allStrategies.entrySet()){		 
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
