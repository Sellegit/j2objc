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
@Mapping("UIBarPosition")
public final class UIBarPosition extends ObjCEnum {
    
    @GlobalConstant("UIBarPositionAny")
    public static final long Any = 0L;
    @GlobalConstant("UIBarPositionBottom")
    public static final long Bottom = 1L;
    @GlobalConstant("UIBarPositionTop")
    public static final long Top = 2L;
    @GlobalConstant("UIBarPositionTopAttached")
    public static final long TopAttached = 3L;
    

}
