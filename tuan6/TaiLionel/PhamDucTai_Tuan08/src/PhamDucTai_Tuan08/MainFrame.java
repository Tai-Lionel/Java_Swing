package PhamDucTai_Tuan08;

import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends JFrame {

	private JLabel tableTitle;
	private Box container;
	private JTable table;
	private DefaultTableModel model;
	private JPanel titleContainer;

	public MainFrame() {
		setTitle("Lớp học");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		container = Box.createVerticalBox();
		
		titleContainer = new JPanel();
		titleContainer.setLayout(new FlowLayout(FlowLayout.CENTER));
		tableTitle = new JLabel("THÔNG TIN LỚP HỌC");
		titleContainer.add(tableTitle);
		container.add(titleContainer);
		String[] columnNames = {"Mã lớp", "Tên lớp", "Mã lớp"};
		model = new DefaultTableModel(columnNames, 0);
		table = new JTable(model);
		container.add(new JScrollPane(table));
		add(container);
		pack();
		setVisible(true);
	}
	
}
