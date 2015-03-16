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
@Mapping("UIAccessibilityNavigationStyle")
public final class UIAccessibilityNavigationStyle extends ObjCEnum {
    
    @GlobalConstant("UIAccessibilityNavigationStyleAutomatic")
    public static final long Automatic = 0L;
    @GlobalConstant("UIAccessibilityNavigationStyleSeparate")
    public static final long Separate = 1L;
    @GlobalConstant("UIAccessibilityNavigationStyleCombined")
    public static final long Combined = 2L;
    

}
