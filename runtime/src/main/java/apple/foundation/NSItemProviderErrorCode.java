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
 * @since Available in iOS 8.0 and later.
 */

@Library("Foundation/Foundation.h")
@Mapping("NSItemProviderErrorCode")
public final class NSItemProviderErrorCode extends ObjCEnum {
    
    @GlobalConstant("NSItemProviderUnknownError")
    public static final long Unknown = -1L;
    @GlobalConstant("NSItemProviderItemUnavailableError")
    public static final long ItemUnavailable = -1000L;
    @GlobalConstant("NSItemProviderUnexpectedValueClassError")
    public static final long UnexpectedValueClass = -1100L;
    

}
