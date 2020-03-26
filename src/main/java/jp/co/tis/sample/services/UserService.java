package jp.co.tis.sample.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import jp.co.tis.sample.entities.User;
import jp.co.tis.sample.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public Iterable<User> getAll() {
        return repo.findAll();
    }

    public Optional<User> get(Integer key) {
        return repo.findById(key);
    }

    @Transactional
    public Optional<User> create(User user) {
        user.setKey(null);
        return Optional.ofNullable(repo.save(user));
    }
}
