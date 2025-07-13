package com.cognizant.spring_learn.controller;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class AuthenticationController {

    private Logger logger = LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        logger.info("START - /authenticate");
        logger.debug("Authorization header: {}", authHeader);

        String user = getUser(authHeader);
        logger.debug("Decoded user: {}", user);

        String token = generateJwt(user);
        Map<String, String> map = new HashMap<>();
        map.put("token", token);

        logger.info("END - /authenticate");
        return map;
    }

    private String getUser(String authHeader) {
        logger.debug("Inside getUser()");
        String encodedCredentials = authHeader.substring("Basic ".length());
        byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);
        String decodedCredentials = new String(decodedBytes);
        logger.debug("Decoded credentials: {}", decodedCredentials);
        String user = decodedCredentials.split(":")[0];
        return user;
    }

    private String generateJwt(String user) {
        logger.debug("Inside generateJwt()");
        JwtBuilder builder = Jwts.builder();
        builder.setSubject(user);
        builder.setIssuedAt(new Date());
        builder.setExpiration(new Date((new Date()).getTime() + 1200000)); // 20 mins
        builder.signWith(SignatureAlgorithm.HS256, "secretkey");
        return builder.compact();
    }
}
