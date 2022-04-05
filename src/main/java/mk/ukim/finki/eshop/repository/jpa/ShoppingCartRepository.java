package mk.ukim.finki.eshop.repository.jpa;

import mk.ukim.finki.eshop.model.ShoppingCart;
import mk.ukim.finki.eshop.model.User;
import mk.ukim.finki.eshop.model.enumerations.ShoppingCartStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {

    Optional<ShoppingCart> findByUserAndStatus(User user, ShoppingCartStatus status);
}
