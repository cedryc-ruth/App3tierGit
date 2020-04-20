package be.iccbxl.poo.App3tierGit.dao;

import java.util.List;

import be.iccbxl.poo.App3tierGit.entities.Person;

public interface IDao {
	public List<Person> findAll();
	public void remove(Person p);
	public void update(Person p);
	public void save(Person p);
}
