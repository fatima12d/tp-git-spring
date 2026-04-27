package sn.isi.tpgitspring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.isi.tpgitspring.entities.Users;
import sn.isi.tpgitspring.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public Users addUser(@RequestBody Users user) {
        return userService.createUser(user);
    }
    @GetMapping
    public List<Users> getAllUsers() {
        return userService.findAll();
    }
    @GetMapping("/{id}")
    public Users getUserById(@PathVariable Integer id) {
        return userService.findById(id);
    }
    @PutMapping("/{id}")
    public Users updateUser(@PathVariable Integer id, @RequestBody Users user) throws Exception {
        if(getUserById(id)==null) throw new Exception("L'id n'existe pas");
        return userService.updateUser(user);
    }
    @DeleteMapping
    public void deleteUser(Integer id) {
        userService.deleteById(id);

    }

}
