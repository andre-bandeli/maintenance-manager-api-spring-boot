package com.br.Maintenance.maintenance.repository;

import com.br.Maintenance.maintenance.model.ListaCompras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaComprasRepository extends JpaRepository<ListaCompras, Long> {
}
