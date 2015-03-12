package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;



/**
 * @since Available in iOS 6.0 and later.
 */

@Library("Foundation") @Mapping("NSUUID")
public class NSUUID 
    extends NSObject 
    implements NSCopying {

    
    
    public NSUUID() {}
    @Mapping("initWithUUIDString:")
    public NSUUID(String string) { }
    @Mapping("initWithUUIDBytes:")
    public NSUUID(Todo bytes) { }
    
    
    @Mapping("UUIDString")
    public native String asString();
    
    
    
    @Mapping("getUUIDBytes:")
    protected native void getUUIDBytes(Todo uuid);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
