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

@Library("UIKit/UIKit.h")
@Mapping("UIBackgroundFetchResult")
public final class UIBackgroundFetchResult extends ObjCEnum {
    
    @GlobalConstant("UIBackgroundFetchResultNewData")
    public static final long NewData = 0L;
    @GlobalConstant("UIBackgroundFetchResultNoData")
    public static final long NoData = 1L;
    @GlobalConstant("UIBackgroundFetchResultFailed")
    public static final long Failed = 2L;
    

}
