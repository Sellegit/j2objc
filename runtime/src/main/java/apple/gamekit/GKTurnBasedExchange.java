package apple.gamekit;


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



/**
 * @since Available in iOS 7.0 and later.
 */

@Library("GameKit") @Mapping("GKTurnBasedExchange")
public class GKTurnBasedExchange 
    extends NSObject 
     {

    
    
    public GKTurnBasedExchange() {}
    
    
    @Mapping("exchangeID")
    public native String getExchangeID();
    @Mapping("sender")
    public native GKTurnBasedParticipant getSender();
    @Mapping("recipients")
    public native NSArray<GKTurnBasedParticipant> getRecipients();
    @Mapping("status")
    public native GKTurnBasedExchangeStatus getStatus();
    @Mapping("message")
    public native String getMessage();
    @Mapping("data")
    public native NSData getData();
    @Mapping("sendDate")
    public native NSDate getSendDate();
    @Mapping("timeoutDate")
    public native NSDate getTimeoutDate();
    @Mapping("completionDate")
    public native NSDate getCompletionDate();
    @Mapping("replies")
    public native NSArray<GKTurnBasedExchangeReply> getReplies();
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("GKExchangeTimeoutDefault")
    public static native double getDefaultTimeout();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("GKExchangeTimeoutNone")
    public static native double getNoneTimeout();
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("cancelWithLocalizableMessageKey:arguments:completionHandler:")
    public native void cancel(String key, NSArray<?> arguments, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("replyWithLocalizableMessageKey:arguments:data:completionHandler:")
    public native void reply(String key, NSArray<?> arguments, NSData data, @Block VoidBlock1<NSError> completionHandler);
    
}
