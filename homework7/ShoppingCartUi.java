package homework7;

import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class ShoppingCartUi extends JInternalFrame implements Observer{
	private JTable table;
	private JLabel lblNewLabel = new JLabel("New label");

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ShoppingCartUi() {
		setTitle("\u8D2D\u7269\u8F66");
		setBounds(100, 100, 441, 658);
		
		JScrollPane scrollPane = new JScrollPane();
		
		table = new JTable();
		table.setFont(new Font("ËÎÌו", Font.PLAIN, 20));
		table.setShowVerticalLines(false);
		table.setRowSelectionAllowed(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u4E66\u540D", "\u6570\u91CF"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(187);
		table.getColumnModel().getColumn(1).setPreferredWidth(216);
		scrollPane.setViewportView(table);
		
		JLabel label = new JLabel("\u603B\u4EF7:");

		table.setRowHeight(22);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS); 
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(14)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(249)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(lblNewLabel))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(13)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 541, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label)
						.addComponent(lblNewLabel)))
		);
		getContentPane().setLayout(groupLayout);
		
		initTable();
	}

	private void initTable() {
		// TODO Auto-generated method stub
		DefaultTableModel dtm = (DefaultTableModel)table.getModel();
		dtm.setRowCount(0);		
		for(int i=0;i<MainUi.controller.sale.items.size();i++){
			Vector v1 = new Vector();
			v1.add(MainUi.controller.sale.items.get(i).getProdSpec().getTitle());
			v1.add(MainUi.controller.sale.items.get(i).getCopies());
			dtm.addRow(v1);
		}
		lblNewLabel.setText(""+MainUi.controller.sale.getTotal());
	}

	@Override
	public void update(Sale sale) {
		// TODO Auto-generated method stub
		DefaultTableModel dtm = (DefaultTableModel)table.getModel();
		dtm.setRowCount(0);

		double totalPrice = 0;
		for(int i=0;i<sale.items.size();i++){
			Vector v1 = new Vector();
			v1.add(sale.items.get(i).getProdSpec().getTitle());
			v1.add(""+sale.items.get(i).getCopies());
			dtm.addRow(v1);			
		}
		totalPrice += sale.getTotal();
		lblNewLabel.setText(""+totalPrice);
	}
}
