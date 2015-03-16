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
@Mapping("CFNumberFormatterPadPosition")
public final class CFNumberFormatterPadPosition extends ObjCEnum {
    
    @GlobalConstant("kCFNumberFormatterPadBeforePrefix")
    public static final long BeforePrefix = 0L;
    @GlobalConstant("kCFNumberFormatterPadAfterPrefix")
    public static final long AfterPrefix = 1L;
    @GlobalConstant("kCFNumberFormatterPadBeforeSuffix")
    public static final long BeforeSuffix = 2L;
    @GlobalConstant("kCFNumberFormatterPadAfterSuffix")
    public static final long AfterSuffix = 3L;
    

}
