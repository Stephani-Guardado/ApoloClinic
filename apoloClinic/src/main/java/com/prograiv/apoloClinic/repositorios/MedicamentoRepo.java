package com.prograiv.apoloClinic.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import com.prograiv.apoloClinic.entidades.Medicamento;

public interface MedicamentoRepo extends JpaRepository<Medicamento, Integer> {

}
