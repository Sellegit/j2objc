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
 * @since Available in iOS 3.0 and later.
 * @deprecated Deprecated in iOS 8.0.
 */
@Deprecated
@Library("UIKit/UIKit.h")
@Mapping("UIRemoteNotificationType")
public final class UIRemoteNotificationType extends ObjCEnum {
    
    @GlobalConstant("UIRemoteNotificationTypeNone")
    public static final long None = 0L;
    @GlobalConstant("UIRemoteNotificationTypeBadge")
    public static final long Badge = 1L;
    @GlobalConstant("UIRemoteNotificationTypeSound")
    public static final long Sound = 2L;
    @GlobalConstant("UIRemoteNotificationTypeAlert")
    public static final long Alert = 4L;
    @GlobalConstant("UIRemoteNotificationTypeNewsstandContentAvailability")
    public static final long NewsstandContentAvailability = 8L;


}
