package apple.corebluetooth;


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
import apple.dispatch.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("CoreBluetooth/CoreBluetooth.h") @Mapping("CBPeer")
public class CBPeer 
    extends NSObject 
    implements NSCopying {

    
    
    public CBPeer() {}
    
    
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("UUID")
    public native CFUUID getUUID();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("identifier")
    public native NSUUID getIdentifier();
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
