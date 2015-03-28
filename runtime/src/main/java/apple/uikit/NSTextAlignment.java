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
@Mapping("NSTextAlignment")
public final class NSTextAlignment extends ObjCEnum {
    
    @GlobalConstant("NSTextAlignmentLeft")
    public static final long Left = 0L;
    @GlobalConstant("NSTextAlignmentCenter")
    public static final long Center = 1L;
    @GlobalConstant("NSTextAlignmentRight")
    public static final long Right = 2L;
    @GlobalConstant("NSTextAlignmentJustified")
    public static final long Justified = 3L;
    @GlobalConstant("NSTextAlignmentNatural")
    public static final long Natural = 4L;


}
