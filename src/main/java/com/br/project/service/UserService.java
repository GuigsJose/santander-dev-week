package com.br.project.service;

import com.br.project.domain.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
