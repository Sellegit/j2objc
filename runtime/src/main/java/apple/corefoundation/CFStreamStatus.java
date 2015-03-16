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
@Mapping("CFStreamStatus")
public final class CFStreamStatus extends ObjCEnum {
    
    @GlobalConstant("kCFStreamStatusNotOpen")
    public static final long NotOpen = 0L;
    @GlobalConstant("kCFStreamStatusOpening")
    public static final long Opening = 1L;
    @GlobalConstant("kCFStreamStatusOpen")
    public static final long Open = 2L;
    @GlobalConstant("kCFStreamStatusReading")
    public static final long Reading = 3L;
    @GlobalConstant("kCFStreamStatusWriting")
    public static final long Writing = 4L;
    @GlobalConstant("kCFStreamStatusAtEnd")
    public static final long AtEnd = 5L;
    @GlobalConstant("kCFStreamStatusClosed")
    public static final long Closed = 6L;
    @GlobalConstant("kCFStreamStatusError")
    public static final long Error = 7L;
    

}
