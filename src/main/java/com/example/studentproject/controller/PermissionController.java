package com.example.studentproject.controller;

import com.example.studentproject.model.Permission;
import com.example.studentproject.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/permissions")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @GetMapping("getallpermission")
    public List<Permission> getAllPermissions() {
        return permissionService.getAllPermissions();
    }

    @GetMapping("/getpermission{id}")
    public Permission getPermissionById(@PathVariable Long id) {
        return permissionService.getPermissionById(id);
    }

    @PostMapping("/createpermission")
    public Permission createPermission(@RequestBody Permission permission) {
        return permissionService.savePermission(permission);
    }

    @PutMapping("/updatepermission{id}")
    public Permission updatePermission(@PathVariable Long id, @RequestBody Permission permission) {
        Permission existingPermission = permissionService.getPermissionById(id);
        if (existingPermission != null) {
            existingPermission.setPermissionType(permission.getPermissionType());
            return permissionService.savePermission(existingPermission);
        } else {
            return null;
        }
    }

    @DeleteMapping("/delete{id}")
    public void deletePermission(@PathVariable Long id) {
        permissionService.deletePermission(id);
    }
}