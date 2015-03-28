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


@Library("UIKit/UIKit.h")
@Mapping("UIPopoverArrowDirection")
public final class UIPopoverArrowDirection extends ObjCEnum {
    
    @GlobalConstant("UIPopoverArrowDirectionUp")
    public static final long Up = 1L;
    @GlobalConstant("UIPopoverArrowDirectionDown")
    public static final long Down = 2L;
    @GlobalConstant("UIPopoverArrowDirectionLeft")
    public static final long Left = 4L;
    @GlobalConstant("UIPopoverArrowDirectionRight")
    public static final long Right = 8L;
    @GlobalConstant("UIPopoverArrowDirectionAny")
    public static final long Any = 15L;
    @GlobalConstant("UIPopoverArrowDirectionUnknown")
    public static final long Unknown = -1L;


}
