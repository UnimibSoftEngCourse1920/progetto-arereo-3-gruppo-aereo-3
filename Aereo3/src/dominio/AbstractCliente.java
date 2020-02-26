package dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractCliente {

	@Id
	@Column(name = "cod_cliente")
	private String codCliente;

	@Column(name = "nome")
	private String nome;

	@Column(name = "cognome")
	private String cognome;

	@Column(name = "data_di_nascita")
	private LocalDateTime dataDiNascita;

	@Column(name = "email")
	private String email;

	@Column(name = "indirizzo")
	private String indirizzo;
	
	@Column(name="fedele")
	private boolean fedele = false;

	//data in cui il cliente è diventato infedele (dopo due anni che non acquista biglietti)
	@Column(name = "infedele")
	private LocalDate infedele;

    
}
