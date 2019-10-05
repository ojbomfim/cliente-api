package br.com.unipac.clientes.model.dao;

import java.util.List;

import br.com.unipac.clientes.model.domain.Cliente;

public interface ClienteDAO {

	boolean salvar(Cliente cliente);

	boolean alterar(Long id, Cliente cliente);

	List<Cliente> listartodos();

	boolean removerPorId(Cliente cliente);

	boolean buscarPorId(Cliente cliente);

}
