package apple.multipeerconnectivity;


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
import apple.security.*;


/**
 * @since Available in iOS 7.0 and later.
 */
@Library("MultipeerConnectivity/MultipeerConnectivity.h") @Mapping("MCPeerID")
public class MCPeerID 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("initWithDisplayName:")
    public MCPeerID(String myDisplayName) { }
    @Mapping("init")
    public MCPeerID() { }

    
    @Mapping("displayName")
    public native String getDisplayName();

    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}
