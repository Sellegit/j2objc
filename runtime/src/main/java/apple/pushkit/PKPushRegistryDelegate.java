package apple.pushkit;


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
import apple.dispatch.*;


@Library("PushKit/PushKit.h") @Mapping("PKPushRegistryDelegate")
public interface PKPushRegistryDelegate 
    extends NSObjectProtocol {

    
    


    
    @Mapping("pushRegistry:didUpdatePushCredentials:forType:")
    void didUpdatePushCredentials(PKPushRegistry registry, PKPushCredentials credentials, String type);
    @Mapping("pushRegistry:didReceiveIncomingPushWithPayload:forType:")
    void didReceiveIncomingPush(PKPushRegistry registry, PKPushPayload payload, String type);
    @Mapping("pushRegistry:didInvalidatePushTokenForType:")
    void didInvalidatePushToken(PKPushRegistry registry, String type);

    /*<adapter>*/
    /*</adapter>*/
}
