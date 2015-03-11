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





@Library("CoreFoundation")
@Mapping("CFURLPathStyle")
public final class CFURLPathStyle extends ObjCEnum {
    
    @GlobalConstant("kCFURLPOSIXPathStyle")
    public static final long POSIXPathStyle = 0L;
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLHFSPathStyle")
    public static final long HFSPathStyle = 1L;
    @GlobalConstant("kCFURLWindowsPathStyle")
    public static final long WindowsPathStyle = 2L;
    

}
