package stt72_22634631_PhamDucTai;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame {

	private JPanel inputContainer;
	private JPanel optionContainer;
	private JPanel tableContainer;
	private JLabel maSachLabel;
	private JTextField maSachTextField;
	private JLabel tuaSachLabel;
	private JTextField tuaSachTextField;
	private JLabel tacGiaLabel;
	private JTextField tacGiaTextField;
	private JLabel namXuatBanLabel;
	private JTextField namXuatBanTextField;
	private JLabel nhaXuatBanLabel;
	private JTextField nhaXuatBanTextField;
	private JLabel soTrangLabel;
	private JTextField soTrangTextField;
	private JLabel donGiaLabel;
	private JTextField donGiaTextField;
	private JLabel iSBNLabel;
	private JTextField iSBNTextField;
	
	public MainFrame() {
		
		setTitle("Quản lý sách");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		inputContainer = new JPanel();
		maSachLabel = new JLabel("Mã sách:");
		maSachTextField = new JTextField(20);
		tuaSachLabel = new JLabel("Tựa sách:");
		tuaSachTextField = new JTextField(20);
		tacGiaLabel = new JLabel("Tác giả:");
		tacGiaTextField = new JTextField(20);
		namXuatBanLabel = new JLabel("Năm xuất bản:");
		namXuatBanTextField = new JTextField(20);
		nhaXuatBanLabel = new JLabel("Nhà xuất bản:");
		nhaXuatBanTextField = new JTextField(20);
		soTrangLabel = new JLabel("Số trang:");
		soTrangTextField = new JTextField(20);
		donGiaLabel = new JLabel("Đơn giá:");
		donGiaTextField = new JTextField(20);
		iSBNLabel = new JLabel("Internatinal Standard Book Number (ISBN):");
		iSBNTextField = new JTextField(20);
		
		inputContainer.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		// row 1
		c.gridy = 0;
		c.gridx = 0;
		Box maSachBox = Box.createHorizontalBox();
		maSachBox.add(maSachLabel);
		maSachBox.add(maSachTextField);
		inputContainer.add(maSachBox, c);
		
		// row 2
		c.gridy = 1;
		c.gridx = 0;
		Box tuaSachBox = Box.createHorizontalBox();
		tuaSachBox.add(tuaSachLabel);
		tuaSachBox.add(tuaSachTextField);
		inputContainer.add(tuaSachBox, c);
		c.gridx = 1;
		Box tacGiaBox = Box.createHorizontalBox();
		tuaSachBox.add(tacGiaLabel);
		tuaSachBox.add(tacGiaTextField);
		inputContainer.add(tacGiaBox, c);
		
		// row 3
		c.gridy = 2;
		c.gridx = 0;
		c.gridx = 1;
		
		// row 4
		c.gridy = 3;
		c.gridx = 0;
		c.gridx = 1;
		
		// row 5
		c.gridy = 4;
		c.gridx = 0;
		c.gridx = 1;
		
		add(inputContainer);
		pack();
		setVisible(true);
		
	}
	
	
}
