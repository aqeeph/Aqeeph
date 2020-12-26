/**
 * 
 */
package capsule;

import deva.Bitki;
import generic.Agac;

/**
 * @author MEHMET AKIF ILYASOGULLARI
 *
 */
public class Capsule_Agac_Bitki {
	private Agac<Bitki> agac_bitki;
	/**
	 * @param agac_bitki
	 */
	public Capsule_Agac_Bitki(Agac<Bitki> agac_bitki) {
		super();
		this.agac_bitki = agac_bitki;
	}
	/**
	 * 
	 */
	public Capsule_Agac_Bitki() {
		this.agac_bitki=new Agac<Bitki>();
	}
	public Agac<Bitki> getAgac_bitki() {
		return agac_bitki;
	}
	public void setAgac_bitki(Agac<Bitki> agac_bitki) {
		this.agac_bitki = agac_bitki;
	}
	@Override
	public String toString() {
		return "Capsule_Agac_Bitki [agac_bitki=" + agac_bitki + "]";
	}
}
