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
 * @since Available in iOS 4.1 and later.
 */
@Library("GameKit/GameKit.h") @Mapping("GKInvite")
public class GKInvite 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public GKInvite() { }

    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("sender")
    public native GKPlayer getSender();
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("inviter")
    public native String getInviter();
    @Mapping("isHosted")
    public native boolean isHosted();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("playerGroup")
    public native @MachineSizedUInt long getPlayerGroup();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("playerAttributes")
    public native int getPlayerAttributes();

    
    


}
