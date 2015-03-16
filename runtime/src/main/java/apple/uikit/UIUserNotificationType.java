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
 * @since Available in iOS 8.0 and later.
 */

@Library("UIKit/UIKit.h")
@Mapping("UIUserNotificationType")
public final class UIUserNotificationType extends ObjCEnum {
    
    @GlobalConstant("UIUserNotificationTypeNone")
    public static final long None = 0L;
    @GlobalConstant("UIUserNotificationTypeBadge")
    public static final long Badge = 1L;
    @GlobalConstant("UIUserNotificationTypeSound")
    public static final long Sound = 2L;
    @GlobalConstant("UIUserNotificationTypeAlert")
    public static final long Alert = 4L;
    

}
