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
@Mapping("UITouchPhase")
public final class UITouchPhase extends ObjCEnum {
    
    @GlobalConstant("UITouchPhaseBegan")
    public static final long Began = 0L;
    @GlobalConstant("UITouchPhaseMoved")
    public static final long Moved = 1L;
    @GlobalConstant("UITouchPhaseStationary")
    public static final long Stationary = 2L;
    @GlobalConstant("UITouchPhaseEnded")
    public static final long Ended = 3L;
    @GlobalConstant("UITouchPhaseCancelled")
    public static final long Cancelled = 4L;
    

}
