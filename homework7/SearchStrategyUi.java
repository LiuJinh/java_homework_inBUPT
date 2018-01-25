package homework7;

import java.awt.EventQueue;
import java.awt.Point;
import java.util.Vector;
import java.util.Map.Entry;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class SearchStrategyUi extends JInternalFrame {
	private JTable table;
	private JTextField textField = new JTextField();

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public SearchStrategyUi() {
		setBounds(100, 100, 685, 748);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel label = new JLabel("\u7F16\u53F7\uFF1A");
		
		textField.setColumns(10);
		
		JButton button = new JButton("\u786E\u8BA4");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				onSubmitBtn();
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(127)
					.addComponent(label)
					.addGap(18)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
					.addGap(52)
					.addComponent(button)
					.addContainerGap(82, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 608, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setFont(new Font("宋体", Font.PLAIN, 20));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				onChose(arg0);
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u7B56\u7565\u7F16\u53F7", "\u7B56\u7565\u540D\u79F0", "\u7B56\u7565\u7C7B\u578B", "\u9002\u7528\u56FE\u4E66\u7C7B\u578B", "\u767E\u5206\u6298\u6263\u6BD4/\u6BCF\u672C\u4F18\u60E0\u989D\u5EA6"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(130);
		table.getColumnModel().getColumn(1).setPreferredWidth(132);
		table.getColumnModel().getColumn(2).setPreferredWidth(138);
		table.getColumnModel().getColumn(3).setPreferredWidth(136);
		table.getColumnModel().getColumn(4).setPreferredWidth(242);
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);

		table.setRowHeight(25);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 
		
		this.initTable();
	}

	protected void onSubmitBtn() {
		// TODO Auto-generated method stub
		if(textField.getText().equals("")){
			JOptionPane.showConfirmDialog(null, "请输入编号");
		}
		else{
			boolean isFind = false;
			int row = -1;
			String bookId = textField.getText();
			for(int i = 0;i<table.getRowCount();i++){
				if(bookId.equals(table.getValueAt(i, 0))){
					isFind = true;
					row = i;
					break;
				}					
			}

			if(!isFind){
				JOptionPane.showConfirmDialog(null, "查无此书策略");
			}
			else
			{
				table.requestFocus();
				table.changeSelection(row,0,false, false);
			}
		}
	}

	protected void onChose(MouseEvent arg0) {
		// TODO Auto-generated method stub
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		Point mousepoint;                     
        mousepoint =arg0.getPoint();
		int row = table.rowAtPoint(mousepoint);
		String id = (String)tableModel.getValueAt(row, 0).toString();
		textField.setText(id);
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
