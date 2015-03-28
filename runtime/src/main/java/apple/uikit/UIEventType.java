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
@Mapping("UIEventType")
public final class UIEventType extends ObjCEnum {
    
    @GlobalConstant("UIEventTypeTouches")
    public static final long Touches = 0L;
    @GlobalConstant("UIEventTypeMotion")
    public static final long Motion = 1L;
    @GlobalConstant("UIEventTypeRemoteControl")
    public static final long RemoteControl = 2L;


}
