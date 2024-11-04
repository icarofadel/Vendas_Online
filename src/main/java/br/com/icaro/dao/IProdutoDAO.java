package br.com.icaro.dao;

import java.util.List;

import br.com.icaro.dao.generic.IGenericDAO;
import br.com.icaro.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}