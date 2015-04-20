
public class Person {
	
	private String name, lastName, title, birthday, email, CPF, phone, add1, add2, CEP, city, state, country;
	
	public Person(String title, String name, String lastName, String birthday, String email, String CPF, 
			String phone, String add1, String add2, String CEP, String city, String state, String country) throws Exception{
		
		this.setTitle(title);
		this.setName(name);
		this.setLastName(lastName);
		this.setBirthday(birthday);
		this.setEmail(email);
		this.setCPF(CPF);
		this.setPhone(phone);
		this.setAdd1(add1);
		this.setAdd2(add2);
		this.setCEP(CEP);
		this.setCity(city);
		this.setState(state);
		this.setCountry(country);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception{
		if(name.isEmpty())
			throw new Exception("First Name não deve ser vazio");
		else
			this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) throws Exception{
		if(lastName.isEmpty())
			throw new Exception("Last Name não deve ser vazio");
		else	
			this.lastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws Exception{
		this.title = title;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) throws Exception{
		if(birthday.isEmpty())
			throw new Exception("Aniversário não deve ser vazio");
		else if(!Utils.validDate(birthday))
			throw new Exception("Aniversário não é uma data válida");
		else
			this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws Exception{
		if(email.isEmpty())
			throw new Exception("Email não deve ser vazio");
		else if(!Utils.validEmail(email))
			throw new Exception("Email não é válido");
		else
			this.email = email;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) throws Exception{
		if(cPF.isEmpty())
			throw new Exception("CPF não deve ser vazio");
		else if(!Utils.validCPF(cPF))
			throw new Exception("CPF não é válido");
		else
			CPF = cPF;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) throws Exception{
		if((!phone.isEmpty() && Utils.validPhone(phone))||phone.isEmpty())
			this.phone = phone;
		else
			throw new Exception("Telefone não é válido");

	}

	public String getAdd1() {
		return add1;
	}

	public void setAdd1(String add1){
		this.add1 = add1;
	}

	public String getAdd2() {
		return add2;
	}

	public void setAdd2(String add2){
		this.add2 = add2;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) throws Exception{
		if((!cEP.isEmpty() && Utils.validPhone(cEP))||cEP.isEmpty())
			this.CEP = cEP;
		else
			throw new Exception("CEP não é válido");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) throws Exception{
		if((!city.isEmpty() && Utils.validPhone(city))||city.isEmpty())
			this.city = city;
		else
			throw new Exception("Cidade não é válido");
	}

	public String getState() {
		return state;
	}

	public void setState(String state) throws Exception{
		if((!state.isEmpty() && Utils.validPhone(state))||state.isEmpty())
			this.state = state;
		else
			throw new Exception("Estado não é válido");
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) throws Exception{
		if((!country.isEmpty() && Utils.validPhone(country))||country.isEmpty())
			this.country = country;
		else
			throw new Exception("País não é válido");
	}
	
	

}
