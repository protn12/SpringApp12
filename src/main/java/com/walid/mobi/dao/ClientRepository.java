package com.walid.mobi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walid.mobi.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
