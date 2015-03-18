package apple.storekit;


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
import apple.accounts.*;



/**
 * @since Available in iOS 6.0 and later.
 */

@Library("StoreKit/StoreKit.h") @Mapping("SKDownload")
public class SKDownload 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public SKDownload() { }
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("downloadState")
    public native @Representing("SKDownloadState") @MachineSizedSInt long getDownloadState();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("contentLength")
    public native long getContentLength();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("contentIdentifier")
    public native String getContentIdentifier();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("contentURL")
    public native NSURL getContentURL();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("contentVersion")
    public native String getContentVersion();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("error")
    public native NSError getError();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("progress")
    public native float getProgress();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("timeRemaining")
    public native double getTimeRemaining();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("transaction")
    public native SKPaymentTransaction getTransaction();
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("SKDownloadTimeRemainingUnknown")
    public static native double getRemainingTimeUnknown();
    
    
    
}
