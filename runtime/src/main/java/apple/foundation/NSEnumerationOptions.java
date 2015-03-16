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
@Mapping("NSEnumerationOptions")
public final class NSEnumerationOptions extends ObjCEnum {
    
    @GlobalConstant("NSEnumerationConcurrent")
    public static final long Concurrent = 1L;
    @GlobalConstant("NSEnumerationReverse")
    public static final long Reverse = 2L;
    

}
