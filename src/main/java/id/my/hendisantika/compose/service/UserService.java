package id.my.hendisantika.compose.service;

import id.my.hendisantika.compose.entity.User;
import id.my.hendisantika.compose.exception.NotFoundException;
import id.my.hendisantika.compose.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-docker-compose-mysql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Visit: https://s.id/hendisantika
 * Date: 21/05/24
 * Time: 07.08
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User create(User user) {
        log.debug("User create action called");
        return userRepository.save(user);
    }

    public User findById(Long userId) {
        log.debug("User findById action called");
        return userRepository.findById(userId)
                .orElseThrow(() -> new NotFoundException("User of id " + userId + " not found."));
    }
}
