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
@Library("UIKit/UIKit.h") @Mapping("UIUserNotificationCategory")
public class UIUserNotificationCategory 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public UIUserNotificationCategory() { }

    
    @Mapping("identifier")
    public native String getIdentifier();

    
    
    @Mapping("actionsForContext:")
    public native NSArray<UIUserNotificationAction> getActions(@Representing("UIUserNotificationActionContext") long context);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}
