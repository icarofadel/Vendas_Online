package br.com.icaro.service;

import java.util.List;

import br.com.icaro.domain.Cliente;
import br.com.icaro.exceptions.DAOException;
import br.com.icaro.service.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}