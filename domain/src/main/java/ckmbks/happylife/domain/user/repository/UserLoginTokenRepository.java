package ckmbks.happylife.domain.user.repository;

import ckmbks.happylife.domain.user.UserLoginToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserLoginTokenRepository extends JpaRepository<UserLoginToken, UUID> {
    Optional<UserLoginToken> findByUserId(long userId);
}