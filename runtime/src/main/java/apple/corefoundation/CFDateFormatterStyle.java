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
@Mapping("CFDateFormatterStyle")
public final class CFDateFormatterStyle extends ObjCEnum {
    
    @GlobalConstant("kCFDateFormatterNoStyle")
    public static final long NoStyle = 0L;
    @GlobalConstant("kCFDateFormatterShortStyle")
    public static final long ShortStyle = 1L;
    @GlobalConstant("kCFDateFormatterMediumStyle")
    public static final long MediumStyle = 2L;
    @GlobalConstant("kCFDateFormatterLongStyle")
    public static final long LongStyle = 3L;
    @GlobalConstant("kCFDateFormatterFullStyle")
    public static final long FullStyle = 4L;
    

}
