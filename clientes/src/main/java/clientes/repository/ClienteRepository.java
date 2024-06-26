package clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import clientes.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
