package id.my.hendisantika.compose.controller;

import id.my.hendisantika.compose.entity.User;
import id.my.hendisantika.compose.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-docker-compose-mysql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Visit: https://s.id/hendisantika
 * Date: 21/05/24
 * Time: 07.12
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public User create(@RequestBody User user) {
        log.debug("User create controller called");
        return userService.create(user);
    }

    @GetMapping
    public List<User> findAll() {
        log.debug("User findAll controller called");
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        log.debug("User findOne controller called with id: {}", id);
        return userService.findById(id);
    }
}
