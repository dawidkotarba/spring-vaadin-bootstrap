package app.registration.service;

import app.authentication.annotations.UserRole;

public interface RegistrationService {
    void registerUser(String username, String password, UserRole... authorities);
}
