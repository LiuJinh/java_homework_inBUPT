package homework5;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	public static factory mFa= new factory();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setTitle("\u5458\u5DE5\u5F55\u5165\u7CFB\u7EDF\u4E3B\u754C\u9762");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 562);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("EmployeeInfoInput");
		mnNewMenu.setIcon(new ImageIcon(MainWindow.class.getResource("/images/add1.png")));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmCommisionemployee = new JMenuItem("CommisionEmployee ");
		mntmCommisionemployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CommissionInput dialog = new CommissionInput();
				dialog.setVisible(true);
				dialog.requestFocus();
			}
		});
		mnNewMenu.add(mntmCommisionemployee);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("BasePlusCommisionEmployee");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BaseInput dialog = new BaseInput();
				dialog.setVisible(true);
				dialog.requestFocus();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JLabel lblNewLabel = new JLabel("\u5458\u5DE5\u5F55\u5165\u7CFB\u7EDF");
		
		JMenu mnNewMenu_1 = new JMenu("Search");
		mnNewMenu_1.setIcon(new ImageIcon(MainWindow.class.getResource("/images/search.png")));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmAverageearningsearch = new JMenuItem("AverageEarningSearch");
		mntmAverageearningsearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("平均工资"+mFa.averageSalary());
			}
		});
		mnNewMenu_1.add(mntmAverageearningsearch);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		lblNewLabel.setIcon(new ImageIcon(MainWindow.class.getResource("/images/person.png")));
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 45));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(209, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(199))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(76)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(113, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
