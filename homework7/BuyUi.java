package homework7;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSplitPane;
import javax.swing.JDesktopPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JPasswordField;
import javax.swing.ScrollPaneConstants;

public class BuyUi extends JInternalFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	private JDesktopPane table = new JDesktopPane();
	public ShoppingCartUi cart = new ShoppingCartUi();
	private JScrollPane scrollPane;
	private JTable table_1 = new JTable();;
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public BuyUi() {
		setClosable(true);
		setBounds(100, 100, 1085, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
			
		JLabel lblNewLabel = new JLabel("isbn:");
		
		JLabel lblNewLabel_1 = new JLabel("\u6570\u91CF:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton button = new JButton("\u8D2D\u4E70");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onBuyBtn();
			}
		});
		table.setLayout(new GridLayout(0, 1, 0, 0));
		table.add(cart);
		
		cart.setVisible(true);
		
		this.initTable();
		MainUi.controller.sale.registerObserver(cart);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		table_1.setFont(new Font("宋体", Font.PLAIN, 20));
		
		
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				onChoseBook(e);
			}
		});
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"isbn", "\u4E66\u540D", "\u5355\u4EF7", "\u7C7B\u522B"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_1.getColumnModel().getColumn(0).setPreferredWidth(156);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(148);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(92);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(156);
		scrollPane.setViewportView(table_1);
		
		table_1.setRowHeight(25);
		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 592, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(265)
							.addComponent(button))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(167)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1))
							.addGap(59)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
							.addGap(125)))
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 463, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 556, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addComponent(button))
				.addComponent(table, GroupLayout.PREFERRED_SIZE, 718, GroupLayout.PREFERRED_SIZE)
		);
		contentPane.setLayout(gl_contentPane);
		
		this.initTable();
	}

	protected void onChoseBook(MouseEvent e) {
		// TODO Auto-generated method stub
		DefaultTableModel tableModel = (DefaultTableModel) table_1.getModel();
		Point mousepoint;                     
        mousepoint =e.getPoint();
		int row = table_1.rowAtPoint(mousepoint);
		String id = (String)tableModel.getValueAt(row, 0).toString();
		textField.setText(id);
	}

	protected void onBuyBtn() {
		// TODO Auto-generated method stub
		if(StringUtil.isStr(textField.getText())&&StringUtil.isInteger(textField_1.getText())){
			boolean isFind = false;
			for(int i=0;i<MainUi.controller.bookCatalog.allBooks.size();i++){
				if(MainUi.controller.bookCatalog.allBooks.get(i).getIsbn().equals(textField.getText()))
					isFind = true;
			}
			if(isFind)			
				MainUi.controller.buyBook(textField.getText(),Integer.parseInt(textField_1.getText()));
			else
				JOptionPane.showConfirmDialog(null, "没有这本书");
		}
		else{
			JOptionPane.showConfirmDialog(null, "请输入正确的isbn和数量");
		}
	}

	private void initTable(){
		DefaultTableModel dtm = (DefaultTableModel)table_1.getModel();
		dtm.setRowCount(0);		
		for(int i=0;i<MainUi.controller.bookCatalog.allBooks.size();i++){
			Vector v1 = new Vector();
			v1.add(MainUi.controller.bookCatalog.allBooks.get(i).getIsbn());
			v1.add(MainUi.controller.bookCatalog.allBooks.get(i).getTitle());
			v1.add(""+MainUi.controller.bookCatalog.allBooks.get(i).getPrice());
			v1.add(MainUi.controller.bookCatalog.allBooks.get(i).getType());
			dtm.addRow(v1);
		}
	}
}
