package be.iccbxl.poo.App3tierGit.metier;

import java.util.List;

import be.iccbxl.poo.App3tierGit.entities.Book;
import be.iccbxl.poo.App3tierGit.entities.Person;

public interface IMetier {
	//Data access needs
	public List<Person> getMembres();
	public void register(Person p);
	public void update(Person p);
	public void unregister(Person p);
	
	//Business Logic
	public int computeRemainingDays(Book b);
	
	//...

}
