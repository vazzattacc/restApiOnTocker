package com.vivelibre.vivlibre.api.Dto;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.sql.Timestamp;



/**
 *
 * @author Vazgen Smbatyan
 */
public class UserDto {
   
    private Long id;
    private String username;
    private String password;
    private Timestamp creationDate;
    private String token;

    public UserDto(Long id, String user, String password, Timestamp creationDate, String token) {
        this.id = id;
        this.username = user;
        this.password = password;
        this.creationDate = creationDate;
        this.token = token;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
    
}
