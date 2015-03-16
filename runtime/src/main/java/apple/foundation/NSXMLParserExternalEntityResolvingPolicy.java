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
@Mapping("NSXMLParserExternalEntityResolvingPolicy")
public final class NSXMLParserExternalEntityResolvingPolicy extends ObjCEnum {
    
    @GlobalConstant("NSXMLParserResolveExternalEntitiesNever")
    public static final long Never = 0L;
    @GlobalConstant("NSXMLParserResolveExternalEntitiesNoNetwork")
    public static final long NoNetwork = 1L;
    @GlobalConstant("NSXMLParserResolveExternalEntitiesSameOriginOnly")
    public static final long SameOriginOnly = 2L;
    @GlobalConstant("NSXMLParserResolveExternalEntitiesAlways")
    public static final long Always = 3L;
    

}
