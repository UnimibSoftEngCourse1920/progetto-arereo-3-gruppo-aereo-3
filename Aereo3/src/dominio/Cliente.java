
package dominio;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="cliente")
public class Cliente {

	//TODO: sistemare il database, diversificare il cliente fedele
	
	@Column(name="cod_cliente")
	private String codCliente;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="cognome")
	private String cognome;
	
	@Column(name="data_di_nascita")
	private LocalDateTime dataDiNascita;
	
	@Column(name="email")
	private String email;
	
	@Column(name="indirizzo")
	private String indirizzo;
	//			private CartaDiCredito cartaDiCredito;

	public String getCodCliente() {
		return codCliente;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public LocalDateTime getDataDiNascita() {
		return dataDiNascita;
	}
	public void setDataDiNascita(LocalDateTime dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	/*****************************************/
	public void consultaVolo (String partenza, String destinazione, LocalTime orario) {

	}

	/*****************************************/
	public void prenotaVolo(Volo volo) {
		
	}

	/******************************************/
	
	public void paga(Prenotazione prenotazione) {
		
	}
	
	/*****************************************/
	public void modificaPrenotazione (Prenotazione prenotazione, LocalTime nuovoOrario) {
		
	}

	public static boolean consultaVolo(Volo voloDaControllare) {
		// TODO Auto-generated method stub
		return false;
	}

	
//	/****************************************/
//	/**
//	 * @throws ClassNotFoundException ***************************************/
//	
//	//Clark: metodo per cambiare l'orario della prenotazione, controllare i tipi di parametri e forse cambiarli sia su java che su sql.
//	public static void modificaPrenotazione (int idPrenotazione, Time nuovoOrario) throws ClassNotFoundException {
//
//		Connection connection = null;
//		PreparedStatement pstmt=null;
//		try {
//			connection = Utils.getMySqlConnection(Utils.DB_URL, Utils.DB_USER, Utils.DB_PASSWORD);
//			pstmt = connection.prepareStatement("UPDATE compagniaviaggio.prenotazione set orario_partenza=? where id=?");
//			pstmt.setTime(1, nuovoOrario);
//			pstmt.setInt(2, idPrenotazione);
//			pstmt.execute();
//
//		} catch (SQLException sqlEx) {
//			System.out.println("PROBLEMA : " + sqlEx);
//		} finally {
//			try {
//
//				pstmt.close();
//				connection.close();
//			} catch (SQLException finEx) {
//				System.out.println("PROBLEMA : " + finEx);
//			}
//
//		}
//
//
//
//	}
//
//
//	/**
//	 * @throws SQLException 
//	 * @throws ClassNotFoundException **************************************/
//// Clark : metodo per scoprire se il volo esiste
//	public static boolean consultaVolo(Volo voloDaControllare) throws SQLException, ClassNotFoundException {
//		boolean disponibile;
//		List<Volo> voliDisponibili= new ArrayList<Volo>();
//
//		Connection connection = null;
//		Statement stmt = null;
//
//		try {
//			connection = Utils.getMySqlConnection(Utils.DB_URL, Utils.DB_USER, Utils.DB_PASSWORD);
//
//			stmt = connection.createStatement();
//			ResultSet rs = stmt.executeQuery("SELECT * FROM compagniaviaggio.volo");
//
//			Volo volo = null;
//			while (rs.next()) {
//				volo = new Volo();
//				volo.setIdVolo(rs.getInt("id_volo"));
//				volo.setDestinazione(rs.getString("destinazione"));
//				volo.setGate(rs.getString("gate"));
//				volo.setNumeroPosti(rs.getInt("numero_posti"));
//				volo.setOrarioArrivo(rs.getTime("orario_arrivo"));
//				volo.setOrarioPartenza(rs.getTime("orario_partenza"));
//
//				voliDisponibili.add(volo);
//			}
//			
//			
//		} catch (SQLException sqlEx) {
//			System.out.println("PROBLEMA : " + sqlEx);
//			throw sqlEx;
//			
//			
//		} finally {
//			
//			try {
//				stmt.close();
//				connection.close();
//				
//				
//			} catch (SQLException finEx) {
//				
//				System.out.println("PROBLEMA : " + finEx);
//			}
//			
//		}
//
//
//		for(Volo v: voliDisponibili) {
//
//			if(v.equals(voloDaControllare)) 
//				return true;
//
//		}
//		return false;
//	

	/****************************************/
	
	

	
}

