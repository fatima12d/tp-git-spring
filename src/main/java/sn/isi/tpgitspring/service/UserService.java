package sn.isi.tpgitspring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sn.isi.tpgitspring.entities.Users;
import sn.isi.tpgitspring.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<Users> findAll() {
        return userRepository.findAll();
    }
    public Users findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }
    public Users createUser(Users user) {
        return userRepository.save(user);
    }
    public Users updateUser(Users user) {
        return userRepository.save(user);
    }
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }


}
