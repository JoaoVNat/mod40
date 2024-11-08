package com.Tarefa.Mod40.repository;

import com.Tarefa.Mod40.domain.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository  extends CrudRepository<Cliente,Long> {
}
