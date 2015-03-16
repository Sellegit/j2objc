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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("Foundation/Foundation.h")
@Mapping("NSDateIntervalFormatterStyle")
public final class NSDateIntervalFormatterStyle extends ObjCEnum {
    
    @GlobalConstant("NSDateIntervalFormatterNoStyle")
    public static final long No = 0L;
    @GlobalConstant("NSDateIntervalFormatterShortStyle")
    public static final long Short = 1L;
    @GlobalConstant("NSDateIntervalFormatterMediumStyle")
    public static final long Medium = 2L;
    @GlobalConstant("NSDateIntervalFormatterLongStyle")
    public static final long Long = 3L;
    @GlobalConstant("NSDateIntervalFormatterFullStyle")
    public static final long Full = 4L;
    

}
