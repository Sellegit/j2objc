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
@Mapping("UIAlertActionStyle")
public final class UIAlertActionStyle extends ObjCEnum {
    
    @GlobalConstant("UIAlertActionStyleDefault")
    public static final long Default = 0L;
    @GlobalConstant("UIAlertActionStyleCancel")
    public static final long Cancel = 1L;
    @GlobalConstant("UIAlertActionStyleDestructive")
    public static final long Destructive = 2L;


}
