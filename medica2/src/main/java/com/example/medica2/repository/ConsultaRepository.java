package com.example.medica2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.medica2.model.Consulta;
@Repository

public interface ConsultaRepository extends JpaRepository<Consulta, Long>{

}
