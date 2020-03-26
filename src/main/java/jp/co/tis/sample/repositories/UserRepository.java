package jp.co.tis.sample.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import jp.co.tis.sample.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
