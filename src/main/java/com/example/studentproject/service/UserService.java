package com.example.studentproject.service;

import com.example.studentproject.exception.ResourceNotFoundException;
import com.example.studentproject.model.User;
import com.example.studentproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Save a new user
     * @param user the user to save
     * @return the saved user
     */
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(Math.toIntExact(id));
    }
    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    public User updateUser(Long id, User userDetails) {
        User user = userRepository.findById(Math.toIntExact(id)).orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + id));

        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        user.setPassword(userDetails.getPassword());
        user.setGender(userDetails.getGender());
        user.setPhoneNumber(userDetails.getPhoneNumber());
        user.setProfilePicture(userDetails.getProfilePicture());
        user.setIsVerified(userDetails.getIsVerified());
        user.setRole(userDetails.getRole());

        return userRepository.save(user);
    }
    public void deleteUser(Long id) {
        User user = userRepository.findById(Math.toIntExact(id)).orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + id));
        userRepository.delete(user);
    }

}
