package apple.coreservices;


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
import apple.foundation.*;





@Library("CFNetwork")
@Mapping("CFNetServiceBrowserFlags")
public final class CFNetServiceBrowserFlags extends ObjCEnum {
    
    @GlobalConstant("kCFNetServiceFlagMoreComing")
    public static final long MoreComing = 1L;
    @GlobalConstant("kCFNetServiceFlagIsDomain")
    public static final long IsDomain = 2L;
    @GlobalConstant("kCFNetServiceFlagIsDefault")
    public static final long IsDefault = 4L;
    @GlobalConstant("kCFNetServiceFlagRemove")
    public static final long Remove = 8L;
    

}
