package metier;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class ClientParticulier extends Client {

	public ClientParticulier(Collection<Compte> comptes, Placement placement,
			Conseiller conseiller) {
		super(comptes, placement, conseiller);
		// TODO Auto-generated constructor stub
	}

	public ClientParticulier() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ClientParticulier ";
	}



}
