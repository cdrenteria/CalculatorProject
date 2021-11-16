package Calculator;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CalculatorGUI extends JFrame
{

	private JPanel contentPane;
	private JTextField numShow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					CalculatorGUI frame = new CalculatorGUI();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorGUI()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 324, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		numShow = new JTextField();
		numShow.setHorizontalAlignment(SwingConstants.RIGHT);
		numShow.setBounds(26, 11, 255, 35);
		contentPane.add(numShow);
		numShow.setColumns(10);
		
		JButton backButton = new JButton("<--");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backButton.setBounds(26, 57, 70, 35);
		contentPane.add(backButton);
		
		JButton clear = new JButton("C");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				numShow.setText(null);
			}
		});
		clear.setBounds(106, 57, 75, 35);
		contentPane.add(clear);
		
		JButton add = new JButton("+");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String numEntered = numShow.getText() + add.getText();
				numShow.setText(numEntered);
			}
		});
		add.setBounds(206, 57, 75, 35);
		contentPane.add(add);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String numEntered = numShow.getText() + minus.getText();
				numShow.setText(numEntered);
			}
		});
		minus.setBounds(206, 103, 75, 35);
		contentPane.add(minus);
		
		JButton multiply = new JButton("*");
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String numEntered = numShow.getText() + multiply.getText();
				numShow.setText(numEntered);
			}
		});
		multiply.setBounds(207, 149, 74, 35);
		contentPane.add(multiply);
		
		JButton divide = new JButton("/");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String numEntered = numShow.getText() + divide.getText();
				numShow.setText(numEntered);
			}
		});
		divide.setBounds(207, 195, 74, 35);
		contentPane.add(divide);
		
		JButton seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String numEntered = numShow.getText() + seven.getText();
				numShow.setText(numEntered);
			}
		});
		seven.setBounds(29, 103, 44, 35);
		contentPane.add(seven);
		
		JButton eight = new JButton("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String numEntered = numShow.getText() + eight.getText();
				numShow.setText(numEntered);
			}
		});
		eight.setBounds(83, 103, 44, 35);
		contentPane.add(eight);
		
		JButton nine = new JButton("9");
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String numEntered = numShow.getText() + nine.getText();
				numShow.setText(numEntered);
			}
		});
		nine.setBounds(137, 103, 44, 35);
		contentPane.add(nine);
		
		JButton four = new JButton("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String numEntered = numShow.getText() + four.getText();
				numShow.setText(numEntered);
			}
		});
		four.setBounds(29, 149, 44, 35);
		contentPane.add(four);
		
		JButton five = new JButton("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String numEntered = numShow.getText() + five.getText();
				numShow.setText(numEntered);
			}
		});
		five.setBounds(83, 149, 44, 35);
		contentPane.add(five);
		
		JButton six = new JButton("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String numEntered = numShow.getText() + six.getText();
				numShow.setText(numEntered);
			}
		});
		six.setBounds(137, 149, 44, 35);
		contentPane.add(six);
		
		JButton one = new JButton("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String numEntered = numShow.getText() + one.getText();
				numShow.setText(numEntered);
			}
		});
		one.setBounds(29, 195, 44, 35);
		contentPane.add(one);
		
		JButton two = new JButton("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String numEntered = numShow.getText() + two.getText();
				numShow.setText(numEntered);
			}
		});
		two.setBounds(83, 195, 44, 35);
		contentPane.add(two);
		
		JButton three = new JButton("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String numEntered = numShow.getText() + three.getText();
				numShow.setText(numEntered);
			}
		});
		three.setBounds(137, 195, 44, 35);
		contentPane.add(three);
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String numEntered = numShow.getText() + zero.getText();
				numShow.setText(numEntered);
			}
		});
		zero.setBounds(83, 241, 44, 35);
		contentPane.add(zero);
		
		JButton percent = new JButton("%");
		percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String numEntered = numShow.getText() + percent.getText();
				numShow.setText(numEntered);
			}
		});
		percent.setBounds(137, 241, 43, 35);
		contentPane.add(percent);
		
		JButton decimal = new JButton(".");
		decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String numEntered = numShow.getText() + decimal.getText();
				numShow.setText(numEntered);
			}
		});
		decimal.setBounds(29, 241, 44, 35);
		contentPane.add(decimal);
		
		JButton Enter = new JButton("Enter");
		Enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Enter.setBounds(207, 241, 74, 35);
		contentPane.add(Enter);
	}
}
