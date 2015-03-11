package apple.addressbook;


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






@Mapping("ABSourceType")
public final class ABSourceType extends ObjCEnum {
    
    @GlobalConstant("kABSourceTypeLocal")
    public static final long Local = 0L;
    @GlobalConstant("kABSourceTypeExchange")
    public static final long Exchange = 1L;
    @GlobalConstant("kABSourceTypeExchangeGAL")
    public static final long ExchangeGAL = 16777217L;
    @GlobalConstant("kABSourceTypeMobileMe")
    public static final long MobileMe = 2L;
    @GlobalConstant("kABSourceTypeLDAP")
    public static final long LDAP = 16777219L;
    @GlobalConstant("kABSourceTypeCardDAV")
    public static final long CardDAV = 4L;
    @GlobalConstant("kABSourceTypeCardDAVSearch")
    public static final long CardDAVSearch = 16777220L;
    

}
