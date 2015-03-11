package apple.passkit;


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
import apple.uikit.*;
import apple.addressbook.*;



/**
 * @since Available in iOS 6.0 and later.
 */

@Library("PassKit") @Mapping("PKPassLibrary")
public class PKPassLibrary 
    extends NSObject 
     {

    
    
    public PKPassLibrary() {}
    
    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("PKPassLibraryDidChangeNotification")
    public static native NSString DidChangeNotification();
    
    @Mapping("passes")
    public native NSArray<PKPass> getPasses();
    @Mapping("passWithPassTypeIdentifier:serialNumber:")
    public native PKPass getPass(String identifier, String serialNumber);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("passesOfType:")
    public native NSArray<PKPass> getPassesOfType(@Representing("PKPassType") @MachineSizedUInt long passType);
    @Mapping("removePass:")
    public native void removePass(PKPass pass);
    @Mapping("containsPass:")
    public native boolean containsPass(PKPass pass);
    @Mapping("replacePassWithPass:")
    public native boolean replacePass(PKPass pass);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("addPasses:withCompletionHandler:")
    public native void addPasses(NSArray<PKPass> passes, @Block VoidBlock1<PKPassLibraryAddPassesStatus> completion);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("activatePaymentPass:withActivationData:completion:")
    public native void activatePaymentPass(PKPaymentPass paymentPass, NSData activationData, @Block VoidBlock2<Boolean, NSError> completion);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("activatePaymentPass:withActivationCode:completion:")
    public native void activatePaymentPass(PKPaymentPass paymentPass, String activationCode, @Block VoidBlock2<Boolean, NSError> completion);
    @Mapping("isPassLibraryAvailable")
    public static native boolean isPassLibraryAvailable();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("isPaymentPassActivationAvailable")
    public static native boolean isPaymentPassActivationAvailable();
    
}
