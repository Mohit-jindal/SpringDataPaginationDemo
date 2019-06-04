package com.infotech.people.management.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.infotech.people.management.app.dao.PeopleManagementDao;
import com.infotech.people.management.app.entities.Person;

@Service
public class PeopleManagementService 
{

	@Autowired
	PeopleManagementDao peopleManagementDao;

	public List<Person> findByLastName(String lastName, PageRequest pageRequest) 
	{
		return peopleManagementDao.findByLastName(lastName,pageRequest);
	}

}
