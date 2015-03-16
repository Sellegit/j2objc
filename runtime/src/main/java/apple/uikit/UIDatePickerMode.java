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
@Mapping("UIDatePickerMode")
public final class UIDatePickerMode extends ObjCEnum {
    
    @GlobalConstant("UIDatePickerModeTime")
    public static final long Time = 0L;
    @GlobalConstant("UIDatePickerModeDate")
    public static final long Date = 1L;
    @GlobalConstant("UIDatePickerModeDateAndTime")
    public static final long DateAndTime = 2L;
    @GlobalConstant("UIDatePickerModeCountDownTimer")
    public static final long CountDownTimer = 3L;
    

}
