package apple.social;


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
import apple.uikit.*;
import apple.accounts.*;





@Library("Social")
@Mapping("SLRequestMethod")
public final class SLRequestMethod extends ObjCEnum {
    
    @GlobalConstant("SLRequestMethodGET")
    public static final long GET = 0L;
    @GlobalConstant("SLRequestMethodPOST")
    public static final long POST = 1L;
    @GlobalConstant("SLRequestMethodDELETE")
    public static final long DELETE = 2L;
    @GlobalConstant("SLRequestMethodPUT")
    public static final long PUT = 3L;
    

}
