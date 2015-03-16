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





@Library("CoreFoundation/CoreFoundation.h")
@Mapping("CFStreamEventType")
public final class CFStreamEventType extends ObjCEnum {
    
    @GlobalConstant("kCFStreamEventNone")
    public static final long None = 0L;
    @GlobalConstant("kCFStreamEventOpenCompleted")
    public static final long OpenCompleted = 1L;
    @GlobalConstant("kCFStreamEventHasBytesAvailable")
    public static final long HasBytesAvailable = 2L;
    @GlobalConstant("kCFStreamEventCanAcceptBytes")
    public static final long CanAcceptBytes = 4L;
    @GlobalConstant("kCFStreamEventErrorOccurred")
    public static final long ErrorOccurred = 8L;
    @GlobalConstant("kCFStreamEventEndEncountered")
    public static final long EndEncountered = 16L;
    

}
