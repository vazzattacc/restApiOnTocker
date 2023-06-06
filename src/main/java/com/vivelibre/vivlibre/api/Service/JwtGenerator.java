/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vivelibre.vivlibre.api.Service;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import org.springframework.stereotype.Service;
/**
 *
 * @author PRINCIPAL
 */

@Service
public class JwtGenerator {
    private static final Key secretKey = new SecretKeySpec(("vivelibre2023aversisehace1234bastantelargo".getBytes(StandardCharsets.UTF_8)),
            SignatureAlgorithm.HS256.getJcaName());



    public String generarTokenJWT(String usuario, String contraseña) {
        String token = Jwts.builder()
                .setSubject(usuario) 
                .claim("contraseña", contraseña)
                .signWith(secretKey)
                .compact();

        return token;
    }
}