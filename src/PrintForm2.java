import javax.swing.JFrame;
import javax.swing.JLabel;


public class PrintForm2 extends JFrame {

	private JLabel txtName;
	private JLabel txtLastName;
	private JLabel txtEmail;
	private JLabel txtDate;
	private JLabel txtPhone;
	private JLabel txtCPF;
	private JLabel txtAdd2;
	private JLabel txtAdd;
	private JLabel txtCity;
	private JLabel txtCEP;
	private JLabel txtCountry;
	private JLabel txtState;
	private JLabel txtTitle;
	
	public PrintForm2(Person p) {
		setTitle("Formulário");
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Title");
		label.setBounds(12, 46, 90, 15);
		getContentPane().add(label);
		
		txtTitle = new JLabel(p.getTitle());
		txtTitle.setBounds(58, 41, 81, 24);
		getContentPane().add(txtTitle);
		
		JLabel label_1 = new JLabel("First Name *");
		label_1.setBounds(12, 89, 127, 15);
		getContentPane().add(label_1);
		
		txtName = new JLabel(p.getName());
		txtName.setBounds(178, 89, 222, 19);
		getContentPane().add(txtName);
		
		JLabel label_2 = new JLabel("Last Name *");
		label_2.setBounds(12, 120, 90, 15);
		getContentPane().add(label_2);
		
		txtLastName = new JLabel(p.getLastName());
		txtLastName.setBounds(178, 120, 222, 19);
		getContentPane().add(txtLastName);
		
		txtEmail = new JLabel(p.getEmail());
		txtEmail.setBounds(178, 180, 222, 19);
		getContentPane().add(txtEmail);
		
		JLabel lblDataDeNascimento = new JLabel("Email *");
		lblDataDeNascimento.setBounds(12, 180, 127, 15);
		getContentPane().add(lblDataDeNascimento);
		
		JLabel lblDataDeNascimento_1 = new JLabel("Data de Nascimento* ");
		lblDataDeNascimento_1.setBounds(12, 149, 148, 15);
		getContentPane().add(lblDataDeNascimento_1);
		
		txtDate = new JLabel(p.getBirthday());
		txtDate.setBounds(178, 149, 222, 19);
		getContentPane().add(txtDate);
		
		txtPhone = new JLabel(p.getPhone());
		txtPhone.setBounds(178, 243, 222, 19);
		getContentPane().add(txtPhone);
		
		JLabel lblCpf = new JLabel("Phone");
		lblCpf.setBounds(12, 243, 90, 15);
		getContentPane().add(lblCpf);
		
		JLabel lblCpf_1 = new JLabel("CPF *");
		lblCpf_1.setBounds(12, 212, 90, 15);
		getContentPane().add(lblCpf_1);
		
		txtCPF = new JLabel(p.getCPF());
		txtCPF.setBounds(178, 212, 222, 19);
		getContentPane().add(txtCPF);
		
		txtAdd2 = new JLabel(p.getAdd2());
		txtAdd2.setBounds(178, 305, 222, 19);
		getContentPane().add(txtAdd2);
		
		JLabel lblAdress = new JLabel("Address 2");
		lblAdress.setBounds(12, 305, 90, 15);
		getContentPane().add(lblAdress);
		
		JLabel lblAddress = new JLabel("Address 1");
		lblAddress.setBounds(12, 274, 90, 15);
		getContentPane().add(lblAddress);
		
		txtAdd = new JLabel(p.getAdd1());
		txtAdd.setBounds(178, 274, 222, 19);
		getContentPane().add(txtAdd);
		
		txtCity = new JLabel(p.getCity());
		txtCity.setBounds(178, 369, 222, 19);
		getContentPane().add(txtCity);
		
		JLabel lblCity_1 = new JLabel("City");
		lblCity_1.setBounds(12, 369, 90, 15);
		getContentPane().add(lblCity_1);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(12, 338, 90, 15);
		getContentPane().add(lblCep);
		
		txtCEP = new JLabel(p.getCEP());
		txtCEP.setBounds(178, 338, 222, 19);
		getContentPane().add(txtCEP);
		
		txtCountry = new JLabel(p.getCountry());
		txtCountry.setBounds(178, 424, 222, 19);
		getContentPane().add(txtCountry);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(12, 424, 90, 15);
		getContentPane().add(lblCountry);
		
		JLabel lblCity = new JLabel("State");
		lblCity.setBounds(12, 393, 90, 15);
		getContentPane().add(lblCity);
		
		txtState = new JLabel(p.getState());
		txtState.setBounds(178, 393, 222, 19);
		getContentPane().add(txtState);

	}

	
}
