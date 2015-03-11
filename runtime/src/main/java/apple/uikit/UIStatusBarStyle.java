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






@Mapping("UIStatusBarStyle")
public final class UIStatusBarStyle extends ObjCEnum {
    
    @GlobalConstant("UIStatusBarStyleDefault")
    public static final long Default = 0L;
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIStatusBarStyleLightContent")
    public static final long LightContent = 1L;
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("UIStatusBarStyleBlackTranslucent")
    public static final long BlackTranslucent = 1L;
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("UIStatusBarStyleBlackOpaque")
    public static final long BlackOpaque = 2L;
    

}
