package dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="amministratore")
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_admin")
	private String idAdmin;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String psw;

	public String getIdAdmin() {
		return idAdmin;
	}

	public String getUsername() {
		return username;
	}

	public String getPsw() {
		return psw;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPsw(String password) {
		this.psw = password;
	}
	
	
	
	
	

}
