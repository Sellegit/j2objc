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





@Library("UIKit")
@Mapping("UIBarMetrics")
public final class UIBarMetrics extends ObjCEnum {
    
    @GlobalConstant("UIBarMetricsDefault")
    public static final long Default = 0L;
    @GlobalConstant("UIBarMetricsCompact")
    public static final long Compact = 1L;
    @GlobalConstant("UIBarMetricsDefaultPrompt")
    public static final long DefaultPrompt = 101L;
    @GlobalConstant("UIBarMetricsCompactPrompt")
    public static final long CompactPrompt = 102L;
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @GlobalConstant("UIBarMetricsLandscapePhone")
    public static final long LandscapePhone = 1L;
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @GlobalConstant("UIBarMetricsLandscapePhonePrompt")
    public static final long LandscapePhonePrompt = 102L;
    

}
