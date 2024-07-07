package az.ingress.demo.service;

import az.ingress.demo.dto.UserDto;
import az.ingress.demo.model.User;

public interface UserService {
    UserDto get(Integer id);

    User create(User user);

    User update(Integer id, User user);

    void delete(Integer id);
}
