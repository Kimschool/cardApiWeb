package com.credit.creditweb.repo;

import com.credit.creditweb.dto.CreditInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditInfoRepo extends JpaRepository<CreditInfo, String> {
}
