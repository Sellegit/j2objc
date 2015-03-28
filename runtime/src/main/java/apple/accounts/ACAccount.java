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
@Library("Accounts/Accounts.h") @Mapping("ACAccount")
public class ACAccount 
    extends NSObject 
     {

    
    
    @Mapping("initWithAccountType:")
    public ACAccount(ACAccountType type) { }
    @Mapping("init")
    public ACAccount() { }

    
    @Mapping("identifier")
    public native String getIdentifier();
    @Mapping("accountType")
    public native ACAccountType getAccountType();
    @Mapping("setAccountType:")
    public native void setAccountType(ACAccountType v);
    @Mapping("accountDescription")
    public native String getAccountDescription();
    @Mapping("setAccountDescription:")
    public native void setAccountDescription(String v);
    @Mapping("username")
    public native String getUsername();
    @Mapping("setUsername:")
    public native void setUsername(String v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("userFullName")
    public native String getUserFullName();
    @Mapping("credential")
    public native ACAccountCredential getCredential();
    @Mapping("setCredential:")
    public native void setCredential(ACAccountCredential v);

    
    


}
