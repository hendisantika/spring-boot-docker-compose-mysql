package id.my.hendisantika.compose.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-docker-compose-mysql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Visit: https://s.id/hendisantika
 * Date: 21/05/24
 * Time: 07.11
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@RestController
@RequestMapping("/api/ping")
public class PingController {

    @GetMapping
    public String ping() {
        log.debug("Ping action called");
        return "Pong >>> It works!";
    }
}
