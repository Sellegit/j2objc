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


@Library("CFNetwork/CFNetwork.h")
@Mapping("CFNetDiagnosticStatus")
public final class CFNetDiagnosticStatus extends ObjCEnum {
    
    @GlobalConstant("kCFNetDiagnosticNoErr")
    public static final long NoErr = 0L;
    @GlobalConstant("kCFNetDiagnosticErr")
    public static final long Err = -66560L;
    @GlobalConstant("kCFNetDiagnosticConnectionUp")
    public static final long ConnectionUp = -66559L;
    @GlobalConstant("kCFNetDiagnosticConnectionIndeterminate")
    public static final long ConnectionIndeterminate = -66558L;
    @GlobalConstant("kCFNetDiagnosticConnectionDown")
    public static final long ConnectionDown = -66557L;


}
