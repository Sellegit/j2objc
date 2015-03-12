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


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreFoundation")
public class CFSocket 
    extends CFType 
     {

    
    
    protected CFSocket() {}
    
    
    
    
    @GlobalFunction("CFSocketGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFSocketCreate")
    public static native CFSocket create(CFAllocator allocator, int protocolFamily, int socketType, int protocol, @MachineSizedUInt long callBackTypes, FunctionPtr callout, CFSocketContext context);
    @GlobalFunction("CFSocketCreateWithNative")
    public static native CFSocket createWithNative(CFAllocator allocator, int sock, @MachineSizedUInt long callBackTypes, FunctionPtr callout, CFSocketContext context);
    @GlobalFunction("CFSocketCreateWithSocketSignature")
    public static native CFSocket createWithSocketSignature(CFAllocator allocator, CFSocketSignature signature, @MachineSizedUInt long callBackTypes, FunctionPtr callout, CFSocketContext context);
    @GlobalFunction("CFSocketCreateConnectedToSocketSignature")
    public static native CFSocket createConnectedToSocketSignature(CFAllocator allocator, CFSocketSignature signature, @MachineSizedUInt long callBackTypes, FunctionPtr callout, CFSocketContext context, double timeout);
    @GlobalFunction("CFSocketSetAddress")
    public native CFSocketError setAddress(CFData address);
    @GlobalFunction("CFSocketConnectToAddress")
    public native CFSocketError connectToAddress(CFData address, double timeout);
    @GlobalFunction("CFSocketInvalidate")
    public native void invalidate();
    @GlobalFunction("CFSocketIsValid")
    public native boolean isValid();
    @GlobalFunction("CFSocketCopyAddress")
    public native CFData copyAddress();
    @GlobalFunction("CFSocketCopyPeerAddress")
    public native CFData copyPeerAddress();
    @GlobalFunction("CFSocketGetContext")
    public native void getContext(CFSocketContext context);
    @GlobalFunction("CFSocketGetNative")
    public native int getNative();
    @GlobalFunction("CFSocketCreateRunLoopSource")
    public static native CFRunLoopSource createRunLoopSource(CFAllocator allocator, CFSocket s, @MachineSizedSInt long order);
    @GlobalFunction("CFSocketGetSocketFlags")
    public native CFSocketFlags getSocketFlags();
    @GlobalFunction("CFSocketSetSocketFlags")
    public native void setSocketFlags(@MachineSizedUInt long flags);
    @GlobalFunction("CFSocketDisableCallBacks")
    public native void disableCallBacks(@MachineSizedUInt long callBackTypes);
    @GlobalFunction("CFSocketEnableCallBacks")
    public native void enableCallBacks(@MachineSizedUInt long callBackTypes);
    @GlobalFunction("CFSocketSendData")
    public native CFSocketError sendData(CFData address, CFData data, double timeout);
    @GlobalFunction("CFSocketRegisterValue")
    public static native CFSocketError registerValue(CFSocketSignature nameServerSignature, double timeout, String name, CFType value);
    @GlobalFunction("CFSocketCopyRegisteredValue")
    public static native CFSocketError copyRegisteredValue(CFSocketSignature nameServerSignature, double timeout, String name, Todo value, Todo nameServerAddress);
    @GlobalFunction("CFSocketRegisterSocketSignature")
    public static native CFSocketError registerSocketSignature(CFSocketSignature nameServerSignature, double timeout, String name, CFSocketSignature signature);
    @GlobalFunction("CFSocketCopyRegisteredSocketSignature")
    public static native CFSocketError copyRegisteredSocketSignature(CFSocketSignature nameServerSignature, double timeout, String name, CFSocketSignature signature, Todo nameServerAddress);
    @GlobalFunction("CFSocketUnregister")
    public static native CFSocketError unregister(CFSocketSignature nameServerSignature, double timeout, String name);
    @GlobalFunction("CFSocketSetDefaultNameRegistryPortNumber")
    public static native void setDefaultNameRegistryPortNumber(short port);
    @GlobalFunction("CFSocketGetDefaultNameRegistryPortNumber")
    public static native short getDefaultNameRegistryPortNumber();
    
}
