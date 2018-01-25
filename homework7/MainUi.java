package homework7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import homework5.factory;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class MainUi extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JDesktopPane table = new JDesktopPane();
	public static  Controller controller = new Controller();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUi frame = new MainUi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainUi() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainUi.class.getResource("/homework7/bookshelf.png")));
		setTitle("\u56FE\u4E66\u7BA1\u7406\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1151, 873);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u4E66\u7C4D\u7BA1\u7406");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("\u5F55\u5165\u4E66\u7C4D");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onAddBtn();
				
			}
		});
		menu.add(menuItem);
		
		JMenu menu_1 = new JMenu("\u7B56\u7565\u7BA1\u7406");
		menuBar.add(menu_1);
		
		JMenuItem menuItem_1 = new JMenuItem("\u7B56\u7565\u7EF4\u62A4");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onStrategyBtn();
				
			}
		});
		menu_1.add(menuItem_1);
		
		JMenu menu_2 = new JMenu("\u4E66\u7C4D\u8D2D\u4E70");
		menuBar.add(menu_2);
		
		JMenuItem menuItem_6 = new JMenuItem("\u8D2D\u4E70\u4E66\u7C4D");
		menuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onBuyBtn();
			}
		});
		menu_2.add(menuItem_6);
		
		JMenu menu_3 = new JMenu("\u8D26\u53F7\u8BBE\u7F6E");
		menu_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		menuBar.add(menu_3);
		
		JMenuItem menuItem_5 = new JMenuItem("\u9000\u51FA\u7CFB\u7EDF");
		menuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null,"是否退出系统");
				if(result == 0)
					dispose();
			}
		});
		menu_3.add(menuItem_5);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		contentPane.add(table, BorderLayout.CENTER);
		table.setLayout(new GridLayout(1, 0, 0, 0));
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	
	protected void onBuyBtn() {
		// TODO Auto-generated method stub
		BuyUi buyPerform = new BuyUi();
		buyPerform.setVisible(true);
		buyPerform.setClosable(true);
		table.removeAll();
		table.setForeground(Color.blue);
		table.add(buyPerform);
	}

	protected void onStrategyBtn() {
		// TODO Auto-generated method stub
		StrategiesUi ui = new StrategiesUi();
		ui.setVisible(true);
		table.removeAll();
		table.setForeground(Color.blue);
		table.add(ui);
	}

	protected void onAddBtn() {
		// TODO Auto-generated method stub
		AddBookUi addUi = new AddBookUi();
		addUi.setVisible(true);
		table.removeAll();
		table.setForeground(Color.blue);
		table.add(addUi);
	}

}
