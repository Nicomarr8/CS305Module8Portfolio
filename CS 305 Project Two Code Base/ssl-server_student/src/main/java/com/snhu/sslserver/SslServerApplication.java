package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.*;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}

@RestController
class ServerController{
//FIXME:  Add hash function to return the checksum value for the data string that should contain your name.    
    @RequestMapping("/hash")
    public String myHash() throws NoSuchAlgorithmException{
    	String data = "Nico Crescenzi Artemis";
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        // shhhh, don't worry about the dumb names, my friend picked them :)
        byte[] jeffery = md.digest(data.getBytes());
        String jejfrey = "";
        for (Byte jeff : jeffery){
            jejfrey += Integer.toHexString(jeff);
        }
        return "<p>data: "+data + "<p>Name of cipher used: SHA-256 Checksum value: "+jejfrey;
    }
}

//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";