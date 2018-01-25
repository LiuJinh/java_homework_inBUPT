package homework7;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTree;
import javax.swing.JDesktopPane;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.Font;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;

public class StrategiesUi extends JInternalFrame {

	JTree tree = new JTree();
	JDesktopPane desktopPane = new JDesktopPane();
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public StrategiesUi() {
		setBounds(100, 100, 1066, 687);
		tree.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent arg0) {
				changeUi(arg0);
			}
		});
		
		
		tree.setVisibleRowCount(40);
		tree.setFont(new Font("宋体", Font.PLAIN, 23));
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("\u7B56\u7565\u7EF4\u62A4") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("\u589E\u52A0\u7B56\u7565");
						node_1.add(new DefaultMutableTreeNode("\u767E\u5206\u6BD4\u4F18\u60E0\u7B56\u7565(\u589E\u52A0)"));
						node_1.add(new DefaultMutableTreeNode("\u7EDD\u5BF9\u503C\u4F18\u60E0\u7B56\u7565(\u589E\u52A0)"));
						node_1.add(new DefaultMutableTreeNode("\u7EC4\u5408\u7B56\u7565(\u589E\u52A0)"));
					add(node_1);
					add(new DefaultMutableTreeNode("\u5220\u9664\u7B56\u7565"));
					node_1 = new DefaultMutableTreeNode("\u66F4\u65B0\u7B56\u7565");
						node_1.add(new DefaultMutableTreeNode("\u767E\u5206\u6BD4\u4F18\u60E0\u7B56\u7565(\u66F4\u65B0)"));
						node_1.add(new DefaultMutableTreeNode("\u7EDD\u5BF9\u503C\u4F18\u60E0\u7B56\u7565(\u66F4\u65B0)"));
						node_1.add(new DefaultMutableTreeNode("\u7EC4\u5408\u7B56\u7565(\u66F4\u65B0)"));
					add(node_1);
					add(new DefaultMutableTreeNode("\u67E5\u8BE2\u7B56\u7565"));
				}
			}
		));
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(tree, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(tree, GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
				.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
		);
		desktopPane.setLayout(new GridLayout(1, 0, 0, 0));
		getContentPane().setLayout(groupLayout);

	}
	
	protected void changeUi(TreeSelectionEvent arg0) {
		// TODO Auto-generated method stub
		 DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
	
		 if(node == null)
			 return;
		 
		 Object object = node.getUserObject();
		 if(node.isLeaf()){
			 desktopPane.removeAll();
			 
			 String selected = object.toString();
			 switch (selected){
			 case "删除策略":
				 RemoveStrategyUi newUi1 = new RemoveStrategyUi();
				 newUi1.setVisible(true);
				 desktopPane.add(newUi1);
				 break;
				 
			 case "百分比优惠策略(增加)":
				 AddStrategy1Ui newUi2 = new AddStrategy1Ui();
				 newUi2.setVisible(true);
				 desktopPane.add(newUi2);
				 break;
				 
			 case "绝对值优惠策略(增加)":
				 AddStrategy2Ui newUi3 = new AddStrategy2Ui();
				 newUi3.setVisible(true);
				 desktopPane.add(newUi3);
				 break;
				 
			 case "组合策略(增加)":
				 AddStrategy3Ui newUi4 = new AddStrategy3Ui();
				 newUi4.setVisible(true);
				 desktopPane.add(newUi4);
				 break;
				 
			 case "百分比优惠策略(更新)":
				 updateStrategy1Ui newUi5 = new updateStrategy1Ui();
				 newUi5.setVisible(true);
				 desktopPane.add(newUi5);
				 break;
				 
			 case "绝对值优惠策略(更新)":
				 updateStrategy2Ui newUi6 = new updateStrategy2Ui();
				 newUi6.setVisible(true);
				 desktopPane.add(newUi6);
				 break;
				 
			 case "组合策略(更新)":
				 updateStrategy3Ui newUi7 = new updateStrategy3Ui();
				 newUi7.setVisible(true);
				 desktopPane.add(newUi7);
				 break;
				 
			 case "查询策略":
				 SearchStrategyUi newUi8 = new SearchStrategyUi();
				 newUi8.setVisible(true);
				 desktopPane.add(newUi8);
				 break;
			 }
		 }
	}
	
}
