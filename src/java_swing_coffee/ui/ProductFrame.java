package java_swing_coffee.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductFrame extends JFrame {

	private JPanel contentPane;
	private JTextField tfCode;
	private JTextField tfPrice;
	private JTextField tfSales;
	private JTextField tfMargin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductFrame frame = new ProductFrame();
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
	public ProductFrame() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 4, 0, 0));
		
		JLabel lblCode = new JLabel("제품코드");
		contentPane.add(lblCode);
		
		tfCode = new JTextField();
		contentPane.add(tfCode);
		tfCode.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		contentPane.add(lblNewLabel_2);
		
		JLabel lblPrice = new JLabel("제품단가");
		contentPane.add(lblPrice);
		
		tfPrice = new JTextField();
		tfPrice.setColumns(10);
		contentPane.add(tfPrice);
		
		JLabel label = new JLabel("");
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		contentPane.add(label_1);
		
		JLabel lblSales = new JLabel("판매수량");
		contentPane.add(lblSales);
		
		tfSales = new JTextField();
		tfSales.setColumns(10);
		contentPane.add(tfSales);
		
		JLabel label_2 = new JLabel("");
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		contentPane.add(label_3);
		
		JLabel lblMargin = new JLabel("마진율");
		contentPane.add(lblMargin);
		
		tfMargin = new JTextField();
		tfMargin.setColumns(10);
		contentPane.add(tfMargin);
		
		JLabel label_4 = new JLabel("");
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		contentPane.add(label_5);
		
		JButton btnInput = new JButton("입력");
		contentPane.add(btnInput);
		
		JButton btnOutput1 = new JButton("출력1");
		contentPane.add(btnOutput1);
		
		JButton btnOutput2 = new JButton("출력2");
		btnOutput2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btnOutput2);
	}

}
