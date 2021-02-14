package org.codingsquid.api;

import org.codingsquid.core.domain.User;
import org.codingsquid.core.repository.UserRepository;

/**
 * @author taewoong.han
 * @since 2021.02.13
 */
public class ApiServerStarter {

    public static void main(String... args) {
        System.out.println("http server start...");

        UserRepository repository = new UserRepository();
        User user = repository.findByEmail("gksxodnd007@naver.com");

        System.out.println(">>> user : " + user);

    }
}
