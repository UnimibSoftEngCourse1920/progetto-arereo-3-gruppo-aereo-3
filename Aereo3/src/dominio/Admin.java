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
	private String password;
	
	
	public void setIdAdmin(String idAdmin) {
		this.idAdmin = idAdmin;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
