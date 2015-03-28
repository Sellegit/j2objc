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
@Mapping("CFRunLoopActivity")
public final class CFRunLoopActivity extends ObjCEnum {
    
    @GlobalConstant("kCFRunLoopEntry")
    public static final long Entry = 1L;
    @GlobalConstant("kCFRunLoopBeforeTimers")
    public static final long BeforeTimers = 2L;
    @GlobalConstant("kCFRunLoopBeforeSources")
    public static final long BeforeSources = 4L;
    @GlobalConstant("kCFRunLoopBeforeWaiting")
    public static final long BeforeWaiting = 32L;
    @GlobalConstant("kCFRunLoopAfterWaiting")
    public static final long AfterWaiting = 64L;
    @GlobalConstant("kCFRunLoopExit")
    public static final long Exit = 128L;
    @GlobalConstant("kCFRunLoopAllActivities")
    public static final long AllActivities = 268435455L;


}
