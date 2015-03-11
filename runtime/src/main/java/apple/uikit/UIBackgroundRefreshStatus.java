package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;



/**
 * @since Available in iOS 7.0 and later.
 */

@Library("UIKit")
@Mapping("UIBackgroundRefreshStatus")
public final class UIBackgroundRefreshStatus extends ObjCEnum {
    
    @GlobalConstant("UIBackgroundRefreshStatusRestricted")
    public static final long Restricted = 0L;
    @GlobalConstant("UIBackgroundRefreshStatusDenied")
    public static final long Denied = 1L;
    @GlobalConstant("UIBackgroundRefreshStatusAvailable")
    public static final long Available = 2L;
    

}
