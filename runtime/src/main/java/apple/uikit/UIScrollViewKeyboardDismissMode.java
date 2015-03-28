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
@Mapping("UIScrollViewKeyboardDismissMode")
public final class UIScrollViewKeyboardDismissMode extends ObjCEnum {
    
    @GlobalConstant("UIScrollViewKeyboardDismissModeNone")
    public static final long None = 0L;
    @GlobalConstant("UIScrollViewKeyboardDismissModeOnDrag")
    public static final long OnDrag = 1L;
    @GlobalConstant("UIScrollViewKeyboardDismissModeInteractive")
    public static final long Interactive = 2L;


}
