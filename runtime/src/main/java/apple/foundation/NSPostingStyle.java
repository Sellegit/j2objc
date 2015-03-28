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
@Mapping("NSPostingStyle")
public final class NSPostingStyle extends ObjCEnum {
    
    @GlobalConstant("NSPostWhenIdle")
    public static final long WhenIdle = 1L;
    @GlobalConstant("NSPostASAP")
    public static final long ASAP = 2L;
    @GlobalConstant("NSPostNow")
    public static final long Now = 3L;


}
