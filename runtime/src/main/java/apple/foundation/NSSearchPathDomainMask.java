package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


@Library("Foundation/Foundation.h")
@Mapping("NSSearchPathDomainMask")
public final class NSSearchPathDomainMask extends ObjCEnum {
    
    @GlobalConstant("NSUserDomainMask")
    public static final long UserDomainMask = 1L;
    @GlobalConstant("NSLocalDomainMask")
    public static final long LocalDomainMask = 2L;
    @GlobalConstant("NSNetworkDomainMask")
    public static final long NetworkDomainMask = 4L;
    @GlobalConstant("NSSystemDomainMask")
    public static final long SystemDomainMask = 8L;
    @GlobalConstant("NSAllDomainsMask")
    public static final long AllDomainsMask = 65535L;


}
