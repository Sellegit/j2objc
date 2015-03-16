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
@Mapping("NSQualityOfService")
public final class NSQualityOfService extends ObjCEnum {
    
    @GlobalConstant("NSQualityOfServiceUserInteractive")
    public static final long UserInteractive = 33L;
    @GlobalConstant("NSQualityOfServiceUserInitiated")
    public static final long UserInitiated = 25L;
    @GlobalConstant("NSQualityOfServiceUtility")
    public static final long Utility = 17L;
    @GlobalConstant("NSQualityOfServiceBackground")
    public static final long Background = 9L;
    @GlobalConstant("NSQualityOfServiceDefault")
    public static final long Default = -1L;
    

}
