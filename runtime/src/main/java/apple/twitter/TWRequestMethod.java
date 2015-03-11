package apple.twitter;


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
import apple.social.*;
import apple.accounts.*;





@Library("Twitter")
@Mapping("TWRequestMethod")
public final class TWRequestMethod extends ObjCEnum {
    
    @GlobalConstant("TWRequestMethodGET")
    public static final long GET = 0L;
    @GlobalConstant("TWRequestMethodPOST")
    public static final long POST = 1L;
    @GlobalConstant("TWRequestMethodDELETE")
    public static final long DELETE = 2L;
    

}
