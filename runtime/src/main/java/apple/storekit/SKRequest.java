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
 * @since Available in iOS 3.0 and later.
 */
@Library("StoreKit/StoreKit.h") @Mapping("SKRequest")
public class SKRequest 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public SKRequest() { }

    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("delegate")
    public native SKRequestDelegate getDelegate();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setDelegate:")
    public native void setDelegate(SKRequestDelegate v);

    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("cancel")
    public native void cancel();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("start")
    public native void start();

}
