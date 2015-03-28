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


@Mapping("CFSocketSignature") @Library("CoreFoundation/CoreFoundation.h")
public class CFSocketSignature 
    extends Struct 
     {

    
    private CFSocketSignature() {}
    
    
    @DotMapping("protocolFamily")
    public native int getProtocolFamily();
    @DotMapping("socketType")
    public native int getSocketType();
    @DotMapping("protocol")
    public native int getProtocol();
    @DotMapping("address")
    public native CFData getAddress();

    
}
