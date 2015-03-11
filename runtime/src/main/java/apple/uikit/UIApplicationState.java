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
 * @since Available in iOS 4.0 and later.
 */


@Mapping("UIApplicationState")
public final class UIApplicationState extends ObjCEnum {
    
    @GlobalConstant("UIApplicationStateActive")
    public static final long Active = 0L;
    @GlobalConstant("UIApplicationStateInactive")
    public static final long Inactive = 1L;
    @GlobalConstant("UIApplicationStateBackground")
    public static final long Background = 2L;
    

}
