package itisx.TicketSeller.Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class RepositorySerializator implements Serializable{
	private IFlightRepository flightRepository;

	public RepositorySerializator(IFlightRepository flightRepository) {
		this.flightRepository = flightRepository;
	}

	public void serialize(IFlightRepository flightRepository) throws IOException {
		FileOutputStream fout = new FileOutputStream("repository.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(flightRepository);
		oos.close();
	}

	public IFlightRepository deserialize() throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream("repository.ser");
		ObjectInputStream ois = new ObjectInputStream(fin);
		flightRepository = (IFlightRepository) ois.readObject();
		ois.close();
		return flightRepository;
	}
}