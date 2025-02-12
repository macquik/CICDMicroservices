package com.bancolombia.app.service;

import java.util.List;

import com.bancolombia.app.entitites.Client;

public interface Iservice {
	/*return name (input)*/
	boolean insert(Client cl);
	List<Client> selectAll();
}
