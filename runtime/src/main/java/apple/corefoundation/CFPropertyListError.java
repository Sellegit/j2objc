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



/**
 * @since Available in iOS 4.0 and later.
 */

@Library("CoreFoundation")
@Mapping("CFPropertyListError")
public final class CFPropertyListError extends ObjCEnum {
    
    @GlobalConstant("kCFPropertyListReadCorruptError")
    public static final long ReadCorruptError = 3840L;
    @GlobalConstant("kCFPropertyListReadUnknownVersionError")
    public static final long ReadUnknownVersionError = 3841L;
    @GlobalConstant("kCFPropertyListReadStreamError")
    public static final long ReadStreamError = 3842L;
    @GlobalConstant("kCFPropertyListWriteStreamError")
    public static final long WriteStreamError = 3851L;
    

}
