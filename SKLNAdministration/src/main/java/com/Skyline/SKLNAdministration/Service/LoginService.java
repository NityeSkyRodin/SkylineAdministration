
 package com.Skyline.SKLNAdministration.Service;

 public class LoginService {


    public boolean checkLogin(String email, String password){

        if ("SKLN@SKLN.SKLN".equals(email) && "123".equals(password)) {
            return true;
        }
        return false;
    }
}