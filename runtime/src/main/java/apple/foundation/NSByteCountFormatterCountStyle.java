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
@Mapping("NSByteCountFormatterCountStyle")
public final class NSByteCountFormatterCountStyle extends ObjCEnum {
    
    @GlobalConstant("NSByteCountFormatterCountStyleFile")
    public static final long File = 0L;
    @GlobalConstant("NSByteCountFormatterCountStyleMemory")
    public static final long Memory = 1L;
    @GlobalConstant("NSByteCountFormatterCountStyleDecimal")
    public static final long Decimal = 2L;
    @GlobalConstant("NSByteCountFormatterCountStyleBinary")
    public static final long Binary = 3L;
    

}
