package dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aereoporto")
public class Aereoporto {
@Id
@Column(name="id_aereoporto")
private String idAereoporto;

@Column(name="denominazione")
private String denominazione;

@Column(name="paese")
private String paese;

public String getIdAereoporto() {
	return idAereoporto;
}

public String getDenominazione() {
	return denominazione;
}

public String getPaese() {
	return paese;
}



}
