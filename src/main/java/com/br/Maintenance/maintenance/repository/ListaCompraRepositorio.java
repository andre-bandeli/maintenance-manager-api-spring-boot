package com.br.Maintenance.maintenance.repository;

import com.br.Maintenance.maintenance.model.ListaCompras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ListaCompraRepositorio extends CrudRepository<ListaCompras, Long> {
}
