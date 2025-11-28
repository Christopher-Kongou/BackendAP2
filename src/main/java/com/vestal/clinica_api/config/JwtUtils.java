package com.vestal.clinica_api.config;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;

public class JwtUtils {

    private static final String SECRET = "MEGA-CHAVE-SECRETA-ULTRA-SEGURA";
    private static final long EXPIRATION_TIME = 1000 * 60 * 60;

    // método existente (em português)
    public static String gerarToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(io.jsonwebtoken.security.Keys.hmacShaKeyFor(SECRET.getBytes()))
                .compact();
    }

    // Adicione o wrapper em inglês para compatibilidade
    public static String generateToken(String username) {
        return gerarToken(username);
    }

    // método para validar e extrair subject (se já tiver, mantenha)
    public static String getSubject(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(io.jsonwebtoken.security.Keys.hmacShaKeyFor(SECRET.getBytes()))
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

    public static boolean isTokenValido(String token) {
        try {
            getSubject(token);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
