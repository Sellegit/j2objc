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





@Library("Foundation/Foundation.h")
@Mapping("NSNetServiceOptions")
public final class NSNetServiceOptions extends ObjCEnum {
    
    @GlobalConstant("NSNetServiceNoAutoRename")
    public static final long NoAutoRename = 1L;
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSNetServiceListenForConnections")
    public static final long ListenForConnections = 2L;
    

}
