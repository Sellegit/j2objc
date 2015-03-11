package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;





@Library("Foundation")
@Mapping("NSStreamStatus")
public final class NSStreamStatus extends ObjCEnum {
    
    @GlobalConstant("NSStreamStatusNotOpen")
    public static final long NotOpen = 0L;
    @GlobalConstant("NSStreamStatusOpening")
    public static final long Opening = 1L;
    @GlobalConstant("NSStreamStatusOpen")
    public static final long Open = 2L;
    @GlobalConstant("NSStreamStatusReading")
    public static final long Reading = 3L;
    @GlobalConstant("NSStreamStatusWriting")
    public static final long Writing = 4L;
    @GlobalConstant("NSStreamStatusAtEnd")
    public static final long AtEnd = 5L;
    @GlobalConstant("NSStreamStatusClosed")
    public static final long Closed = 6L;
    @GlobalConstant("NSStreamStatusError")
    public static final long Error = 7L;
    

}
