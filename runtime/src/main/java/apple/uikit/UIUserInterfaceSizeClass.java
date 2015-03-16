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
@Mapping("UIUserInterfaceSizeClass")
public final class UIUserInterfaceSizeClass extends ObjCEnum {
    
    @GlobalConstant("UIUserInterfaceSizeClassUnspecified")
    public static final long Unspecified = 0L;
    @GlobalConstant("UIUserInterfaceSizeClassCompact")
    public static final long Compact = 1L;
    @GlobalConstant("UIUserInterfaceSizeClassRegular")
    public static final long Regular = 2L;
    

}
