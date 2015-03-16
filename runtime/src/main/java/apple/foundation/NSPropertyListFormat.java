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
@Mapping("NSPropertyListFormat")
public final class NSPropertyListFormat extends ObjCEnum {
    
    @GlobalConstant("NSPropertyListOpenStepFormat")
    public static final long OpenStep = 1L;
    @GlobalConstant("NSPropertyListXMLFormat_v1_0")
    public static final long XMLFormat_v1_0 = 100L;
    @GlobalConstant("NSPropertyListBinaryFormat_v1_0")
    public static final long BinaryFormat_v1_0 = 200L;
    

}
