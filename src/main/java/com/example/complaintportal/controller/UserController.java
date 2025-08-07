// package com.example.complaintportal.controller;


// // import java.util.HashMap;
// // import java.util.Map;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// // import org.springframework.web.bind.annotation.PostMapping;
// // import org.springframework.web.bind.annotation.RequestBody;

// // import com.example.complaintportal.User;
// // import com.example.complaintportal.security.JwtUtil;
// import com.example.complaintportal.service.UserService;

// @RestController
// @RequestMapping("/api/users")
// @CrossOrigin("*")
// public class UserController {

//     @Autowired
//     private UserService userService;

//     // @PostMapping("/api/users/register")
//     // public User register(@RequestBody User user) {
//     //     return userService.registerUser(user);
//     // }
    
//     // @Autowired
//     // private JwtUtil jwtUtil;

//     // @PostMapping("/auth/login")
//     // public Map<String, Object> login(@RequestBody User user) {
//     //     return userService.loginUser(user.getEmail(), user.getPassword())
//     //         .map(u -> {
//     //             Map<String, Object> response = new HashMap<>();
//     //             response.put("id", u.getId());
//     //             response.put("name", u.getName());
//     //             response.put("email", u.getEmail());
//     //             response.put("role", u.getRole());

//     //             // ✅ Generate token
//     //             String token = jwtUtil.generateToken(u.getEmail(), u.getRole());
//     //             response.put("token", token);

//     //             return response;
//     //         })
//     //         .orElseThrow(() -> new RuntimeException("Invalid credentials"));
//     // }
// }

