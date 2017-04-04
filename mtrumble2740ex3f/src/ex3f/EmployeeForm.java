package ex3f;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class EmployeeForm extends JFrame {

	private JPanel contentPane;
	private JTextField empIdTextField;
	private JTextField empNameTextField;
	private JTextField positionTextField;
	private JList employeeList;
	private JComboBox deptComboBox;
	private DefaultListModel employeeListModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeForm frame = new EmployeeForm();
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
	public EmployeeForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 408, 131);
		contentPane.add(scrollPane);
		
		employeeListModel = new DefaultListModel();
		employeeList = new JList(employeeListModel);
		scrollPane.setViewportView(employeeList);
		
		JLabel lblEmployeeId = new JLabel("Employee ID:");
		lblEmployeeId.setBounds(12, 173, 99, 16);
		contentPane.add(lblEmployeeId);
		
		JLabel lblEmployeeName = new JLabel("Employee Name:");
		lblEmployeeName.setBounds(12, 202, 99, 16);
		contentPane.add(lblEmployeeName);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setBounds(12, 231, 99, 16);
		contentPane.add(lblDepartment);
		
		JLabel lblPosition = new JLabel("Position:");
		lblPosition.setBounds(12, 260, 99, 16);
		contentPane.add(lblPosition);
		
		empIdTextField = new JTextField();
		empIdTextField.setText("101");
		empIdTextField.setBounds(159, 170, 57, 22);
		contentPane.add(empIdTextField);
		empIdTextField.setColumns(10);
		
		empNameTextField = new JTextField();
		empNameTextField.setText("John Doe");
		empNameTextField.setBounds(159, 199, 116, 22);
		contentPane.add(empNameTextField);
		empNameTextField.setColumns(10);
		
		deptComboBox = new JComboBox();
		deptComboBox.setModel(new DefaultComboBoxModel(new String[] {"Buisness Office", "Human Recources", "Manufacturing", "Shipping", "Maintenance"}));
		deptComboBox.setBounds(159, 228, 148, 22);
		contentPane.add(deptComboBox);
		
		positionTextField = new JTextField();
		positionTextField.setText("Manager");
		positionTextField.setBounds(159, 257, 116, 22);
		contentPane.add(positionTextField);
		positionTextField.setColumns(10);
		
		JButton noArgButton = new JButton("No Arg");
		noArgButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_noArgButton_actionPerformed(e);
			}
		});
		noArgButton.setBounds(56, 296, 97, 25);
		contentPane.add(noArgButton);
		
		JButton twoArgButton = new JButton("2 Arg");
		twoArgButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_twoArgButton_actionPerformed(e);
			}
		});
		twoArgButton.setBounds(169, 296, 97, 25);
		contentPane.add(twoArgButton);
		
		JButton fourArgButton = new JButton("4 arg ");
		fourArgButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_fourArgButton_actionPerformed(e);
			}
		});
		fourArgButton.setBounds(278, 296, 97, 25);
		contentPane.add(fourArgButton);
	}
	protected void do_noArgButton_actionPerformed(ActionEvent e) {
		Employee emp = new Employee();
		employeeListModel.addElement(emp);
	}
	protected void do_twoArgButton_actionPerformed(ActionEvent e) {
		int empID = Integer.parseInt(empIdTextField.getText());
		Employee emp = new Employee(empNameTextField.getText(), empID);
		employeeListModel.addElement(emp);
	}
	protected void do_fourArgButton_actionPerformed(ActionEvent e) {
		int empID = Integer.parseInt(empIdTextField.getText());
		String dept = (String) deptComboBox.getSelectedItem();
		Employee emp = new Employee(empNameTextField.getText(), empID, dept, positionTextField.getText());
		employeeListModel.addElement(emp);
	}
}
