package dominio;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PostoCombinedKey implements Serializable {
	
	


	@Column(name = "fila")
	private int fila;

	@Column(name = "id_volo")
	private int idVolo;



	@Column(name = "lettera")
	private char lettera;

	public int setIdVolo(int idVolo) {
		return this.idVolo = idVolo;
	}

	public int getIdVolo() {
		return idVolo;
	}

	public int getFila() {
		return fila;
	}

	public void setFile(int file) {
		this.fila = file;
	}
	public char getLettera() {
		return lettera;
	}

	public void setLettera(char lettera) {
		this.lettera = lettera;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fila;
		result = prime * result + idVolo;
		result = prime * result + lettera;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PostoCombinedKey other = (PostoCombinedKey) obj;
		if (fila != other.fila)
			return false;
		if (idVolo != other.idVolo)
			return false;
		if (lettera != other.lettera)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PostoCombinedKey [fila=" + fila + ", idVolo=" + idVolo + ", lettera=" + lettera + "]";
	}
	
}
