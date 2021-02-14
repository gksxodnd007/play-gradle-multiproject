package org.codingsquid.core.repository;

import org.codingsquid.core.domain.User;

/**
 * @author taewoong.han
 * @since 2021.02.13
 */
public class UserRepository {

    public User findByEmail(String email) {
        return new User("dummy", email);
    }
}
