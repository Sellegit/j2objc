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
@Mapping("UIAccessibilityScrollDirection")
public final class UIAccessibilityScrollDirection extends ObjCEnum {
    
    @GlobalConstant("UIAccessibilityScrollDirectionRight")
    public static final long Right = 1L;
    @GlobalConstant("UIAccessibilityScrollDirectionLeft")
    public static final long Left = 2L;
    @GlobalConstant("UIAccessibilityScrollDirectionUp")
    public static final long Up = 3L;
    @GlobalConstant("UIAccessibilityScrollDirectionDown")
    public static final long Down = 4L;
    @GlobalConstant("UIAccessibilityScrollDirectionNext")
    public static final long Next = 5L;
    @GlobalConstant("UIAccessibilityScrollDirectionPrevious")
    public static final long Previous = 6L;


}
