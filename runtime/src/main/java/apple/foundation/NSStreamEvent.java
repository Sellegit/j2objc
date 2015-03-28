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


@Library("Foundation/Foundation.h")
@Mapping("NSStreamEvent")
public final class NSStreamEvent extends ObjCEnum {
    
    @GlobalConstant("NSStreamEventNone")
    public static final long None = 0L;
    @GlobalConstant("NSStreamEventOpenCompleted")
    public static final long OpenCompleted = 1L;
    @GlobalConstant("NSStreamEventHasBytesAvailable")
    public static final long HasBytesAvailable = 2L;
    @GlobalConstant("NSStreamEventHasSpaceAvailable")
    public static final long HasSpaceAvailable = 4L;
    @GlobalConstant("NSStreamEventErrorOccurred")
    public static final long ErrorOccurred = 8L;
    @GlobalConstant("NSStreamEventEndEncountered")
    public static final long EndEncountered = 16L;


}
