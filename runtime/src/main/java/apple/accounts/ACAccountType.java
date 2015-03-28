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
@Library("Accounts/Accounts.h") @Mapping("ACAccountType")
public class ACAccountType 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public ACAccountType() { }

    
    @Mapping("accountTypeDescription")
    public native String getAccountTypeDescription();
    @Mapping("identifier")
    public native ACAccountTypeIdentifier getIdentifier();
    @Mapping("accessGranted")
    public native boolean isAccessGranted();

    
    


}
