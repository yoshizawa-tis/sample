package jp.co.tis.sample.controllers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jp.co.tis.sample.entities.User;
import jp.co.tis.sample.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping
    public Iterable<User> getAll() {
        return service.getAll();
    }

    @GetMapping("/{key}")
    public Optional<User> getUser(@PathVariable("key") Integer key) {
        return service.get(key);
    }

    @PostMapping
    public Optional<User> createUser(@RequestBody User user) {
        return service.create(user);
    }
}
