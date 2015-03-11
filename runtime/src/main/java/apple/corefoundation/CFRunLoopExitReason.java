package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;





@Library("CoreFoundation")
@Mapping("CFRunLoopExitReason")
public final class CFRunLoopExitReason extends ObjCEnum {
    
    @GlobalConstant("kCFRunLoopRunFinished")
    public static final long Finished = 1L;
    @GlobalConstant("kCFRunLoopRunStopped")
    public static final long Stopped = 2L;
    @GlobalConstant("kCFRunLoopRunTimedOut")
    public static final long TimedOut = 3L;
    @GlobalConstant("kCFRunLoopRunHandledSource")
    public static final long HandledSource = 4L;
    

}
