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
@Mapping("CFURLComponentType")
public final class CFURLComponentType extends ObjCEnum {
    
    @GlobalConstant("kCFURLComponentScheme")
    public static final long Scheme = 1L;
    @GlobalConstant("kCFURLComponentNetLocation")
    public static final long NetLocation = 2L;
    @GlobalConstant("kCFURLComponentPath")
    public static final long Path = 3L;
    @GlobalConstant("kCFURLComponentResourceSpecifier")
    public static final long ResourceSpecifier = 4L;
    @GlobalConstant("kCFURLComponentUser")
    public static final long User = 5L;
    @GlobalConstant("kCFURLComponentPassword")
    public static final long Password = 6L;
    @GlobalConstant("kCFURLComponentUserInfo")
    public static final long UserInfo = 7L;
    @GlobalConstant("kCFURLComponentHost")
    public static final long Host = 8L;
    @GlobalConstant("kCFURLComponentPort")
    public static final long Port = 9L;
    @GlobalConstant("kCFURLComponentParameterString")
    public static final long ParameterString = 10L;
    @GlobalConstant("kCFURLComponentQuery")
    public static final long Query = 11L;
    @GlobalConstant("kCFURLComponentFragment")
    public static final long Fragment = 12L;
    

}
