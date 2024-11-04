package br.com.icaro.service;

import java.util.List;

import br.com.icaro.domain.Produto;
import br.com.icaro.service.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}