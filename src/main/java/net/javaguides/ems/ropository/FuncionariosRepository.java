package net.javaguides.ems.ropository;

import net.javaguides.ems.entity.Funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionariosRepository extends JpaRepository<Funcionarios, Long> {
}
