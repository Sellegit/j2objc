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
@Mapping("CFSocketCallBackType")
public final class CFSocketCallBackType extends ObjCEnum {
    
    @GlobalConstant("kCFSocketNoCallBack")
    public static final long NoCallBack = 0L;
    @GlobalConstant("kCFSocketReadCallBack")
    public static final long ReadCallBack = 1L;
    @GlobalConstant("kCFSocketAcceptCallBack")
    public static final long AcceptCallBack = 2L;
    @GlobalConstant("kCFSocketDataCallBack")
    public static final long DataCallBack = 3L;
    @GlobalConstant("kCFSocketConnectCallBack")
    public static final long ConnectCallBack = 4L;
    @GlobalConstant("kCFSocketWriteCallBack")
    public static final long WriteCallBack = 8L;
    

}
