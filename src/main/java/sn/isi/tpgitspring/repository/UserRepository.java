package sn.isi.tpgitspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.isi.tpgitspring.entities.Users;
@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {
}
