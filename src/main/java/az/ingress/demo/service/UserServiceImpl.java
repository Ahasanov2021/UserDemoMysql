package az.ingress.demo.service;


import az.ingress.demo.model.User;
import az.ingress.demo.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    @Override
    public User get(Integer id){
        log.info("User service get method is working.");
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty()){
            throw new RuntimeException("User not found");
        }
        return user.get();
    }

    @Override
    public User create(User user){
        log.info("User service create method is working.");
        User userInDb = userRepository.save(user);
        return userInDb;
    }

    @Override
    public User update(Integer id, User user){
        log.info("User service update method is working.");
        User entity = userRepository.findById(id)
                .orElseThrow(()->new RuntimeException("User not found"));
        if(user.getAge() != null){
            entity.setAge(user.getAge());
        }
        if(user.getName() != null){
            entity.setName(user.getName());
        }
        if(user.getSurName() != null){
            entity.setSurName(user.getSurName());
        }
        if(user.getPhone() != null){
            entity.setPhone(user.getPhone());
        }
        userRepository.save(entity);
        return entity;
    }

    @Override
    public void delete(Integer id){
        log.info("User service delete method is working.");
        userRepository.deleteById(id);
    }
}
