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





@Library("CoreFoundation/CoreFoundation.h")
@Mapping("CFFileDescriptorCallBackType")
public final class CFFileDescriptorCallBackType extends ObjCEnum {
    
    @GlobalConstant("kCFFileDescriptorReadCallBack")
    public static final long ReadCallBack = 1L;
    @GlobalConstant("kCFFileDescriptorWriteCallBack")
    public static final long WriteCallBack = 2L;
    

}
