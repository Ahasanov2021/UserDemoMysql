package az.ingress.demo.controller;

import az.ingress.demo.model.User;
import az.ingress.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/v1")
public class UserController {

    private final UserService userService;

    public UserController(UserService userServiceImpl) {
        this.userService = userServiceImpl;
    }

    @GetMapping("/{id}")
    public User get(@PathVariable Integer id){
        return userService.get(id);
    }

    @PostMapping
    public User create(@RequestBody User student){
        return userService.create(student);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Integer id, @RequestBody User student){
        return userService.update(id, student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        userService.delete(id);
    }
}
