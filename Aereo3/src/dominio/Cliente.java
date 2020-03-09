
package dominio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

import dataManagment.GestioneClienteDatabase;
import dataManagment.GestionePrenotazioneDatabase;

import javax.persistence.InheritanceType;


@Entity
@Table(name = "cliente")
@Inheritance(strategy=InheritanceType.JOINED)
public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "cod_cliente")
	protected int codCliente;

	@Column(name = "nome")
	private String nome;

	@Column(name = "cognome")
	private String cognome;

	@Column(name = "data_di_nascita")
	private Date dataDiNascita;

	@Column(name = "email")
	private String email;


	public int getCodCliente() {
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

	public Date getDataDiNascita() {
		return dataDiNascita;
	}


	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	/*****************************************/
	public void consultaVolo(String partenza, String destinazione, LocalTime orario) {

	}

	/*****************************************/
	public void prenotaVolo(Volo volo) {

	}

	/******************************************/

	/*public void paga(Prenotazione prenotazione) {
		//Clark: 
		//DUBBIO: if saldo carta< del prezzo tot? -> classe carta di cerdito?? || mettere un importo  della carta di default??
		
		GestionePrenotazioneDatabase.pagamentoPrenotazione(prenotazione);
	}*/

	/*****************************************/
	public void modificaPrenotazione(Prenotazione prenotazione, LocalTime nuovoOrario) {

	}

	public static boolean consultaVolo(Volo voloDaControllare) {

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
