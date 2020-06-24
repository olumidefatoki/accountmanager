package io.github.lrzeszotarski.accountmanager.domain.repository;


import io.github.lrzeszotarski.accountmanager.domain.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
