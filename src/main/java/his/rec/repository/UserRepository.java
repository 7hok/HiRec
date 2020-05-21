package his.rec.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import his.rec.model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    public User findByUsernameAndStatus(String username, Integer status);
    public User findByUsername(String username);
}