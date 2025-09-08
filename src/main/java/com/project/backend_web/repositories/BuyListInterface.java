package com.project.backend_web.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.backend_web.domain.buy_list.BuyList;

public interface BuyListInterface extends JpaRepository<BuyList, UUID> {

}
