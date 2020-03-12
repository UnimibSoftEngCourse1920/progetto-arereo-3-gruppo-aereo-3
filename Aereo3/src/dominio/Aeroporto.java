package dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aeroporto")
public class Aeroporto {
@Id
@Column(name="id_aeroporto")
private String idAeroporto;

@Column(name="denominazione")
private String denominazione;

@Column(name="paese")
private String paese;

public String getIdAereoporto() {
	return idAeroporto;
}

public String getDenominazione() {
	return denominazione;
}

public String getPaese() {
	return paese;
}



}
