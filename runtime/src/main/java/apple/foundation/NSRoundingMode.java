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
@Mapping("NSRoundingMode")
public final class NSRoundingMode extends ObjCEnum {
    
    @GlobalConstant("NSRoundPlain")
    public static final long Plain = 0L;
    @GlobalConstant("NSRoundDown")
    public static final long Down = 1L;
    @GlobalConstant("NSRoundUp")
    public static final long Up = 2L;
    @GlobalConstant("NSRoundBankers")
    public static final long Bankers = 3L;


}
