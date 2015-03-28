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
@Mapping("UIControlEvents")
public final class UIControlEvents extends ObjCEnum {
    
    @GlobalConstant("UIControlEventTouchDown")
    public static final long TouchDown = 1L;
    @GlobalConstant("UIControlEventTouchDownRepeat")
    public static final long TouchDownRepeat = 2L;
    @GlobalConstant("UIControlEventTouchDragInside")
    public static final long TouchDragInside = 4L;
    @GlobalConstant("UIControlEventTouchDragOutside")
    public static final long TouchDragOutside = 8L;
    @GlobalConstant("UIControlEventTouchDragEnter")
    public static final long TouchDragEnter = 16L;
    @GlobalConstant("UIControlEventTouchDragExit")
    public static final long TouchDragExit = 32L;
    @GlobalConstant("UIControlEventTouchUpInside")
    public static final long TouchUpInside = 64L;
    @GlobalConstant("UIControlEventTouchUpOutside")
    public static final long TouchUpOutside = 128L;
    @GlobalConstant("UIControlEventTouchCancel")
    public static final long TouchCancel = 256L;
    @GlobalConstant("UIControlEventValueChanged")
    public static final long ValueChanged = 4096L;
    @GlobalConstant("UIControlEventEditingDidBegin")
    public static final long EditingDidBegin = 65536L;
    @GlobalConstant("UIControlEventEditingChanged")
    public static final long EditingChanged = 131072L;
    @GlobalConstant("UIControlEventEditingDidEnd")
    public static final long EditingDidEnd = 262144L;
    @GlobalConstant("UIControlEventEditingDidEndOnExit")
    public static final long EditingDidEndOnExit = 524288L;
    @GlobalConstant("UIControlEventAllTouchEvents")
    public static final long AllTouchEvents = 4095L;
    @GlobalConstant("UIControlEventAllEditingEvents")
    public static final long AllEditingEvents = 983040L;
    @GlobalConstant("UIControlEventApplicationReserved")
    public static final long ApplicationReserved = 251658240L;
    @GlobalConstant("UIControlEventSystemReserved")
    public static final long SystemReserved = -268435456L;
    @GlobalConstant("UIControlEventAllEvents")
    public static final long AllEvents = -1L;


}
