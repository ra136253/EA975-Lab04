import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Form extends JFrame {
	private JTextField txtName;
	private JTextField txtLastName;
	private JTextField txtEmail;
	private JTextField txtDate;
	private JTextField txtPhone;
	private JTextField txtCPF;
	private JTextField txtAdd2;
	private JTextField txtAdd;
	private JTextField txtCity;
	private JTextField txtCEP;
	private JTextField txtCountry;
	private JTextField txtState;
	private JComboBox cmbTitle;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public Form() {
		setTitle("Formulário");
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Title");
		label.setBounds(12, 46, 90, 15);
		getContentPane().add(label);
		
		cmbTitle = new JComboBox();
		cmbTitle.setModel(new DefaultComboBoxModel(new String[] {"Mr.", "Mrs.", "Miss.", "Ms.", "Dr.", "Other"}));
		cmbTitle.setToolTipText("");
		cmbTitle.setBounds(58, 41, 81, 24);
		getContentPane().add(cmbTitle);
		
		JLabel label_1 = new JLabel("First Name *");
		label_1.setBounds(12, 89, 127, 15);
		getContentPane().add(label_1);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(178, 89, 222, 19);
		getContentPane().add(txtName);
		
		JLabel label_2 = new JLabel("Last Name *");
		label_2.setBounds(12, 120, 90, 15);
		getContentPane().add(label_2);
		
		txtLastName = new JTextField();
		txtLastName.setColumns(10);
		txtLastName.setBounds(178, 120, 222, 19);
		getContentPane().add(txtLastName);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(178, 180, 222, 19);
		getContentPane().add(txtEmail);
		
		JLabel lblDataDeNascimento = new JLabel("Email *");
		lblDataDeNascimento.setBounds(12, 180, 127, 15);
		getContentPane().add(lblDataDeNascimento);
		
		JLabel lblDataDeNascimento_1 = new JLabel("Data de Nascimento* ");
		lblDataDeNascimento_1.setBounds(12, 149, 148, 15);
		getContentPane().add(lblDataDeNascimento_1);
		
		txtDate = new JTextField();
		txtDate.setColumns(10);
		txtDate.setBounds(178, 149, 222, 19);
		getContentPane().add(txtDate);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(178, 243, 222, 19);
		getContentPane().add(txtPhone);
		
		JLabel lblCpf = new JLabel("Phone");
		lblCpf.setBounds(12, 243, 90, 15);
		getContentPane().add(lblCpf);
		
		JLabel lblCpf_1 = new JLabel("CPF *");
		lblCpf_1.setBounds(12, 212, 90, 15);
		getContentPane().add(lblCpf_1);
		
		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(178, 212, 222, 19);
		getContentPane().add(txtCPF);
		
		txtAdd2 = new JTextField();
		txtAdd2.setColumns(10);
		txtAdd2.setBounds(178, 305, 222, 19);
		getContentPane().add(txtAdd2);
		
		JLabel lblAdress = new JLabel("Address 2");
		lblAdress.setBounds(12, 305, 90, 15);
		getContentPane().add(lblAdress);
		
		JLabel lblAddress = new JLabel("Address 1");
		lblAddress.setBounds(12, 274, 90, 15);
		getContentPane().add(lblAddress);
		
		txtAdd = new JTextField();
		txtAdd.setColumns(10);
		txtAdd.setBounds(178, 274, 222, 19);
		getContentPane().add(txtAdd);
		
		txtCity = new JTextField();
		txtCity.setColumns(10);
		txtCity.setBounds(178, 369, 222, 19);
		getContentPane().add(txtCity);
		
		JLabel lblCity_1 = new JLabel("City");
		lblCity_1.setBounds(12, 369, 90, 15);
		getContentPane().add(lblCity_1);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(12, 338, 90, 15);
		getContentPane().add(lblCep);
		
		txtCEP = new JTextField();
		txtCEP.setColumns(10);
		txtCEP.setBounds(178, 338, 222, 19);
		getContentPane().add(txtCEP);
		
		txtCountry = new JTextField();
		txtCountry.setColumns(10);
		txtCountry.setBounds(178, 424, 222, 19);
		getContentPane().add(txtCountry);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(12, 424, 90, 15);
		getContentPane().add(lblCountry);
		
		JLabel lblCity = new JLabel("State");
		lblCity.setBounds(12, 393, 90, 15);
		getContentPane().add(lblCity);
		
		txtState = new JTextField();
		txtState.setColumns(10);
		txtState.setBounds(178, 393, 222, 19);
		getContentPane().add(txtState);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try{
					Person p = new Person(cmbTitle.getSelectedItem().toString(), txtName.getText(), txtLastName.getText(), txtDate.getText(), 
							txtEmail.getText(),txtCPF.getText(), txtPhone.getText(), txtAdd.getText(), txtAdd2.getText(), txtCEP.getText(),txtCity.getText(),
							txtState.getText(),txtCountry.getText());
					PrintForm2 form = new PrintForm2(p);
					form.setVisible(true);
					
				}catch(Exception e){
					
					System.out.println(e.getMessage());
					
				}
				
			}
		});
		btnPrint.setBounds(160, 484, 117, 25);
		getContentPane().add(btnPrint);
	}
	
}
