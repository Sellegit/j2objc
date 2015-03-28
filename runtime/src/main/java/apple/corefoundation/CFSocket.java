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
@Mapping("CFSocketRef") @Library("CoreFoundation/CoreFoundation.h")
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
    public static native CFSocketError setAddress(CFSocket s, CFData address);
    @GlobalFunction("CFSocketConnectToAddress")
    public static native CFSocketError connectToAddress(CFSocket s, CFData address, double timeout);
    @GlobalFunction("CFSocketInvalidate")
    public static native void invalidate(CFSocket s);
    @GlobalFunction("CFSocketIsValid")
    public static native boolean isValid(CFSocket s);
    @GlobalFunction("CFSocketCopyAddress")
    public static native CFData copyAddress(CFSocket s);
    @GlobalFunction("CFSocketCopyPeerAddress")
    public static native CFData copyPeerAddress(CFSocket s);
    @GlobalFunction("CFSocketGetContext")
    public static native void getContext(CFSocket s, CFSocketContext context);
    @GlobalFunction("CFSocketGetNative")
    public static native int getNative(CFSocket s);
    @GlobalFunction("CFSocketCreateRunLoopSource")
    public static native CFRunLoopSource createRunLoopSource(CFAllocator allocator, CFSocket s, @MachineSizedSInt long order);
    @GlobalFunction("CFSocketGetSocketFlags")
    public static native CFSocketFlags getSocketFlags(CFSocket s);
    @GlobalFunction("CFSocketSetSocketFlags")
    public static native void setSocketFlags(CFSocket s, @MachineSizedUInt long flags);
    @GlobalFunction("CFSocketDisableCallBacks")
    public static native void disableCallBacks(CFSocket s, @MachineSizedUInt long callBackTypes);
    @GlobalFunction("CFSocketEnableCallBacks")
    public static native void enableCallBacks(CFSocket s, @MachineSizedUInt long callBackTypes);
    @GlobalFunction("CFSocketSendData")
    public static native CFSocketError sendData(CFSocket s, CFData address, CFData data, double timeout);
    @GlobalFunction("CFSocketRegisterValue")
    public static native CFSocketError registerValue(CFSocketSignature nameServerSignature, double timeout, CFString name, CFPropertyListRef value);
    @GlobalFunction("CFSocketCopyRegisteredValue")
    public static native CFSocketError copyRegisteredValue(CFSocketSignature nameServerSignature, double timeout, CFString name, Todo value, Todo nameServerAddress);
    @GlobalFunction("CFSocketRegisterSocketSignature")
    public static native CFSocketError registerSocketSignature(CFSocketSignature nameServerSignature, double timeout, CFString name, CFSocketSignature signature);
    @GlobalFunction("CFSocketCopyRegisteredSocketSignature")
    public static native CFSocketError copyRegisteredSocketSignature(CFSocketSignature nameServerSignature, double timeout, CFString name, CFSocketSignature signature, Todo nameServerAddress);
    @GlobalFunction("CFSocketUnregister")
    public static native CFSocketError unregister(CFSocketSignature nameServerSignature, double timeout, CFString name);
    @GlobalFunction("CFSocketSetDefaultNameRegistryPortNumber")
    public static native void setDefaultNameRegistryPortNumber(short port);
    @GlobalFunction("CFSocketGetDefaultNameRegistryPortNumber")
    public static native short getDefaultNameRegistryPortNumber();

}
