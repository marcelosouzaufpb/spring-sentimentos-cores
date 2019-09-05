package com.sentimentos.mc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sentimentos.mc.domain.Sentimento;



@Repository
public interface SentimentoRepository extends JpaRepository<Sentimento, Integer>{

}
