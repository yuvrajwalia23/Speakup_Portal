package com.example.complaintportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.complaintportal.Complaint;
import com.example.complaintportal.User;
import com.example.complaintportal.repository.ComplaintRepository;
import com.example.complaintportal.repository.UserRepository;
import com.example.complaintportal.service.ComplaintService;

@RestController
@RequestMapping("/api/complaints")
@CrossOrigin("*")
public class ComplaintController {

    @Autowired
    private ComplaintService complaintService;

    @Autowired
    private ComplaintRepository complaintRepo;

    @Autowired
    private UserRepository userRepo;

    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    @PostMapping("/{userId}")
    public ResponseEntity<Complaint> createComplaint(@PathVariable Long userId, @RequestBody Complaint complaint) {
        User user = userRepo.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        complaint.setUser(user);
        Complaint saved = complaintRepo.save(complaint);

        return ResponseEntity.ok(saved);
    }
    
    @GetMapping("/user/{userId}")
    public List<Complaint> getUserComplaints(@PathVariable Long userId) {
        return complaintService.getUserComplaints(userId);
    }
    
    @GetMapping
    public List<Complaint> getAllComplaints() {
        return complaintService.getAllComplaints();
    }
    
    @PutMapping("/{complaintId}")
    public Complaint updateStatus(@PathVariable Long complaintId, @RequestParam String status) {
        return complaintService.updateComplaintStatus(complaintId, status);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{complaintId}")
    public void deleteComplaint(@PathVariable Long complaintId) {
        complaintService.deleteComplaint(complaintId);
    }
}
