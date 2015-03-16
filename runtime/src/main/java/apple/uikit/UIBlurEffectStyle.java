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
@Mapping("UIBlurEffectStyle")
public final class UIBlurEffectStyle extends ObjCEnum {
    
    @GlobalConstant("UIBlurEffectStyleExtraLight")
    public static final long ExtraLight = 0L;
    @GlobalConstant("UIBlurEffectStyleLight")
    public static final long Light = 1L;
    @GlobalConstant("UIBlurEffectStyleDark")
    public static final long Dark = 2L;
    

}
