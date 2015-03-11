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
@Mapping("CFPropertyListFormat")
public final class CFPropertyListFormat extends ObjCEnum {
    
    @GlobalConstant("kCFPropertyListOpenStepFormat")
    public static final long OpenStepFormat = 1L;
    @GlobalConstant("kCFPropertyListXMLFormat_v1_0")
    public static final long XMLFormat_v1_0 = 100L;
    @GlobalConstant("kCFPropertyListBinaryFormat_v1_0")
    public static final long BinaryFormat_v1_0 = 200L;
    

}
