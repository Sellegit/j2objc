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






@Mapping("CFHostInfoType")
public final class CFHostInfoType extends ObjCEnum {
    
    @GlobalConstant("kCFHostAddresses")
    public static final long Addresses = 0L;
    @GlobalConstant("kCFHostNames")
    public static final long Names = 1L;
    @GlobalConstant("kCFHostReachability")
    public static final long Reachability = 2L;
    

}
