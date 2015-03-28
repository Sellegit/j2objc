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
 * @since Available in iOS 6.0 and later.
 */
@Library("UIKit/UIKit.h")
@Mapping("NSLineBreakMode")
public final class NSLineBreakMode extends ObjCEnum {
    
    @GlobalConstant("NSLineBreakByWordWrapping")
    public static final long WordWrapping = 0L;
    @GlobalConstant("NSLineBreakByCharWrapping")
    public static final long CharWrapping = 1L;
    @GlobalConstant("NSLineBreakByClipping")
    public static final long Clipping = 2L;
    @GlobalConstant("NSLineBreakByTruncatingHead")
    public static final long TruncatingHead = 3L;
    @GlobalConstant("NSLineBreakByTruncatingTail")
    public static final long TruncatingTail = 4L;
    @GlobalConstant("NSLineBreakByTruncatingMiddle")
    public static final long TruncatingMiddle = 5L;


}
