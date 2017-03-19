package service.budget;


import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.ws.security.WSSecurityException;
import org.apache.ws.security.handler.RequestData;
import org.apache.ws.security.validate.UsernameTokenValidator;
import org.apache.ws.security.message.token.UsernameToken;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author phuong
 */
public class UTValidator extends UsernameTokenValidator {

    @Override
    protected void verifyPlaintextPassword(UsernameToken usernameToken,
            RequestData data) throws WSSecurityException {
        if (!usernameToken.getName().equalsIgnoreCase("phuong")
                || !usernameToken.getPassword().equalsIgnoreCase("mdp")) {
            throw new WSSecurityException(WSSecurityException.FAILED_AUTHENTICATION);
        }
    }
}
