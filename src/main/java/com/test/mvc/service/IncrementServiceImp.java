package com.test.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.mvc.dao.IncrementDao;
/**
 * Service Layer
 * @author Kishore
 *
 */
@Service
public class IncrementServiceImp implements IncrementService {

	@Autowired
	private IncrementDao incrementDao;

	/**
	 * call dao increment method
	 */
	@Transactional
	public void increment() {
		incrementDao.increment();
	}

}
