package com.example.ms3_funcionaporfa.Infrastracture;
import com.example.ms3_funcionaporfa.Domain.Maquina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaquinaRepository extends JpaRepository<Maquina,Long> {
}

