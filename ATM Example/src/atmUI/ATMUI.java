package atmUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;

import net.miginfocom.swing.MigLayout;

import org.eclipse.wb.swing.FocusTraversalOnArray;

public class ATMUI extends JFrame {

	private JPanel rootPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATMUI frame = new ATMUI();
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
	public ATMUI() {
		setResizable(false);
		setTitle("ATM Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 394);
		rootPane = new JPanel();
		rootPane.setForeground(Color.WHITE);
		rootPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK,
				null, null, null));
		setContentPane(rootPane);
		rootPane.setLayout(null);

		JPanel displayRootPanel = new JPanel();
		displayRootPanel.setBackground(Color.BLACK);
		displayRootPanel.setBorder(new BevelBorder(BevelBorder.LOWERED,
				Color.YELLOW, Color.YELLOW, new Color(255, 255, 0), new Color(
						255, 255, 0)));
		displayRootPanel.setBounds(12, 13, 405, 204);
		rootPane.add(displayRootPanel);
		displayRootPanel.setLayout(null);

		JTextPane displayPanel = new JTextPane();
		displayPanel.setForeground(Color.WHITE);
		displayPanel.setBackground(Color.BLACK);
		displayPanel.setEditable(false);
		displayPanel.setBounds(12, 13, 381, 178);
		displayRootPanel.add(displayPanel);

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(12, 218, 405, 131);
		rootPane.add(panel);
		panel.setLayout(null);

		JPanel keyPanel = new JPanel();
		keyPanel.setBounds(136, 0, 139, 126);
		panel.add(keyPanel);
		keyPanel.setBackground(Color.BLACK);
		keyPanel.setLayout(new MigLayout("", "[39px][39px][39px]",
				"[25px][25px][25px][25px]"));

		JButton button1 = new JButton("1");
		keyPanel.add(button1, "cell 0 0,alignx center,aligny center");

		JButton button2 = new JButton("2");
		keyPanel.add(button2, "cell 1 0,alignx center,aligny center");

		JButton button3 = new JButton("3");
		keyPanel.add(button3, "cell 2 0,alignx center,aligny center");

		JButton button4 = new JButton("4");
		keyPanel.add(button4, "cell 0 1,alignx center,aligny center");

		JButton button5 = new JButton("5");
		keyPanel.add(button5, "cell 1 1,alignx center,aligny center");

		JButton button6 = new JButton("6");
		keyPanel.add(button6, "cell 2 1,alignx center,aligny center");

		JButton button7 = new JButton("7");
		keyPanel.add(button7, "cell 0 2,alignx center,aligny center");

		JButton button8 = new JButton("8");
		keyPanel.add(button8, "cell 1 2,alignx center,aligny center");

		JButton button9 = new JButton("9");
		keyPanel.add(button9, "cell 2 2,alignx center,aligny center");

		JButton buttonDot = new JButton(".");
		keyPanel.add(buttonDot, "cell 0 3,alignx center,aligny center");

		JButton button0 = new JButton("0");
		keyPanel.add(button0, "cell 1 3,alignx center,aligny center");
		keyPanel.setFocusTraversalPolicy(new FocusTraversalOnArray(
				new Component[] { button1, button2, button3, button4, button5,
						button6, button7, button8, button9, buttonDot, button0 }));

		JButton btnInsertCard = new JButton("Insert Card");
		btnInsertCard.setBounds(429, 255, 208, 36);
		rootPane.add(btnInsertCard);

		JButton btnSwitch = new JButton("ON");
		btnSwitch.setBounds(580, 317, 57, 38);
		rootPane.add(btnSwitch);

		JButton btnShowLog = new JButton("Show Log");
		btnShowLog.setBounds(429, 317, 101, 38);
		rootPane.add(btnShowLog);

		JTextPane receiptPanel = new JTextPane();
		receiptPanel.setEditable(false);
		receiptPanel.setBounds(429, 13, 208, 229);
		rootPane.add(receiptPanel);
	}
}
