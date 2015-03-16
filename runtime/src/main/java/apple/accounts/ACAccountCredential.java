package apple.accounts;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;



/**
 * @since Available in iOS 5.0 and later.
 */

@Library("Accounts/Accounts.h") @Mapping("ACAccountCredential")
public class ACAccountCredential 
    extends NSObject 
     {

    
    
    public ACAccountCredential() {}
    @Mapping("initWithOAuthToken:tokenSecret:")
    public ACAccountCredential(String token, String secret) { }
    @Mapping("initWithOAuth2Token:refreshToken:expiryDate:")
    public ACAccountCredential(String token, String refreshToken, NSDate expiryDate) { }
    
    
    @Mapping("oauthToken")
    public native String getOauthToken();
    @Mapping("setOauthToken:")
    public native void setOauthToken(String v);
    
    
    
    
    
}
