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
@Mapping("NSDateFormatterStyle")
public final class NSDateFormatterStyle extends ObjCEnum {
    
    @GlobalConstant("NSDateFormatterNoStyle")
    public static final long No = 0L;
    @GlobalConstant("NSDateFormatterShortStyle")
    public static final long Short = 1L;
    @GlobalConstant("NSDateFormatterMediumStyle")
    public static final long Medium = 2L;
    @GlobalConstant("NSDateFormatterLongStyle")
    public static final long Long = 3L;
    @GlobalConstant("NSDateFormatterFullStyle")
    public static final long Full = 4L;


}
