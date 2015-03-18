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

@Library("Accounts/Accounts.h") @Mapping("ACAccountStore")
public class ACAccountStore 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public ACAccountStore() { }
    
    
    @Mapping("accounts")
    public native NSArray<ACAccount> getAccounts();
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("ACAccountStoreDidChangeNotification")
    public static native NSString DidChangeNotification();
    
    @Mapping("accountWithIdentifier:")
    public native ACAccount getAccount(String identifier);
    @Mapping("accountTypeWithAccountTypeIdentifier:")
    public native ACAccountType getAccountType(String typeIdentifier);
    @Mapping("accountsWithAccountType:")
    public native NSArray<ACAccount> getAccounts(ACAccountType accountType);
    
}
