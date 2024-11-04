package br.com.icaro.dao;

import java.util.List;

import br.com.icaro.dao.generic.IGenericDAO;
import br.com.icaro.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}