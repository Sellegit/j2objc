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





@Mapping("CFSocketSignature")
public class CFSocketSignature 
    extends Struct 
     {

    
    protected CFSocketSignature() {}
    
    
    @DotMapping("protocolFamily")
    public native int getProtocolFamily();
    @DotMapping("socketType")
    public native int getSocketType();
    @DotMapping("protocol")
    public native int getProtocol();
    @DotMapping("address")
    public native CFData getAddress();
    
    public static native CFSocketSignature create(int protocolFamily, int socketType, int protocol, CFData address) /*-[
        CFSocketSignature __new = { .protocolFamily = protocolFamily, .socketType = socketType, .protocol = protocol, .address = address };
        return __new;
    ]-*/;
    public static native CFSocketSignature copyWithprotocolFamily(CFSocketSignature original, int protocolFamily) /*-[
        original.protocolFamily = protocolFamily;
        return __new;
    ]-*/;

    
    public static native CFSocketSignature copyWithsocketType(CFSocketSignature original, int socketType) /*-[
        original.socketType = socketType;
        return __new;
    ]-*/;

    
    public static native CFSocketSignature copyWithprotocol(CFSocketSignature original, int protocol) /*-[
        original.protocol = protocol;
        return __new;
    ]-*/;

    
    public static native CFSocketSignature copyWithaddress(CFSocketSignature original, CFData address) /*-[
        original.address = address;
        return __new;
    ]-*/;

    
}
