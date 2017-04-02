package app.authentication.model;

import org.springframework.security.core.GrantedAuthority;

public enum UserRole implements GrantedAuthority {
    ANONYMOUS {
        @Override
        public String getAuthority() {
            return name();
        }
    }, CUSTOMER {
        @Override
        public String getAuthority() {
            return name();
        }
    }, SPECIALIST {
        @Override
        public String getAuthority() {
            return name();
        }
    }, ADMIN {
        @Override
        public String getAuthority() {
            return name();
        }
    }
}
