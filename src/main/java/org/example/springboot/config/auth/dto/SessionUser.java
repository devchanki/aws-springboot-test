package org.example.springboot.config.auth.dto;

import lombok.Getter;
import lombok.ToString;
import org.example.springboot.domain.user.User;

import java.io.Serializable;

@Getter
@ToString
public class SessionUser implements Serializable {
    private final String name;
    private final String email;
    private final String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
