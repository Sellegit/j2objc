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
@Mapping("UIDataDetectorTypes")
public final class UIDataDetectorTypes extends ObjCEnum {
    
    @GlobalConstant("UIDataDetectorTypePhoneNumber")
    public static final long PhoneNumber = 1L;
    @GlobalConstant("UIDataDetectorTypeLink")
    public static final long Link = 2L;
    @GlobalConstant("UIDataDetectorTypeAddress")
    public static final long Address = 4L;
    @GlobalConstant("UIDataDetectorTypeCalendarEvent")
    public static final long CalendarEvent = 8L;
    @GlobalConstant("UIDataDetectorTypeNone")
    public static final long None = 0L;
    @GlobalConstant("UIDataDetectorTypeAll")
    public static final long All = -1L;


}
