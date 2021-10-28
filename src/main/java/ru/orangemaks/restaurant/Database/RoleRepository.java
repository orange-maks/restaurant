package ru.orangemaks.restaurant.Database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.orangemaks.restaurant.Entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
}
