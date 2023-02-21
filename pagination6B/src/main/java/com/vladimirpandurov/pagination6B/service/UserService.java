package com.vladimirpandurov.pagination6B.service;

import com.vladimirpandurov.pagination6B.domain.User;
import org.springframework.data.domain.Page;

public interface UserService {
    Page<User> getUsers(String name, int page, int size);
}
