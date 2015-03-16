package apple.gamekit;


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



/**
 * @since Available in iOS 5.0 and later.
 * @deprecated Deprecated in iOS 7.0.
 */
@Deprecated

@Library("GameKit/GameKit.h") @Mapping("GKTurnBasedEventHandler")
public class GKTurnBasedEventHandler 
    extends NSObject 
     {

    
    
    public GKTurnBasedEventHandler() {}
    
    
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("delegate")
    public native GKTurnBasedEventHandlerDelegate getDelegate();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("setDelegate:")
    public native void setDelegate(GKTurnBasedEventHandlerDelegate v);
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("sharedTurnBasedEventHandler")
    public static native GKTurnBasedEventHandler getSharedTurnBasedEventHandler();
    
}
