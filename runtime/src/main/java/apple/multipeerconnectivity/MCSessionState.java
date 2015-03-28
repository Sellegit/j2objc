package apple.multipeerconnectivity;


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
import apple.security.*;


/**
 * @since Available in iOS 7.0 and later.
 */
@Library("MultipeerConnectivity/MultipeerConnectivity.h")
@Mapping("MCSessionState")
public final class MCSessionState extends ObjCEnum {
    
    @GlobalConstant("MCSessionStateNotConnected")
    public static final long NotConnected = 0L;
    @GlobalConstant("MCSessionStateConnecting")
    public static final long Connecting = 1L;
    @GlobalConstant("MCSessionStateConnected")
    public static final long Connected = 2L;


}
