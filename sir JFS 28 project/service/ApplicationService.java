package com.slokam.test.service;

import com.slokam.test.entity.Application;
import com.slokam.test.repo.ApplicationRepo;

import java.util.*;

public interface ApplicationService {
	
	public List<Application> getAll();
	public Application getById(Integer id);
	public Application save(Application Application);
	public void remove(Application Application);

}
