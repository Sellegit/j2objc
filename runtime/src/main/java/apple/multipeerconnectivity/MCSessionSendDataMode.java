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
@Mapping("MCSessionSendDataMode")
public final class MCSessionSendDataMode extends ObjCEnum {
    
    @GlobalConstant("MCSessionSendDataReliable")
    public static final long Reliable = 0L;
    @GlobalConstant("MCSessionSendDataUnreliable")
    public static final long Unreliable = 1L;
    

}
