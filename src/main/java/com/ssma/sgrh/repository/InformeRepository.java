package com.ssma.sgrh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssma.sgrh.models.Informe;

@Repository
public interface InformeRepository extends JpaRepository<Informe, Long> {
}
